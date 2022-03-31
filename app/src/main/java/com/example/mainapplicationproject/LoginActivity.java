package com.example.mainapplicationproject;

//Craeted from youtube video ("Simple Login App Tutorial for Beginners E01 - Login Activity Using Android Studio 3.6.3 (NEW)",
//Professor DK) May 24, 2020.

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Login activity to log user into account. It was realized after initial design phase that another
// activity we need to be added to allow user to create an account.
//

public class LoginActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;
    private Button buttonEnter;
    private Button forgotPasswordButton;
    //private TextView textViewAttemptsInfo;
    //Hardcoded username and password variables for testing purposes.
    private String Username = "name";
    private String Password = "password123";

    boolean isValid = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        // Creates back arrow to return to Main activity.
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Set action bar to black
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.black)));

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
                        //Code to change user status to logged in not yet added.
                        finish();
                    }
                }
            }
        });
        // Displays hint when user clicks "Forgot Password button. Hint currently hard coded.
        forgotPasswordButton = (Button) findViewById(R.id.buttonForgotPassword);
        forgotPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showHint();
            }
        });
    }
    //Method to determine if user had entered a valid username and password.
    private boolean validate(String name, String password) {
        if(name.equals(Username) && password.equals(Password)){
            return true;
        }
        return false;
    }
    //Method to display hint for password and, currently, user name.
    private void showHint() {
        Toast.makeText(LoginActivity.this, "Username: 'name', Password: 'password123'.", Toast.LENGTH_LONG).show();
    }

}