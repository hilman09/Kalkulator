package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText angka1;
    private EditText angka2;
    private TextView hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka1 = findViewById(R.id.masukanAngka1);
        angka2 = findViewById(R.id.masukanAngka2);
        hasil = findViewById(R.id.hasil);

    }

    public void tambah(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka1.getText().toString());
        int jumlah = nilai1 + nilai2;
        hasil.setText(String.valueOf(jumlah));
    }
    public void kurang(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka1.getText().toString());
        int jumlah = nilai1 - nilai2;
        hasil.setText(String.valueOf(jumlah));
    }
    public void kali(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka1.getText().toString());
        int jumlah = nilai1 * nilai2;
        hasil.setText(String.valueOf(jumlah));
    }
    public void bagi(View view) {
        int nilai1 = Integer.parseInt(angka1.getText().toString());
        int nilai2 = Integer.parseInt(angka1.getText().toString());
        int jumlah = nilai1 / nilai2;
        hasil.setText(String.valueOf(jumlah));
    }


    public void hapus(View view) {
        angka1.setText("");
        angka2.setText("");
        hasil.setText("0");
        angka1.requestFocus();
    }
}