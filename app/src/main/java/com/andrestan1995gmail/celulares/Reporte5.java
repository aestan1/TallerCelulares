package com.andrestan1995gmail.celulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte5 extends AppCompatActivity {
    private TextView tv;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte5);
        tv = (TextView) findViewById(R.id.txtPromedio);
        int suma=0, cont=0, promedio=0;



        celular = Datos.obtener();

        for (int i = 0; i <celular.size(); i++){

            if(celular.get(i).getMarca().equalsIgnoreCase("nokia")){
                suma=suma+Integer.parseInt(celular.get(i).getPrecio());
                cont=cont+1;
            }


        }

        promedio=suma/cont;
        String result=String.valueOf(promedio);
        tv.setText("$"+result);

    }
}
