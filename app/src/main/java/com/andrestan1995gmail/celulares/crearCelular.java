package com.andrestan1995gmail.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearCelular extends AppCompatActivity {
    private EditText precio, marca, color, capacidad;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);

        precio = (EditText) findViewById(R.id.txtPrecio);
        marca = (EditText) findViewById(R.id.txtMarca);
        color = (EditText) findViewById(R.id.txtColor);
        capacidad = (EditText) findViewById(R.id.txtCapacidad);

        resources = this.getResources();
    }

    public void guardar(View view) {
        String mar, col, cap, prec;

        mar = marca.getText().toString();
        col = color.getText().toString();
        cap = capacidad.getText().toString();
        prec = precio.getText().toString();
        Celular c = new Celular(mar, cap, col, prec);
        c.guardar();
        Toast.makeText(this, resources.getString(R.string.mensaje_Exitoso), Toast.LENGTH_SHORT).show();
    }
}
