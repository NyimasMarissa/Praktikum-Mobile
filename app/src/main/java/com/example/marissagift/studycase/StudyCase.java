package com.example.marissagift.studycase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class StudyCase extends AppCompatActivity {
    String menu2, porsi2, tempat2;
    TextView tempatTV, menuTV, porsiTV, hargaTV;
    int harga, total;
    int osas = 65500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_case);

        Intent intent = this.getIntent();
        menu2 = intent.getStringExtra("menu");
        porsi2 = intent.getStringExtra("porsi");
        tempat2 = intent.getStringExtra("tempat");

        menuTV = findViewById(R.id.textView_namaMenu);
        porsiTV = findViewById(R.id.textView_jumlahPorsi);
        tempatTV = findViewById(R.id.textView_sub);
        hargaTV = findViewById(R.id.textView_totalHarga);

        tempatTV.setText(tempat2);
        menuTV.setText(menu2);
        porsiTV.setText(porsi2);

        switch (tempat2) {
            case "Abnormal":
                harga = 30000;
                break;
            case "Eatbus":
                harga = 50000;
                break;
        }

        total = parseInt(porsi2) * harga;
        String totalHarga = Integer.toString(total);

        if (total < osas){
            hargaTV.setText(totalHarga);
            Toast.makeText(this, "Uangmu cukup, kuy Dinner", Toast.LENGTH_SHORT).show();
        }
        else {
            hargaTV.setText(totalHarga);
            Toast.makeText(this, "Jangan makan disini, uangmu tidak cukup :(", Toast.LENGTH_SHORT).show();
        }
    }
}