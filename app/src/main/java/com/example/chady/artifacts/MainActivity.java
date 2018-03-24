package com.example.chady.artifacts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ///When the user clicks Login ... Brings user to the login screen
    public void onLoginClick(View view){
        Intent i = new Intent(MainActivity.this, Login_Page.class);
        startActivity(i);
    }
    //When the user clicks Sign Up ... Brings User to the sign up screen
    public void onSignUpClick(View view){
        Intent i = new Intent(MainActivity.this, Signup.class);
        startActivity(i);
    }
}
