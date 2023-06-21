package cl.awakelab.ejerciciosawakelab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        EditText numeroUno = findViewById(R.id.editTextPrimerNumero);
        EditText numeroDos = findViewById(R.id.editTextSegundoNumero);

        Button botonSuma = findViewById(R.id.buttonSuma);
        Button botonResta = findViewById(R.id.buttonResta);
        Button botonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        Button botonDivision = findViewById(R.id.buttonDivision);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(MainActivity.this, "Presionaste el boton de suma " + n1 + " + " + n2, Toast.LENGTH_SHORT).show();
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(MainActivity.this, "Presionaste el boton de resta " + n1 + " - " + n2, Toast.LENGTH_SHORT).show();
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(MainActivity.this, "Presionaste el boton de multiplicacion " + n1 + " x " + n2, Toast.LENGTH_SHORT).show();
            }
        });

        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(MainActivity.this, "Presionaste el boton de division " + n1 + " / " + n2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showToast() {
        Toast.makeText(this, "Presionaste un Botón", Toast.LENGTH_SHORT).show();
    }
}



