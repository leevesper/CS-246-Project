package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

// This activity creates a list of recipes the user has entered under their account. Each recipe
// displayed is a button that brings the user to the recipes activity. Functionality that allows
// the buns to bring up the recipe has not been created.

public class UserRecipesActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layoutList;
    Button buttonAdd;
    private Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipes);

        // Creates back arrow to return to UserAccount.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set action bar to black
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.button_add);

        buttonAdd.setOnClickListener(this);

        // Code to set on click listener for add recipe button.
        testButton = (Button) findViewById(R.id.RecipeButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRecipe();
            }
        });

        // A method that creates the for the demo.
        makeRecipe();
    }

    @Override
    public void onClick(View v) {
        addView();
    }
    private void addView() {

        View addRecipe = getLayoutInflater().inflate(R.layout.row_add_cricketer, null, false);

        Button button = (Button)addRecipe.findViewById(R.id.recipes_button);

        layoutList.addView(addRecipe);

//        testButton = (Button) findViewById(R.id.RecipeButton);
//        testButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                openRecipe();
//            }
//        });

    }

    // Method to demo activity.
    public void addRecipeButtons(String title, String author) {
        View addRecipe = getLayoutInflater().inflate(R.layout.row_add_cricketer, null, false);

        Button button = (Button)addRecipe.findViewById(R.id.recipes_button);

        button.setText('"' + title + '"' + ", " + author);

        layoutList.addView(addRecipe);
    }

    public void makeRecipe() {
            addRecipeButtons("Fruit Bowl", "Ben");
            addRecipeButtons("Sweetened Cantaloupe", "Kim");
            addRecipeButtons("Breakfast Cobb salad", "Will");
            addRecipeButtons("Morning Veggie Rice Bowl", "May");
            addRecipeButtons("Oatmeal", "Kim");
            addRecipeButtons("Homemade Cereal", "Ben");
            addRecipeButtons("Bacon and eggs", "Kim");
            addRecipeButtons("Sausage omelette", "Ben");
            addRecipeButtons("Strawberries and Cream", "Kim");
            addRecipeButtons("Homemade Yogurt", "Ben");
            addRecipeButtons("Lunch Smoothie", "Kim");
            addRecipeButtons("Fruit Sandwich", "Ben");
            addRecipeButtons("Chef salad", "Kim");
            addRecipeButtons("Cucumber and avocado sandwich", "Ben");
            addRecipeButtons("Rice and Tomatoes", "Kim");
            addRecipeButtons("Chicken and rice", "Ben");
            addRecipeButtons("Roast beef sandwich", "Kim");
            addRecipeButtons("Chicken and rice", "Ben");
            addRecipeButtons("Yogurt lunch smoothie", "Kim");
            addRecipeButtons("Macaroni and cheese", "Ben");
            addRecipeButtons("Waldorf salad", "Kim");
            addRecipeButtons("Orange chicken", "Ben");
            addRecipeButtons("Ratatouille", "Kim");
            addRecipeButtons("Mushroom ravioli", "Ben");
            addRecipeButtons("Rice and vegetable medley", "Kim");
            addRecipeButtons("Spanish rice with tomatoes", "Ben");
            addRecipeButtons("Spiral cut ham", "Kim");
            addRecipeButtons("Smoke trout", "Ben");
            addRecipeButtons("Cheese Soufflé", "Kim");
            addRecipeButtons("Lobster mac & cheese", "Ben");
            addRecipeButtons("Cheese and fruit plate", "Kim");
            addRecipeButtons("Fruit tart", "Ben");
            addRecipeButtons("Celery and homemade peanut butter", "Kim");
            addRecipeButtons("Caramelized pickles", "Ben");
            addRecipeButtons("Oatmeal cookies", "Kim");
            addRecipeButtons("Caramelized granola bars", "Ben");
            addRecipeButtons("Pralines covered bacon", "Kim");
            addRecipeButtons("Crème brûlée", "Ben");
            addRecipeButtons("Homemade chocolate ice cream", "Kim");
            addRecipeButtons("Banana pudding", "Ben");
    }

    private void removeView(View view) {
        layoutList.removeView(view);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    // Method to open recipe activity for creating new recipe.
    public void openRecipe() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

}