package com.example.sing_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login,singUp,btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    login= findViewById(R.id.blnSingin);
    btn1=findViewById(R.id.btn1);
    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent i= new Intent(Intent.ACTION_VIEW);
            Uri.parse("https://fonts.google.com/");
            startActivity(i);
        }
    });
    singUp= findViewById(R.id.btnSingup);
    login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent gotoHomepage= new Intent(MainActivity.this,Homepage.class);
            startActivity(gotoHomepage);

        }
    });


    singUp.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent gotoRegistration= new Intent(MainActivity.this,Registration.class);
            startActivity(gotoRegistration);
        }
    });

    }

}