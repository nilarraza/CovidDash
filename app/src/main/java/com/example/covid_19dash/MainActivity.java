package com.example.covid_19dash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void patientD(View view) {
        Intent intent=new Intent(this,PatientData.class);
        startActivity(intent);
    }

    public void hospitalD(View view) {
        Intent intent=new Intent(this,HospitalData.class);
        startActivity(intent);
    }
}
