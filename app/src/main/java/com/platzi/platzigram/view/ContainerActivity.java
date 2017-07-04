package com.platzi.platzigram.view;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.platzi.platzigram.R;
import com.platzi.platzigram.view.fragment.HomeFragment;
import com.platzi.platzigram.view.fragment.ProfileFragment;
import com.platzi.platzigram.view.fragment.SearchFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerActivity extends AppCompatActivity {
    HomeFragment homeFragment ;
     ProfileFragment profileFragment;
     SearchFragment searchFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container);

        BottomBar bottomBar=(BottomBar) findViewById(R.id.bottombar);
       // Log.i("INFORMACION" , " ----"+R.id.home);
        bottomBar.setDefaultTab( R.id.home);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener( ) {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId){
                    case R.id.home:

                          homeFragment= new HomeFragment();
                        //se puede dejar hasta replace pero para darle un efecto al poner el fragment se puso lo demas.
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit()     ;

                        break;
                    case R.id.profile:
                          profileFragment= new ProfileFragment();

                        getSupportFragmentManager().beginTransaction().replace(R.id.container,profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit()     ;

                        break;
                    case R.id.search:
                         searchFragment= new SearchFragment();

                        getSupportFragmentManager().beginTransaction().replace(R.id.container,searchFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null).commit()     ;

                        break;

                }
            }
        });

    }
}
