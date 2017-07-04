package com.platzi.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.platzi.platzigram.view.ContainerActivity;
import com.platzi.platzigram.view.CreateAcctActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goCreateAccount(View view){
        Intent intent = new Intent(this, CreateAcctActivity.class); //intent explicito
        startActivity(intent);
    }

    public void goContainer(View view){
        Intent intent = new Intent(this, ContainerActivity.class); //intent explicito
        startActivity(intent);

    }

//se hizo este comentario para subir una nueva version al Git



}
