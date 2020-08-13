package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText e1;
    private EditText e2;
    private Button b;
    private Button b2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.lol);
        e2 = (EditText) findViewById(R.id.lol2);
        b = (Button) findViewById(R.id.log);
        b2 = (Button) findViewById(R.id.clr);

        final String txt = "abc";
        final String txt2 = "abcd";
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals(txt) && e2.getText().toString().equals(txt2) ) {
                    Toast.makeText(MainActivity.this, "matched", Toast.LENGTH_SHORT).show();
                    Intent inten =new Intent(MainActivity.this,log.class);
                    startActivity(inten);
                }else if(e1.getText().toString().isEmpty()){

                    e1.setError("Enter name");
                }
                else
                {
                    Toast.makeText(MainActivity.this, "incorrect id and password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText(null);
                e2.setText(null);
            }
        });


    }
}