package com.example.chady.artifacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Chady on 3/24/2018.
 * Edited by Michael on 3/24/2018.
 *
 */

public class Login_Page extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
    }







    public void onUserLoginClick(View view){

        //IF-ELSE STATEMENT TO BE IMPLEMENTED USER IS SIGNED UP AND MATCHES DATABASE validateLogin()
        Intent i = new Intent(Login_Page.this, HomeScreen.class);
        startActivity(i);

    }
    //public boolean validateLogin();

}


