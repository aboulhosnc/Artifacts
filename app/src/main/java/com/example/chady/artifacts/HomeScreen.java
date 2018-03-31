package com.example.chady.artifacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by michaelpoblacion1 on 3/24/18.
 */

public class HomeScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homescreen);
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
