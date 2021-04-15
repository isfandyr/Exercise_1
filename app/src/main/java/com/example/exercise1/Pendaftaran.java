package com.example.exercise1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.android.material.snackbar.Snackbar;

public class Pendaftaran extends AppCompatActivity {

    EditText edtNama, edtAlamat, edtEmail, edtPassword, edtrepass;
    Button rbtnbatal, rbtndaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pendaftaran);

        edtNama = findViewById(R.id.rNama);
        edtAlamat = findViewById(R.id.ralamat);
        edtEmail =  findViewById(R.id.remail);
        edtPassword = findViewById(R.id.rpass);
        edtrepass = findViewById(R.id.repass);
        rbtnbatal = findViewById(R.id.rbtnbatal);
        rbtndaftar = findViewById(R.id.rbtndaftar);

        rbtndaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (edtNama.getText().toString().isEmpty() ||
                        edtAlamat.getText().toString().isEmpty() ||
                        edtEmail.getText().toString().isEmpty() ||
                        edtPassword.getText().toString().isEmpty() ||
                        edtrepass.getText().toString().isEmpty())
                {
                    Snackbar.make(view, "Data Wajib Diisi!" , Snackbar.LENGTH_LONG).show();
                }
                else
                {
                    if (edtPassword.getText().toString().equals(edtrepass.getText().toString()))
                    {
                        Toast.makeText(getApplicationContext(), "Pendaftaran Berhasil", Toast.LENGTH_LONG).show();
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(i);
                    }
                    else
                    {
                        Snackbar.make(view, "Password Harus Sama!", Snackbar.LENGTH_LONG).show();
                    }

                }
            }
        });
        rbtnbatal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}