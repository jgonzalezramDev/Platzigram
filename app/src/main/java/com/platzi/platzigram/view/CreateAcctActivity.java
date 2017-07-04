package com.platzi.platzigram.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.platzi.platzigram.R;

public class CreateAcctActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_acct);
        ShowToolbar(getResources().getString(R.string.toolbar_title_createaccount),true); //se pone el titulo y el voton de regresar a visible (este se definio en el manifest)

    }

    public void ShowToolbar(String title,boolean upButton){
        //para mostrar el toolbar
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //se define el titulo y si se meustra boton de regreso
        getSupportActionBar().setTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }
}
