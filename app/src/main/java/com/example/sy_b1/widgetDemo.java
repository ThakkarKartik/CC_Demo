package com.example.sy_b1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class widgetDemo extends AppCompatActivity {

    EditText txtName;
    RadioButton rdMale, rdFemale, rdVanita, rdTMT, rdDRB;
    RadioGroup rdgGender, rdgCollege;
    CheckBox chkTerms;

    Button btnSubmit;
    ImageButton imgbtnAddUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widget_demo);

    chkTerms = findViewById(R.id.chkTerms);
    btnSubmit = findViewById(R.id.btnSubmit);

        rdTMT = findViewById(R.id.rdTMT);
        rdVanita = findViewById(R.id.rdVanita);
        rdFemale = findViewById(R.id.rdFemale);
        rdMale = findViewById(R.id.rdMale);

    btnSubmit.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            if(!chkTerms.isChecked()){
                Toast.makeText(widgetDemo.this, "Please Accept Terms and Conditions", Toast.LENGTH_SHORT).show();
            }

            if(rdTMT.isChecked()){
                rdFemale.setChecked(true);
                rdMale.setActivated(false);
            }
            if(rdVanita.isChecked()){
                rdFemale.setChecked(true);
                rdMale.setActivated(false);
            }

        }
    });

    rdgCollege = findViewById(R.id.rdgCollege);

    rdgCollege.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {

            if(rdTMT.isChecked()){
                rdFemale.setChecked(true);
                rdMale.setVisibility(View.INVISIBLE);
            }
            if(rdVanita.isChecked()){
                rdFemale.setChecked(true);
                rdMale.setVisibility(View.INVISIBLE);
            }
        }
    });

    imgbtnAddUser = findViewById(R.id.imgbtnAddUser);

    imgbtnAddUser.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

        }
    });







    }
}