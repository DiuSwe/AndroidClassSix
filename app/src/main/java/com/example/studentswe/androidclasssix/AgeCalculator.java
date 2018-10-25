package com.example.studentswe.androidclasssix;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class AgeCalculator extends AppCompatActivity {

    private TextView showAge;
    private Button calculateAge;
    private EditText inputAge;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age_calculator);

        showAge= findViewById(R.id.show_age);
        calculateAge= findViewById(R.id.calculate_button);
        inputAge= findViewById(R.id.input_age);
        calculateCurrentAge();
    }

    private void calculateCurrentAge() {

        calculateAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code to be executed here
                String input_age= inputAge.getText().toString();
                int birthDate= Integer.parseInt(input_age);


                Calendar calendar= Calendar.getInstance();

                int currentYear= calendar.get(Calendar.YEAR);
                int age= currentYear-birthDate;

                showAge.setText("Your current age is:::"+age);
                Toast.makeText(AgeCalculator.this, "Your current age is:: "+age, Toast.LENGTH_SHORT).show();



            }
        });
    }
}
