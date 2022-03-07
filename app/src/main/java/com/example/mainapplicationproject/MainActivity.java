package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button mealMenuButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!isLogin || !hasAccount) {}
                openLogin();

            }
        });
        mealMenuButton = (Button) findViewById(R.id.buttonMealMenu);
        mealMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMealMenu();
            }
        });
    }
    public void openLogin() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
    public void openMealMenu() {
        Intent intent = new Intent(this, MealMenuActivity.class);
        startActivity(intent);
    }
}
// This is a test.
// This is another test. 
