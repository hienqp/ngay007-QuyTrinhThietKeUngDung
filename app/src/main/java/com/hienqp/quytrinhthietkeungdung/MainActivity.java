package com.hienqp.quytrinhthietkeungdung;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Bước 1: KHAI BÁO BIẾN TOÀN CỤC
    TextView txtNoiDung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bước 2: ÁNH XẠ
        txtNoiDung = (TextView) findViewById(R.id.textViewNoiDung);

        // Bước 3: VIẾT CODE
        txtNoiDung.setText("Lập trình Android");
    }
}