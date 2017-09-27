package com.andrestan1995gmail.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte4 extends AppCompatActivity {
    private TextView tv;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte4);
        tv = (TextView) findViewById(R.id.txtCantidad);
        int cont=0;
        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){
            if(celular.get(i).getMarca().equalsIgnoreCase("apple")&&celular.get(i).getColor().equalsIgnoreCase("negro")){
                cont=cont+1;
            }
        }
        String result=String.valueOf(cont);
        tv.setText(result);
    }
}

