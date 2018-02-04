package com.example.marissagift.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private EditText editTextSatu, editTextDua;
    private String menu, porsi;
    private Button eatbusButton, abnormalButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSatu = findViewById(R.id.menu_makan);
        editTextDua = findViewById(R.id.porsi_makan);
        eatbusButton = findViewById(R.id.button_eatbus);
        abnormalButton = findViewById(R.id.button_abnormal);
    }

    public void launchEatbus(View view) {
        Intent intent = new Intent(this, StudyCase.class);
        menu = editTextSatu.getText().toString();
        porsi = editTextDua.getText().toString();
        String tempat = eatbusButton.getText().toString();

        if (menu.isEmpty()|| porsi.isEmpty()) {
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra("menu", menu);
            intent.putExtra("porsi", porsi);
            intent.putExtra("tempat", tempat);
            startActivity(intent);
        }
    }

    public void launchAbnormal(View view) {
        Intent intent = new Intent(this, StudyCase.class);
        menu = editTextSatu.getText().toString();
        porsi = editTextDua.getText().toString();
        String tempat = abnormalButton.getText().toString();

        if (menu.isEmpty() || porsi.isEmpty()) {
            Toast.makeText(this, "Lengkapi Formnya", Toast.LENGTH_SHORT).show();
        } else {
            intent.putExtra("menu", menu);
            intent.putExtra("porsi", porsi);
            intent.putExtra("tempat", tempat);
            startActivity(intent);
        }
    }
}
