package com.example.usuario.diseandoproject;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Usuario on 13/01/2018.
 */

public class ActividadDos extends AppCompatActivity {


    @BindView(R.id.tv_nombre)
    TextView tvNombre;

    String nombre;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dos);
        ButterKnife.bind(this);

        nombre = getIntent().getExtras().getString("nombre");

        tvNombre.setText(nombre);

    }
}
