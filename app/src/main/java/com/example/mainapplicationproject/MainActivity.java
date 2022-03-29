package com.example.mainapplicationproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button Account;
    private Button mealMenuButton;
    public boolean logged_in = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonLogin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        Account = (Button) findViewById(R.id.openUserAccountButton);
        Account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if (!isLogin || !hasAccount) {}
                if (logged_in = false) {
                    openLogin();
                } else {
                    openAccount();
                }
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

    public void openAccount() {
        Intent intent = new Intent(this, UserAccountActivity.class);
        startActivity(intent);
    }

    public void openMealMenu() {
        Intent intent = new Intent(this, MealMenuActivity.class);
        startActivity(intent);
    }
}
// This is a test.
// This is another test. 
