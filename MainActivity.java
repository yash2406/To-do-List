package com.example.rypta.nthexam;


import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.example.rypta.nthexam.Views.CustomView;

import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow(). requestFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        CustomView customView=new CustomView(this);
        final SharedPreferences sp;
        sp = getSharedPreferences("login",MODE_PRIVATE);
        String unamee = sp.getString("username", null);
        if(unamee!=null&&!unamee.equals(""))
        {
            Intent i = new Intent(MainActivity.this,PostLogin.class);
            startActivity(i);
        }
        final TextView uname, passwd;
        Button signup, login;

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String key = preferences.getString("key", null);
        final SharedPreferences.Editor editor = preferences.edit();
        if(key!=null)
            Log.i("mssg",key);
        if(key!=null)
        {
            Intent i = new Intent(MainActivity.this,PostLogin.class);
            startActivity(i);
        }
        uname = (TextView) findViewById(R.id.uname);
        passwd = (TextView) findViewById(R.id.passwd);
        uname.setText("");
        passwd.setText("");
        signup = (Button) findViewById(R.id.signupb);
        login = (Button) findViewById(R.id.loginb);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Register.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String u=null,p=null;
                int idx,jidx,flag=0;
                String userName=uname.getText().toString();
                String Password=passwd.getText().toString();
                SQLiteDatabase mydb=null;
                try {
                    mydb = openOrCreateDatabase("Users", MODE_PRIVATE, null);
                    Log.i("hekkf","hfjsf");
                    mydb.execSQL("CREATE TABLE IF NOT EXISTS userinfo (userName VARCHAR, Password VARCHAR,FirstName VARCHAR,LastName VARCHAR,Email VARCHAR) ");
                    Cursor c = mydb.rawQuery("SELECT * FROM userinfo", null);
                    Log.i("make",c+" ");
                    if(c==null)
                    {
                        Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        idx = c.getColumnIndex("userName");
                        jidx = c.getColumnIndex("Password");
                        if(c.moveToFirst()) {
                            while (c != null) {
                                if (c.getString(idx).equals(userName) && c.getString(jidx).equals(Password)) {
                                    flag = 1;
                                }
                                if(c.moveToNext())
                                {

                                }
                                else
                                {
                                    break;
                                }
                            }
                            Log.i("flag", flag + "");
                            if (flag == 1) {

                                sp.edit().putString("username", uname.getText().toString()).apply();
                                Intent i = new Intent(MainActivity.this, PostLogin.class);
                                startActivity(i);
                            } else {
                                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                    mydb.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }


        }

        });
    }
}