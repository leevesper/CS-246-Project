package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class UserRecipesActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layoutList;
    Button buttonAdd;
    private Button testButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_recipes);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        layoutList = findViewById(R.id.layout_list);
        buttonAdd = findViewById(R.id.button_add);

        buttonAdd.setOnClickListener(this);

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

        testButton = (Button) findViewById(R.id.testRecipeButton);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTestRecipe();
            }
        });

    }
    private void removeView(View view) {
        layoutList.removeView(view);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }

    public void openTestRecipe() {
        Intent intent = new Intent(this, RecipeActivity.class);
        startActivity(intent);
    }

}