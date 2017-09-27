package com.andrestan1995gmail.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class crearCelular extends AppCompatActivity {
    private EditText precio, marca, color, capacidad, so;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);
        precio = (EditText) findViewById(R.id.txtPrecio);
        marca = (EditText) findViewById(R.id.txtMarca);
        color = (EditText) findViewById(R.id.txtColor);
        so = (EditText) findViewById(R.id.txtSo);
        capacidad = (EditText) findViewById(R.id.txtCapacidad);
        resources = this.getResources();
    }

    public boolean validar(){
        if(marca.getText().toString().isEmpty()) {
            marca.setError(resources.getString(R.string.mensaje_error_1));
            return false;
        }
        if(capacidad.getText().toString().isEmpty()) {
            capacidad.setError(resources.getString(R.string.mensaje_error_2));
            return false;
        }
        if(color.getText().toString().isEmpty()) {
            color.setError(resources.getString(R.string.mensaje_error_3));
            return false;
        }
        if(so.getText().toString().isEmpty()) {
            so.setError(resources.getString(R.string.mensaje_error_4));
            return false;
        }
        if(precio.getText().toString().isEmpty()) {
            precio.setError(resources.getString(R.string.mensaje_error_5));
            return false;
        }
        return true;
    }

    public void guardar(View view) {
        String mar, col, cap, prec, sop;
        mar = marca.getText().toString();
        col = color.getText().toString();
        cap = capacidad.getText().toString();
        prec = precio.getText().toString();
        sop = so.getText().toString();
        if(validar()) {
            Celular c = new Celular(mar, cap, col, sop, prec);
            c.guardar();
            Toast.makeText(this, resources.getString(R.string.mensaje_Exitoso), Toast.LENGTH_SHORT).show();
        }
    }

    public void limpiar (View v){
        marca.setText("");
        color.setText("");
        capacidad.setText("");
        so.setText("");
        precio.setText("");

    }
}
