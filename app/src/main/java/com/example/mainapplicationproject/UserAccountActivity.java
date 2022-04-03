package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// User account activity. Allows user to return to MainActivity, open MealMenuActivity, open user's
//recipes (UserRecipes) and delete their account. Functionality to delete account has not been added.

public class UserAccountActivity extends AppCompatActivity {

    private Button menuButton;
    private Button recipesButton;
    private Button yourRecipesButton;
    private Button deleteAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_accouut);

        // Creates back arrow to return to Main activity.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set action bar to black
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        //Code to set on click listeners to buttons.
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

    // Methods to moved to different activities.
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
//        // Delete user account. Functionality has not been added.
//    }
}