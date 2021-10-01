package com.example.sis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    // инициализация переменных
    EditText email_input;
    EditText pass_input;
    Button login_button;
    Toast wrong_logs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email_input = findViewById(R.id.user_field_email);
        pass_input = findViewById(R.id.user_field_password);
        login_button = findViewById(R.id.log_button);
        wrong_logs = Toast.makeText(getApplicationContext(),
                "Некорректный ввод данных!", Toast.LENGTH_SHORT);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String logininfo = email_input.getText().toString().trim();
                String passinfo = pass_input.getText().toString().trim();
                if (logininfo.indexOf('@') != -1){
                    finishAffinity(); // Close all activites
                    System.exit(0);  // Releasing resources
                }
                else {
                    wrong_logs.show();
                }
            }

        });
        }
}