package com.example.mainapplicationproject;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatSpinner;

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


//public class MainActivity extends AppCompatActivity implements View.OnClickListener {
public class RecipeActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layoutList;
    Button buttonAdd;

    //List<String> teamList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_recipeds);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.button_add);

        buttonAdd.setOnClickListener(this);

//        teamList.add("Team");
//        teamList.add("India");
//        teamList.add("Australia");
//        teamList.add("England");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.recipe_menu, menu);
        return true;
    }

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

    @Override
    public void onClick(View v) {
        addView();
    }
    private void addView() {

        View cricketerView = getLayoutInflater().inflate(R.layout.row_add_cricketer, null, false);

        EditText editText = (EditText)cricketerView.findViewById(R.id.edit_cricketer_name);
        //AppCompatSpinner spinnerTeam = (AppCompatSpinner)cricketerView.findViewById((R.id.spinner_team));
        //ImageView imageClose = (ImageView)cricketerView.findViewById(R.id.image_remove);

        //ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,teamList);
        //spinnerTeam.setAdapter(arrayAdapter);

//        imageClose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                removeView(cricketerView);
//            }
//        });

        layoutList.addView(cricketerView);

    }
    private void removeView(View view) {

        layoutList.removeView(view);

    }
}