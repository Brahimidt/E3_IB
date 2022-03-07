package com.example.e3_ib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String value="";
        Bundle extra = getIntent().getExtras();
        if (extra != null){
         value = "value";
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        affiche(value);
    }

    void affiche(String value){

        if(value =="value"){

            ImageView img= (ImageView) findViewById(R.id.imageView);
            img.setImageResource(R.drawable._366_2000);
            TextView Name= (TextView)findViewById(R.id.Name);
            TextView Schedul= (TextView)findViewById(R.id.Schedul);
            TextView Subject= (TextView)findViewById(R.id.Subject);
            TextView Teacher= (TextView)findViewById(R.id.Teacher);
            Name.setText("Android");
            Schedul.setText("Every Monday");
            Subject.setText("How to create Beautiful Apps");
            Teacher.setText("M.R.");

        }else{
            ImageView img= (ImageView) findViewById(R.id.imageView);
            img.setImageResource(R.drawable.spe_maths_image);

            TextView Name= (TextView)findViewById(R.id.Name);
            TextView Schedul= (TextView)findViewById(R.id.Schedul);
            TextView Subject= (TextView)findViewById(R.id.Subject);
            TextView Teacher= (TextView)findViewById(R.id.Teacher);

            Name.setText("Maths");
            Schedul.setText("Every Thursday");
            Subject.setText("How to make fourier transform");
            Teacher.setText("T.S");

        }
    }
}