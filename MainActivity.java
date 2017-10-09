package com.example.swagata.registration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText editText1 = (EditText) findViewById(R.id.editText3);
        final EditText editText2 = (EditText) findViewById(R.id.editText9);
        Button button = (Button) findViewById(R.id.button);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (editText1.getText().toString().equalsIgnoreCase("Swagata")) {
                    if (editText2.getText().toString().equalsIgnoreCase("54321")) {
                        Toast.makeText(MainActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Registration Failed!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

