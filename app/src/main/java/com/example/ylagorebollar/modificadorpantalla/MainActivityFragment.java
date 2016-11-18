package com.example.ylagorebollar.modificadorpantalla;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainActivityFragment extends Fragment {

    Button btnHi;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                         Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        View fragmentoPricipal = inflater.inflate(R.layout.fragment_main_activity, container, false);

        btnHi = (Button)fragmentoPricipal.findViewById(R.id.btnHi);

        return fragmentoPricipal;
    }

    void pulsoBoton(View boton){
        Intent intentPrincipal = new Intent(getActivity(),SecondActivity.class);

    }



}
