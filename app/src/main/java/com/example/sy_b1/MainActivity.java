package com.example.sy_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUname, txtPass;
    Button btnLogin, btnSignup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUname = findViewById(R.id.txtUname);
        txtPass = findViewById(R.id.txtPass);
        btnLogin = findViewById(R.id.btnLogin);
        btnSignup = findViewById(R.id.btnSignup);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = txtUname.getText().toString();
                String pass = txtPass.getText().toString();

                if( uname.equals("admin@gmail.com") && pass.equals("admin")){

                    Intent intent = new Intent(MainActivity.this,widgetDemo.class);

                    intent.putExtra("UNAME",uname);

                    startActivity(intent);

                }
                else
                {
                    Toast.makeText(MainActivity.this, "UserID or Password is Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }
}