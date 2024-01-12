package com.example.changetemperature;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtCel, edtFah;
    Button btnTF, btnTC ,btnClear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtCel = findViewById(R.id.txtCel);
        edtFah = findViewById(R.id.txtFah);
        btnTF = findViewById(R.id.btnFah);
        btnTC = findViewById(R.id.btnCel);
        btnClear = findViewById(R.id.btnClear);

        btnTF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value;
                try {
                    value = Float.parseFloat(edtCel.getText().toString()) * 9 / 5 + 32;
                }
                catch(NumberFormatException ignored)
                {
                    value = 0;
                }
                edtFah.setText(value + "");
            }
        });
        btnTC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float value;
                try {
                    value = (Float.parseFloat(edtFah.getText().toString()) - 32) * 5 / 9;
                }
                catch(NumberFormatException ignored)
                {
                    value = 0;
                }
                edtCel.setText(value + "");
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCel.setText("");
                edtFah.setText("");
            }
        });
    }
}