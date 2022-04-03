package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

// This activity is designed to help filter which recipes will be shown to the user from the main
// recipe database. When the user clicked one of the four buttons, a variable is assigned based on
// which button is clicked and the variable will be passed to the next activity and used to filter
// which recipes will be shown based on the category selected.

// Main database and functionality to pass variable to the next activity has not been created.

public class MealMenuActivity extends AppCompatActivity {

    private Button breakfastButton;
    private Button lunchButton;
    private Button dinnerButton;
    private Button desertButton;
    //Variable to hold the selection variable to pass to the next activity.
    public String selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_menu);

        // Creates action bar and sets action bar color to black.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        breakfastButton = (Button) findViewById(R.id.buttonFruits);
        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "Breakfast";
                openFoodCatMenu();
                }
            }
        );

        lunchButton = (Button) findViewById(R.id.buttonVegetables);
        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "Lunch";
                openFoodCatMenu();

            }
        });

        dinnerButton = (Button) findViewById(R.id.buttonGrains);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "Dinner";
                openFoodCatMenu();

            }
        });

        desertButton = (Button) findViewById(R.id.buttonProteinFoods);
        desertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "Desert";
                openFoodCatMenu();

            }
        });
    }
    public void openFoodCatMenu() {
        Intent intent = new Intent(this, FoodCatMenuActivity.class);
        //pass "selection" variable to 'foodCatMenuActivity'
        intent.putExtra("mealCatKey", selection);
        startActivity(intent);

    };
}