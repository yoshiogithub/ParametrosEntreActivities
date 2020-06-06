package com.example.parametrosentreactivities.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.parametrosentreactivities.R;

public class Main2Activity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.Mostrar);

        Bundle obteniendoNombre=this.getIntent().getExtras();

        if(!obteniendoNombre.isEmpty()){
            String msj=getString(R.string.app_nombreIngesado);

            String nombre=obteniendoNombre.getString("nombre");
            textView.setText(msj+" "+nombre);
        }
    }

    public void OnClick(View view) {
        finish();

    }
}

