// 10118374 Leonardo DY Korompis IF9
package com.example.tugas1_10118374;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin1 = (Button)findViewById(R.id.btnLogin1);

        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), menu.class);

                startActivity(i);

            }
        });

        Button btnRegister1 = (Button)findViewById(R.id.btnRegister1);

        btnRegister1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), register.class);

                startActivity(i);
            }
        });
    }
}