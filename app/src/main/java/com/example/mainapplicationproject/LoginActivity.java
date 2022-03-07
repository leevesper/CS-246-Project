package com.example.mainapplicationproject;

//Craeted from youtube video ("Simple Login App Tutorial for Beginners E01 - Login Activity Using Android Studio 3.6.3 (NEW)",
//Professor DK) May 24, 2020.

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonEnter;
    //private TextView textViewAttemptsInfo;
    private String Username = "name";
    private String Password = "password123";

    boolean isValid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        editTextName = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonEnter = findViewById(R.id.buttonMealMenu);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String inputName = editTextName.getText().toString();
                String inputPassword = editTextPassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Please enter a user name and password.", Toast.LENGTH_LONG).show();
                } else {
                    isValid = validate(inputName, inputPassword);

                    if(!isValid){
                        Toast.makeText(LoginActivity.this, "Incorrect user name and/or password.", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(LoginActivity.this, "Login successful.", Toast.LENGTH_LONG).show();
                        //change MainActivity login button to "Account"
                        Button btn = findViewById(R.id.buttonLogin);
                        btn.setText("Account");
                        //return user to MainActivity page.
                        finish();
                    }
                }
            }
        });
    }
    private boolean validate(String name, String password) {
        if(name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }

}