package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserAccountActivity extends AppCompatActivity {

    private Button menuButton;
    private Button recipesButton;
    private Button yourRecipesButton;
    private Button deleteAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_accouut);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        menuButton = (Button) findViewById(R.id.userAccountMenuButton);
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainMenu();
            }
        });
        recipesButton = (Button) findViewById(R.id.userAccountRecipesButton);
        recipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMealMenu();
            }
        });
        yourRecipesButton = (Button) findViewById(R.id.userAccountYRButton);
        yourRecipesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserRecipes();
            }
        });
        deleteAccountButton = (Button) findViewById(R.id.deleteAccountButton);
        deleteAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openUserRecipes();
            }
        });
    }
    public void openMainMenu() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void openMealMenu() {
        Intent intent = new Intent(this, MealMenuActivity.class);
        startActivity(intent);
    }
    public void openUserRecipes() {
        // Pass user id to "UserRecipesActivity".
        Intent intent = new Intent(this, UserRecipesActivity.class);
        startActivity(intent);
    }
//    public void deleteAccount() {
//        // Delete user account
//    }
}