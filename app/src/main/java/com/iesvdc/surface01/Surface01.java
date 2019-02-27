package com.iesvdc.surface01;

import android.app.ActionBar;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Surface01 extends AppCompatActivity {

    RelativeLayout rl;
    SurfaceView sv;
    Button boton;
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface01);

        rl = findViewById(R.id.relative2);

        //CARACTERISTICAS SURFACEVIEW
        sv = new SurfaceView(this);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT,
                (int) RelativeLayout.LayoutParams.WRAP_CONTENT);

        params.addRule(RelativeLayout.CENTER_HORIZONTAL);
        params.topMargin = 40;
        sv.setLayoutParams(params);
        sv.setBackgroundColor(Color.argb(255, 30, 144, 255));



        //CARACTERISTICAS TEXTO
        texto = new TextView(this);
        texto.setTextColor(Color.WHITE);
        texto.setTypeface(Typeface.DEFAULT_BOLD);
        texto.setTextSize(18);
        texto.setText("CREADO EN JAVA");
            //Parametros Texto
        RelativeLayout.LayoutParams paramsTxt = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT,
                (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsTxt.addRule(RelativeLayout.CENTER_HORIZONTAL);
        paramsTxt.topMargin = 75;
        texto.setLayoutParams(paramsTxt);

        //CARACTERISTICAS BOTON
        boton = new Button(this);
        boton.setText("PULSA PARA MENSAJE");
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToast();
            }


        });
            //Paramentros boton
        RelativeLayout.LayoutParams paramsBtn = new RelativeLayout.LayoutParams((int) RelativeLayout.LayoutParams.WRAP_CONTENT,
                (int) RelativeLayout.LayoutParams.WRAP_CONTENT);
        paramsBtn.addRule(RelativeLayout.CENTER_IN_PARENT);
        boton.setLayoutParams(paramsBtn);




        rl.addView(sv);
        rl.addView(texto);
        rl.addView(boton);
    }

    public void mostrarToast() {
        Toast.makeText(this, "BOTON PULSADO", Toast.LENGTH_SHORT).show();
    }
}
