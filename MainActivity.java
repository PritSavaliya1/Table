package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText enterans;
    TextView t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterans = findViewById(R.id.enterans);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);
        t9 = findViewById(R.id.t9);
        t10 = findViewById(R.id.t10);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = Integer.parseInt(enterans.getText().toString());
                if(enterans.length() < 7) {
                    t1.setText(i + "  X " + "1" + " = " + i * 1);
                    t2.setText(i + "  X " + "2" + " = " + i * 2);
                    t3.setText(i + "  X " + "3" + " = " + i * 3);
                    t4.setText(i + "  X " + "4" + " = " + i * 4);
                    t5.setText(i + "  X " + "5" + " = " + i * 5);
                    t6.setText(i + "  X " + "6" + " = " + i * 6);
                    t7.setText(i + "  X " + "7" + " = " + i * 7);
                    t8.setText(i + "  X " + "8" + " = " + i * 8);
                    t9.setText(i + "  X " + "9" + " = " + i * 9);
                    t10.setText(i + "  X " + "10" + " = " + i * 10);
                    Toast.makeText(MainActivity.this, "Successful 👍", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Oops Min Length 7 Digit 🤷‍‍", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}