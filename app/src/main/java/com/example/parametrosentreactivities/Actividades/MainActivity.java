package com.example.parametrosentreactivities.Actividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.parametrosentreactivities.Entidades.Mensajes;
import com.example.parametrosentreactivities.R;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.Contenido);
        editText=findViewById(R.id.txtNombre);
    }

    public void OnClick(View view) {
        Mensajes mensajes=new Mensajes();

        switch (view.getId()){
            case R.id.btnIngresar:
                textView.setText(mensajes.mostrarMensaje()+ editText.getText().toString());
                break;
            case R.id.btnEnviar:
                Intent intent=new Intent(this, Main2Activity.class);
                    Bundle enviandoNombre=new Bundle();
                    enviandoNombre.putString("nombre",editText.getText().toString());

                    intent.putExtras(enviandoNombre);

                startActivity(intent);
                break;
        }
        Toast.makeText(this, editText.getText().toString()+" agregado.", Toast.LENGTH_SHORT).show();
    }
}
