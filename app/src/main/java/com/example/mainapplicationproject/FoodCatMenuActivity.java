package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodCatMenuActivity extends AppCompatActivity {

    private Button fruitsButton;
    private Button vegetablesButton;
    private Button grainsButton;
    private Button proteinButton;
    private Button dairyButton;
    public String mealMenuSelection;
    public String foodCatSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cat_menu);

        /////////////
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        fruitsButton = (Button) findViewById(R.id.buttonFruits);
        fruitsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "breakfast";
            openFilteredRecipes();
        }
    }
        );

        vegetablesButton = (Button) findViewById(R.id.buttonVegetables);
        vegetablesButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "lunch";
            openFilteredRecipes();

        }
    });

        grainsButton = (Button) findViewById(R.id.buttonGrains);
        grainsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "dinner";
            openFilteredRecipes();

        }
    });

        proteinButton = (Button) findViewById(R.id.buttonProteinFoods);
        proteinButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "dinner";
            openFilteredRecipes();

        }
    });

        dairyButton = (Button) findViewById(R.id.buttonDairy);
        dairyButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "dinner";
            openFilteredRecipes();

            }
        });

}
    public void openFilteredRecipes() {
        Intent intent = new Intent(this, FoodCatMenuActivity.class);
        //pass "mealMenuSelection" and "foodCatSelection" variables to 'filteredRecipes' activity.
        startActivity(intent);

    };
}