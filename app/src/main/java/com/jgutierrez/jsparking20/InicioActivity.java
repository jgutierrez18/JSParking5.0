package com.jgutierrez.jsparking20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InicioActivity extends AppCompatActivity implements View.OnClickListener{

    private Button btnlogin, btnregistrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_inicio);
        btnlogin= (Button)findViewById(R.id.btnlogin);
        btnregistrate= (Button)findViewById(R.id.btnregistrate);

        btnlogin.setOnClickListener(this);
        btnregistrate.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v == btnlogin) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }
        if (v == btnregistrate) {
            finish();
            startActivity(new Intent(this, RegistroActivity.class));
        }
    }
}

