package com.example.mainapplicationproject;

//First activity displayed when app is open. Allows user to login and access their account and
// allows users who do not have accounts to access all stored recipes.
// Recipes button takes users to "MealMenuActivity".

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button Account;
    private Button mealMenuButton;
    // Variable used to determine if users already logged in.
    // Once proper functionality is added, coding will change variable to true after users logged in.
    public boolean logged_in = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set action bar to black
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));


        // Code to link button to method.
        loginButton = (Button) findViewById(R.id.buttonLogin);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        // Code to link button to method.
        Account = (Button) findViewById(R.id.openUserAccountButton);
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //If statement to determine which method to call based on users logged in status.
                if (logged_in = false) {
                    openLogin();
                } else {
                    openAccount();
                }
            }
        });

        // Code to link button to method.
        mealMenuButton = (Button) findViewById(R.id.buttonMealMenu);
        mealMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMealMenu();
            }
        });
    }

    //Methods to open different activities based on which button is clicked.
    public void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openAccount() {
        Intent intent = new Intent(this, UserAccountActivity.class);
        startActivity(intent);
    }

    public void openMealMenu() {
        Intent intent = new Intent(this, MealMenuActivity.class);
        startActivity(intent);
    }
}
