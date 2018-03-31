package com.example.chady.artifacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Chady on 3/24/2018.
 */

public class Signup extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void OnUserSignUpClick (View v)
    {
        if(v.getId() == R.id.BuserSignUp)
        {
            Intent i = new Intent(Signup.this, MainActivity.class);
            startActivity(i);

        }
    }

}
