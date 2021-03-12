package com.example.sing_in;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button login,singUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    login= findViewById(R.id.blnSingin);
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