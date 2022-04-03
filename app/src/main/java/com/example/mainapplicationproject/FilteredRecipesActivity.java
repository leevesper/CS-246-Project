package com.example.mainapplicationproject;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//This activity creates a list of recipes based on the user's selections from the previous two
// activities. Each recipe displayed is a button that allows the user to open up and view the
// recipe. Functionality to open the recipes has not been added. Database to hold the recipes has
// not been created. Currently, code to create and display recipe buttons has been hardcoded into
// this activity.

public class FilteredRecipesActivity extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layoutList;
    //Button buttonAdd;

    public String mealCat;
    public String foodCat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_recipeds);

        // Creates action bar and sets action bar color to black.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        // takes variables from previse activities and sets them to variables in this activity.
        Bundle mealCatVar = getIntent().getExtras();
        Bundle foodCattVar = getIntent().getExtras();
        if (mealCatVar != null && foodCattVar != null) {
            mealCat = mealCatVar.getString("mealSelectionKey");
            foodCat = mealCatVar.getString("foodCatKey");
        }

        // Set "categoriesTextView" with variables the last two activities based on users choices in
        // "MealMenuActivity" and "FoodCatMenuActivity".
        setContentView(R.layout.activity_filtered_recipeds);
        TextView ctv = (TextView)findViewById(R.id.categoriesTextView);
        ctv.setText(mealCat + ", " + foodCat);

        // Code to add buttons to layout.
        layoutList = findViewById(R.id.layout_list);
        //buttonAdd = findViewById(R.id.button_add);
        //buttonAdd.setOnClickListener(this);

        // Creates a list of recipes based on the "mealCat" and "foodCat" variables.
        makeRecipe();
    }

    // On click method to add buttons dynamically to activity.
    @Override
    public void onClick(View v) {
        addView();
    }
    private void addView() {

        View addRecipe = getLayoutInflater().inflate(R.layout.row_add_cricketer, null, false);

        Button button = (Button)addRecipe.findViewById(R.id.recipes_button);

        layoutList.addView(addRecipe);
    }

    // Method to demo activity.
    public void addRecipeButtons(String title, String author) {
        View addRecipe = getLayoutInflater().inflate(R.layout.row_add_cricketer, null, false);

        Button button = (Button)addRecipe.findViewById(R.id.recipes_button);

        button.setText('"' + title + '"' + ", " + author);

        layoutList.addView(addRecipe);
    }
    // Ridiculous 'if else' statement to create buttons based on "mealCat" and "foodCat" variables.
    public void makeRecipe() {
        if(mealCat.equals("Breakfast") && foodCat.equals("Fruits")) {
            addRecipeButtons("Fruit Bowl", "Ben");
            addRecipeButtons("Sweetened Cantaloupe", "Kim");
        }else if (mealCat.equals("Breakfast") && foodCat.equals("Vegetables")) {
            addRecipeButtons("Breakfast Cobb salad", "Will");
            addRecipeButtons("Morning Veggie Rice Bowl", "May");
        }else if (mealCat.equals("Breakfast") && foodCat.equals("Grains")) {
            addRecipeButtons("Oatmeal", "Kim");
            addRecipeButtons("Homemade Cereal", "Ben");
        }else if (mealCat.equals("Breakfast") && foodCat.equals("Proteinfoods")) {
            addRecipeButtons("Bacon and eggs", "Kim");
            addRecipeButtons("Sausage omelette", "Ben");
        }else if (mealCat.equals("Breakfast") && foodCat.equals("Dairy")) {
            addRecipeButtons("Strawberries and Cream", "Kim");
            addRecipeButtons("Homemade Yogurt", "Ben");
        }else if (mealCat.equals("Lunch") && foodCat.equals("Fruits")) {
            addRecipeButtons("Lunch Smoothie", "Kim");
            addRecipeButtons("Fruit Sandwich", "Ben");
        }else if (mealCat.equals("Lunch") && foodCat.equals("Vegetables")) {
            addRecipeButtons("Chef salad", "Kim");
            addRecipeButtons("Cucumber and avocado sandwich", "Ben");
        }else if (mealCat.equals("Lunch") && foodCat.equals("Grains")) {
            addRecipeButtons("Rice and Tomatoes", "Kim");
            addRecipeButtons("Chicken and rice", "Ben");
        }else if (mealCat.equals("Lunch") && foodCat.equals("Proteinfoods")) {
            addRecipeButtons("Roast beef sandwich", "Kim");
            addRecipeButtons("Chicken and rice", "Ben");
        }else if (mealCat.equals("Lunch") && foodCat.equals("Dairy")) {
            addRecipeButtons("Yogurt lunch smoothie", "Kim");
            addRecipeButtons("Macaroni and cheese", "Ben");
        }else if (mealCat.equals("Dinner") && foodCat.equals("Fruits")) {
            addRecipeButtons("Waldorf salad", "Kim");
            addRecipeButtons("Orange chicken", "Ben");
        }else if (mealCat.equals("Dinner") && foodCat.equals("Vegetables")) {
            addRecipeButtons("Ratatouille", "Kim");
            addRecipeButtons("Mushroom ravioli", "Ben");
        }else if (mealCat.equals("Dinner") && foodCat.equals("Grains")) {
            addRecipeButtons("Rice and vegetable medley", "Kim");
            addRecipeButtons("Spanish rice with tomatoes", "Ben");
        }else if (mealCat.equals("Dinner") && foodCat.equals("Proteinfoods")) {
            addRecipeButtons("Spiral cut ham", "Kim");
            addRecipeButtons("Smoke trout", "Ben");
        }else if (mealCat.equals("Dinner") && foodCat.equals("Dairy")) {
            addRecipeButtons("Cheese Soufflé", "Kim");
            addRecipeButtons("Lobster mac & cheese", "Ben");
        }else if (mealCat.equals("Desert") && foodCat.equals("Fruits")) {
            addRecipeButtons("Cheese and fruit plate", "Kim");
            addRecipeButtons("Fruit tart", "Ben");
        }else if (mealCat.equals("Desert") && foodCat.equals("Vegetables")) {
            addRecipeButtons("Celery and homemade peanut butter", "Kim");
            addRecipeButtons("Caramelized pickles", "Ben");
        }else if (mealCat.equals("Desert") && foodCat.equals("Grains")) {
            addRecipeButtons("Oatmeal cookies", "Kim");
            addRecipeButtons("Caramelized granola bars", "Ben");
        }else if (mealCat.equals("Desert") && foodCat.equals("Proteinfoods")) {
            addRecipeButtons("Pralines covered bacon", "Kim");
            addRecipeButtons("Crème brûlée", "Ben");
        }else if (mealCat.equals("Desert") && foodCat.equals("Dairy")) {
            addRecipeButtons("Homemade chocolate ice cream", "Kim");
            addRecipeButtons("Banana pudding", "Ben");
        }
    }

}