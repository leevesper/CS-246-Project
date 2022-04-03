package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//This activity continues to help filter which recipes will be stored in the "FilteredRecipesActivity"
// based on which button the user clicks.

public class FoodCatMenuActivity extends AppCompatActivity {

    private Button fruitsButton;
    private Button vegetablesButton;
    private Button grainsButton;
    private Button proteinButton;
    private Button dairyButton;

    //Variables to be passed to the filtered recipe activity to determine which recipes to display
    // from Maine the database. Main database and code to pass variables to "FilteredRecipeActivity"
    // has not been made.
    public String mealMenuSelection;
    public String foodCatSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_cat_menu);

        // Creates action bar and sets action bar color to black.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        /////////////////
        Bundle mealCatVar = getIntent().getExtras();
        if (mealCatVar != null) {
            mealMenuSelection = mealCatVar.getString("mealCatKey");
        }


        fruitsButton = (Button) findViewById(R.id.buttonFruits);
        fruitsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "Fruits";
            openFilteredRecipes();
        }
    }
        );

        vegetablesButton = (Button) findViewById(R.id.buttonVegetables);
        vegetablesButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "Vegetables";
            openFilteredRecipes();

        }
    });

        grainsButton = (Button) findViewById(R.id.buttonGrains);
        grainsButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "Grains";
            openFilteredRecipes();

        }
    });

        proteinButton = (Button) findViewById(R.id.buttonProteinFoods);
        proteinButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "Proteinfoods";
            openFilteredRecipes();

        }
    });

        dairyButton = (Button) findViewById(R.id.buttonDairy);
        dairyButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            foodCatSelection = "Dairy";
            openFilteredRecipes();

            }
        });
}
// Method to open and pass variables into "FilteredRecipesActivity". Code to pass variables has not
// been added.
    public void openFilteredRecipes() {
        Intent intent = new Intent(this, FilteredRecipesActivity.class);
        //pass "mealMenuSelection" and "foodCatSelection" variables to 'filteredRecipes' activity.
        intent.putExtra("mealSelectionKey", mealMenuSelection);
        intent.putExtra("foodCatKey", foodCatSelection);
        startActivity(intent);
    };
}