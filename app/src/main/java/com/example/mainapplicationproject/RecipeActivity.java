package com.example.mainapplicationproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import android.view.Menu;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

// Activity for entering a new recipe into the database. Databases not been created. Functionality
// to allow the activity to be scrollable has not been attempted but not added.

public class RecipeActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layoutList;
    Button buttonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        // Creates back arrow to return to Main activity.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set action bar to black
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.button_add);

        buttonAdd.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.recipe_menu, menu);
        return true;
    }

    // Code to create an option functionality in action bar of activity. Functionality has not been
    // added to the options of the menu bar.
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(item.getItemId() == R.id.commentMenu) {
            Toast.makeText(this, "Comment option clicked", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.editIngredientMenu) {
            Toast.makeText(this, "Edit Ingredient option clicked", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.addIngredientMenu) {
            Toast.makeText(this, "Add Ingredient option clicked", Toast.LENGTH_SHORT).show();
        }else if (item.getItemId() == R.id.deleteRecipeMenu) {
            Toast.makeText(this, "Delete Recipe option clicked", Toast.LENGTH_SHORT).show();
        }else{
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    // Code to dynamically add a view that allows user to enter new ingredients to the recipe.
    @Override
    public void onClick(View v) {
        addView();
    }
    private void addView() {

        View ingredientView = getLayoutInflater().inflate(R.layout.row_add_ingredient, null, false);

        EditText editName = (EditText)ingredientView.findViewById(R.id.ingredient_name);
        EditText editQuantity = (EditText)ingredientView.findViewById(R.id.ingredient_quantity);
        EditText editUnit = (EditText)ingredientView.findViewById(R.id.ingredient_unit);

        layoutList.addView(ingredientView);

    }
    // Old code not currently necessary.
//    private void removeView(View view) {
//
//        layoutList.removeView(view);
//
//    }
}