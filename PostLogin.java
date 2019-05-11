package com.example.rypta.nthexam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PostLogin extends AppCompatActivity {

    RecyclerView lv;
    Test adap;
    ArrayList<Profile> prof;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_login);
        lv= (RecyclerView) findViewById(R.id.recyclerV);
        prof=new ArrayList<Profile>();
        prof.clear();

        final SharedPreferences sp;
        //= PreferenceManager.getDefaultSharedPreferences(this);
        sp = getSharedPreferences("login",MODE_PRIVATE);
        //SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        Log.i("Home",sp.getString("username", null));
        String key = sp.getString(sp.getString("username", null), "GATE");
        Log.i("make",key);
       // String key="IIT";
        Fill f=new Fill();
       // f.make();
    try{
        SQLiteDatabase mydb = this.openOrCreateDatabase("Test", MODE_PRIVATE, null);

        // Create the table
        mydb.execSQL("CREATE TABLE IF NOT EXISTS TestDetails (Name VARCHAR, SequenceNumber VARCHAR,CreatedDate VARCHAR,ExamName VARCHAR) ");

        Cursor c =  mydb.rawQuery("SELECT * FROM TestDetails",null);
        Log.i("hekkd","heloo");
        //insert data into the table
        if(!c.moveToFirst()) {
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");

            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/2/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','12/11/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','12/10/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/7/2012','GATE')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','12/6/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','1/5/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','1/8/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','12/12/2012','CAT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test1','1','30/12/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test2','2','22/10/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test3','3','11/9/2012','IIT')");
            mydb.execSQL("INSERT INTO TestDetails values ('Test4','4','10/8/2012','IIT')");
        }

        //delete from database
        //  mydb.execSQL("DELETE FROM TestDetails where stuID = 1");


        //To access data from the table

    }
    catch (Exception e)
    {
        e.printStackTrace();
    }


        String sDate1="DATE";
        prof.add(new Profile("Name","SequenceNumber",sDate1,"ExamName"));
        SQLiteDatabase mydb=null;
        int idx=0,jidx=0,idx1=0,jidx1=0;
        try {
            mydb = this.openOrCreateDatabase("Test", MODE_PRIVATE, null);
            mydb.execSQL("CREATE TABLE IF NOT EXISTS TestDetails (Name VARCHAR, SequenceNumber VARCHAR,CreatedDate VARCHAR,ExamName VARCHAR) ");
            Cursor c = mydb.rawQuery("SELECT * FROM TestDetails", null);
            idx = c.getColumnIndex("Name");
            jidx = c.getColumnIndex("SequenceNumber");
            idx1 = c.getColumnIndex("CreatedDate");
            jidx1 = c.getColumnIndex("ExamName");
            if(c.moveToFirst()) {
                while (c != null) {
                    if(c.getString(jidx1).equals(key))
                      prof.add(new Profile(c.getString(idx),c.getString(jidx),c.getString(idx1),c.getString(jidx1)));
                    if(c.moveToNext())
                    {

                    }
                    else
                    {
                        break;
                    }
                }
            }
            Log.i("size",prof.size()+"");
            mydb.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        adap=new Test(this,prof);
        lv.setHasFixedSize(true);
        lv.setLayoutManager(new LinearLayoutManager(PostLogin.this,LinearLayoutManager.VERTICAL,false));

        lv.setAdapter(adap);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.options,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Intent i=new Intent(PostLogin.this,PreferenceMenu.class);
                startActivity(i);
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}