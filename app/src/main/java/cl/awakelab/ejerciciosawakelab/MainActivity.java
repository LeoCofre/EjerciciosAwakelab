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
                int n1 = Integer.parseInt(numeroUno.getText().toString());
                int n2 = Integer.parseInt(numeroDos.getText().toString());
                int resultado = n1 + n2;
                Toast.makeText(MainActivity.this, "El resultado es  " + resultado, Toast.LENGTH_SHORT).show();
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numeroUno.getText().toString());
                int n2 = Integer.parseInt(numeroDos.getText().toString());
                int resultado = n1 - n2;
                Toast.makeText(MainActivity.this, "El resultado es  " + resultado, Toast.LENGTH_SHORT).show();
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(numeroUno.getText().toString());
                int n2 = Integer.parseInt(numeroDos.getText().toString());
                int resultado = n1 * n2;
                Toast.makeText(MainActivity.this, "El resultado es  " + resultado, Toast.LENGTH_SHORT).show();
            }
        });

        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double n1 = Double.valueOf(Integer.parseInt(numeroUno.getText().toString()));
                Double n2 = Double.valueOf(Integer.parseInt(numeroDos.getText().toString()));
                Double resultado = n1 / n2;
                Toast.makeText(MainActivity.this, "El resultado es  " + resultado, Toast.LENGTH_SHORT).show();
            }
        });
    }

}



