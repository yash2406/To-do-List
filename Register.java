package com.example.rypta.nthexam;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final TextView fname = (TextView)findViewById(R.id.fname);
        final TextView lname = (TextView)findViewById(R.id.lname);
        final TextView email = (TextView)findViewById(R.id.email);
        final TextView uname = (TextView)findViewById(R.id.uname);
        final TextView passwd = (TextView)findViewById(R.id.passwd);





        Button registerb = (Button)findViewById(R.id.registerb);

        registerb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (fname.getText().toString().isEmpty() || lname.getText().toString() .isEmpty() || passwd.getText().toString().isEmpty()|| email.getText().toString().isEmpty() || uname.getText().toString().isEmpty()) {
                    Toast.makeText(Register.this, "Insert all the details", Toast.LENGTH_SHORT).show();
                } else {
                    String firstName=null,lastName=null,Email=null,userName=null,Password=null;
                    firstName=fname.getText().toString();
                    lastName=lname.getText().toString();
                    Email=email.getText().toString();
                    Password=passwd.getText().toString();
                    userName=uname.getText().toString();

                    int check=0,responseb=0,idx=0;
                    SQLiteDatabase mydb=null;
                    try {
                        mydb = openOrCreateDatabase("Users", MODE_PRIVATE, null);
                        Cursor c = mydb.rawQuery("SELECT * FROM userinfo", null);
                        idx = c.getColumnIndex("userName");
                        if(c.moveToFirst()) {

                            while (c != null) {
                                if (c.getString(idx).equals(userName)) {
                                    check = 1;
                                }
                                c.moveToNext();
                            }
                        }
                    }
                    catch(Exception e)
                    {
                        e.printStackTrace();
                    }
                    if(check==1)
                    {
                        Toast.makeText(Register.this, "Username Already taken", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        mydb.execSQL("CREATE TABLE IF NOT EXISTS userinfo (userName VARCHAR, Password VARCHAR,FirstName VARCHAR,LastName VARCHAR,Email VARCHAR) ");
                        mydb.execSQL("INSERT INTO userinfo values ('"+userName+"','"+Password+"','"+firstName+"','"+lastName+"','"+Email+"')");
                        Toast.makeText(Register.this, "Registration Successful", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(Register.this, MainActivity.class);
                        startActivity(i);
                    }
                    mydb.close();
                }
            }
        });

    }
}
