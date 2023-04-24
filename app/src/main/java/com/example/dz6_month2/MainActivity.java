package com.example.dz6_month2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonOne = findViewById(R.id.bt_button);
        EditText editTextOne = findViewById(R.id.edt_one);
        EditText editTextTho = findViewById(R.id.edt_tho);
        TextView textViewOne = findViewById(R.id.txt_one);
        TextView textViewTno = findViewById(R.id.txt_tho);
        TextView textViewThree = findViewById(R.id.txt_three);
        TextView textViewWho = findViewById(R.id.txt_who);
        TextView textViewFif = findViewById(R.id.txt_fif);

        editTextOne.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextOne.getText().toString().isEmpty()) {
                    buttonOne.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    buttonOne.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        editTextTho.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (editTextTho.getText().toString().isEmpty()) {
                    buttonOne.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                } else {
                    buttonOne.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        buttonOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextOne.getText().toString().equals("admin")&&editTextTho.getText().toString().equals("admin")){
                    editTextOne.setVisibility(View.GONE);
                    editTextTho.setVisibility(View.GONE);
                    buttonOne.setVisibility(View.GONE);
                    textViewOne.setVisibility(View.GONE);
                    textViewThree.setVisibility(View.GONE);
                    textViewWho.setVisibility(View.GONE);
                    textViewFif.setVisibility(View.GONE);
                }else {
                    Toast.makeText(MainActivity.this,"Неверный логин или пароль", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}