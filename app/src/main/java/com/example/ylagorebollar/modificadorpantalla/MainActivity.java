package com.example.ylagorebollar.modificadorpantalla;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean pantallas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(findViewById(R.id.text_pantalla_grande)==null){
            pantallas=true;
            Toast toast = Toast.makeText(getApplicationContext(), "Pantalla grande", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
