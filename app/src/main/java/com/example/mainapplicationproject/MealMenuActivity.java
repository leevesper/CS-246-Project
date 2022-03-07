package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MealMenuActivity extends AppCompatActivity {

    private Button breakfastButton;
    private Button lunchButton;
    private Button dinnerButton;
    private Button desertButton;
    public String selection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meal_menu);

        ////////
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        breakfastButton = (Button) findViewById(R.id.buttonFruits);
        breakfastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "breakfast";
                openFoodCatMenu();
                }
            }
        );

        lunchButton = (Button) findViewById(R.id.buttonVegetables);
        lunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "lunch";
                openFoodCatMenu();

            }
        });

        dinnerButton = (Button) findViewById(R.id.buttonGrains);
        dinnerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "dinner";
                openFoodCatMenu();

            }
        });

        desertButton = (Button) findViewById(R.id.buttonProteinFoods);
        desertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selection = "dinner";
                openFoodCatMenu();

            }
        });
    }
    public void openFoodCatMenu() {
        Intent intent = new Intent(this, FoodCatMenuActivity.class);
        //pass "selection" variable to 'foodCatMenuActivity'
        startActivity(intent);

    };
}