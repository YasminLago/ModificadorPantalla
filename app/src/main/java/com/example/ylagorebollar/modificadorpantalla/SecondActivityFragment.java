package com.example.ylagorebollar.modificadorpantalla;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class SecondActivityFragment extends Fragment {

    Button boton;

    public SecondActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View vistaFragmento2 = inflater.inflate(R.layout.content_second, container, false);

        boton = (Button)vistaFragmento2.findViewById(R.id.main_button);


        boton.setOnClickListener( new View.OnClickListener() {

            public void onClick(View view){

                String mensaje = edit.getText().toString();
                text.setText(String.valueOf(mensaje.length()));
            }
        });

        return vistaFragmento2;
    }

        return view;
    }
}
