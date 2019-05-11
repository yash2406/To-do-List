package com.example.rypta.nthexam;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import static android.content.Context.MODE_PRIVATE;

public class Fill extends AppCompatActivity {
    public void make()
    {

        try {

            //Create the database
            Log.i("do","whtaeeryouywant");
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
            }

            //delete from database
            //  mydb.execSQL("DELETE FROM TestDetails where stuID = 1");


            //To access data from the table

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
