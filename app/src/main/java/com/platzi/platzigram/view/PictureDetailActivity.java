package com.platzi.platzigram.view;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.transition.Fade;

import com.platzi.platzigram.R;

public class PictureDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_picture_detail);

        ShowToolbar("",true);
        //se modifica el manifesta para indicar al boton de regreso a donde se regresara

        if (Build.VERSION.SDK_INT>Build.VERSION_CODES.LOLLIPOP){
            getWindow().setEnterTransition(new Fade());

        }


    }
    //se modifica el show por qu eestamos en contexto de actividad no se necesita un View
    public void ShowToolbar(String title,boolean upButton){
        //para mostrar el toolbar
        Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar);
         setSupportActionBar(toolbar);
         getSupportActionBar().setTitle(title);
         getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);
        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);


    }

}
