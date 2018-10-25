package com.example.studentswe.androidclasssix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private TextView textViewDateShow;
private Button selectButton;
private DatePicker datePicker;
private Button ageCalc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ageCalc= findViewById(R.id.age_calc);
        ageCalculatorProject();
        //access from java file

        datePicker= findViewById(R.id.date_picker);
        textViewDateShow= findViewById(R.id.show_date_picker_text);
        selectButton= findViewById(R.id.select_datePicker_button);

        selectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //

                textViewDateShow.setText(datePickerShow());

            }
        });


    }

    private void ageCalculatorProject() {

        ageCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),AgeCalculator.class));
            }
        });
    }


    private String datePickerShow(){

        StringBuilder stringBuilder= new StringBuilder();
        stringBuilder.append(datePicker.getDayOfMonth()+"/");
        stringBuilder.append(datePicker.getMonth()+1+"/");
        stringBuilder.append(datePicker.getYear());
        return stringBuilder.toString();



    }
}
