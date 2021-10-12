package com.fonda.latprojekku;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Kalkulator extends AppCompatActivity {
    EditText number1,number2;
    TextView hasilnya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        number1=(EditText) findViewById(R.id.angka1);
        number2=(EditText) findViewById(R.id.angka2);
        hasilnya=(TextView) findViewById(R.id.hasilhitung);
    }

    public void tambah(View view) {
        Float a1 = Float.parseFloat(number1.getText().toString());
        Float a2 = Float.parseFloat(number2.getText().toString());
        Float hasil= a1+a2;
        hasilnya.setText(hasil.toString());
    }
    public void kurang(View view) {
        Float a1 = Float.parseFloat(number1.getText().toString());
        Float a2 = Float.parseFloat(number2.getText().toString());
        Float hasil= a1-a2;
        hasilnya.setText(hasil.toString());
    }
    public void kali(View view) {
        Float a1 = Float.parseFloat(number1.getText().toString());
        Float a2 = Float.parseFloat(number2.getText().toString());
        Float hasil= a1*a2;
        hasilnya.setText(hasil.toString());
    }
    public void bagi(View view) {
        Float a1 = Float.parseFloat(number1.getText().toString());
        Float a2 = Float.parseFloat(number2.getText().toString());
        Float hasil= a1/a2;
        hasilnya.setText(hasil.toString());
    }
}