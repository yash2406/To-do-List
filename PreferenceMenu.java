package com.example.rypta.nthexam;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PreferenceMenu extends AppCompatActivity {
    RadioButton r1;
    RadioGroup RR;
    Button logout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preference_menu);
        RR=(RadioGroup)findViewById(R.id.check);
        logout=(Button)findViewById(R.id.button);
        final SharedPreferences sp;
        final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        sp = getSharedPreferences("login",MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sp.edit().putString("username","").apply();
                editor.commit();

                Intent ii1 = new Intent(PreferenceMenu.this,MainActivity.class);
                startActivity(ii1);

            }
        });
        Log.i("username",sp.getString("username", null));
        RR.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                    case R.id.R1:

                        sp.edit().putString(sp.getString("username", null),"GATE").apply();
                        //Implement logic
                        break;
                    case R.id.R2:

                        sp.edit().putString(sp.getString("username", null),"CAT").apply();
                        //Implement logic
                        break;
                    case R.id.R3:
                        sp.edit().putString(sp.getString("username", null),"IIT").apply();

                        //Implement logic
                        break;
                }
                //SharedPreferences preferencesq = PreferenceManager.getDefaultSharedPreferences(PreferenceMenu.this);
                String key = sp.getString("key", "GATE");
                Log.i("keyyd",key);

            }
        });

    }

    @Override
    public void onBackPressed() {
        Log.i("helo","hejekd");
        Intent i=new Intent(PreferenceMenu.this,PostLogin.class);
        startActivity(i);
        super.onBackPressed();
    }
}
