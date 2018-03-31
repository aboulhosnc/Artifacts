package com.example.chady.artifacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by michaelpoblacion1 on 3/24/18.
import android.os.Bundle;

/**
 * Created by Chady on 3/25/2018.
 */

public class HomeScreen extends Activity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);

        mAuth = FirebaseAuth.getInstance();
    }


    public void onArtifactsClick(View view) {
        Intent i = new Intent(HomeScreen.this, ArtifactsPage.class);
        startActivity(i);

    }

    public void onCollectorsClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onProfileClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onMapsClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onChatClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onCalendarClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onNotificationsClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onSettingsClick(View view) {
        System.out.println("Button Clicked");
    }

    public void onLogoutClick(View view) {
        startActivity(new Intent(HomeScreen.this, Login_Page.class));
    }
}
