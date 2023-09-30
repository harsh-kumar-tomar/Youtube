package com.example.javaappversion20.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.example.javaappversion20.Fragments.home_Fragment;
import com.example.javaappversion20.Fragments.subscription_Fragment;
import com.example.javaappversion20.Fragments.upload_bottom_Fragment;
import com.example.javaappversion20.R;
import com.example.javaappversion20.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

     ActivityMainBinding binding;
    ArrayList<NavigationMenuItemView> navigationIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace( R.id.frameLayout , new home_Fragment()).commit();


        binding.bottomNavigation.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.upload_navigation) {
                    upload_bottom_Fragment fragment = new upload_bottom_Fragment();
                    fragment.show(getSupportFragmentManager() , fragment.getTag());
                }else if(item.getItemId() == R.id.subscription_navigation)
                {
//                    getSupportFragmentManager().beginTransaction().add( R.id.frameLayout , new subscription_Fragment()).commit();
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, new subscription_Fragment())
                            .commit();

                } else if (item.getItemId() == R.id.home_navigation) {

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.frameLayout, new home_Fragment())
                            .commit();

                }

                return true;
            }

        });







    }


}