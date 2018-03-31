package com.example.chady.artifacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by Chady on 3/24/2018.
 * Edited by Michael on 3/24/2018.
 *
 */



public class Login_Page extends Activity {

    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);

        mAuth = FirebaseAuth.getInstance();
    }

    public void onUserLoginClick(View v){

        if(v.getId() == R.id.BuserLogin)
        {
            Intent i = new Intent(Login_Page.this, HomeScreen.class);
            startActivity(i);

        }

        //IF-ELSE STATEMENT TO BE IMPLEMENTED USER IS SIGNED UP AND MATCHES DATABASE validateLogin()


    }
    //public boolean validateLogin();

}


