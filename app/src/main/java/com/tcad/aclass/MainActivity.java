package com.tcad.aclass;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.tcad.aclass.screen.SignUp;

public class MainActivity extends AppCompatActivity {
    String emailValue, passwordValue;

    EditText emailEditText, passwordEditText;

    Button signinButton;

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = (EditText) findViewById(R.id.email);
        passwordEditText = (EditText) findViewById(R.id.password);

        signinButton = (Button) findViewById(R.id.signin);

        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailValue = emailEditText.getText().toString();
                passwordValue = passwordEditText.getText().toString();

                Log.d(TAG, emailValue);
                Log.d(TAG, passwordValue);
                Intent newScreenIntent = new Intent(MainActivity.this, SignUp.class);
//                newScreenIntent.putExtra("email", emailValue);
//                newScreenIntent.putExtra("password", passwordValue);
                startActivity(newScreenIntent);
                finish();

            }
        });

    }


}
