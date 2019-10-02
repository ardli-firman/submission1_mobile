package com.ardli.submission1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ardli.submission1.activity.Gofood;
import com.ardli.submission1.activity.Gomart;
import com.ardli.submission1.activity.Goride;
import com.ardli.submission1.activity.Gosend;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_history,
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
    }

    public void goFood(View v){
        Intent intent = new Intent(this, Gofood.class);
        startActivity(intent);
    }

    public void goRide(View v){
        Intent intent = new Intent(this, Goride.class);
        startActivity(intent);
    }

    public void goSend(View v){
        Intent intent = new Intent(this, Gosend.class);
        startActivity(intent);
    }

    public void goMart(View v){
        Intent intent = new Intent(this, Gomart.class);
        startActivity(intent);
    }

}
