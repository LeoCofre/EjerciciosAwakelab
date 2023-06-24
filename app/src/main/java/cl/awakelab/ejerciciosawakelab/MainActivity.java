package cl.awakelab.ejerciciosawakelab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText numeroUno;
    private EditText numeroDos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        numeroUno = findViewById(R.id.editTextPrimerNumero);
        numeroDos = findViewById(R.id.editTextSegundoNumero);


        Button botonSuma = findViewById(R.id.buttonSuma);
        Button botonResta = findViewById(R.id.buttonResta);
        Button botonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        Button botonDivision = findViewById(R.id.buttonDivision);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numeroUno.getText().toString().isEmpty() || numeroDos.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Rellene los campos vacíos", Toast.LENGTH_LONG).show();
                } else {
                    int n1 = Integer.parseInt(numeroUno.getText().toString());
                    int n2 = Integer.parseInt((numeroDos.getText().toString()));
                    int resultadoSuma = n1 + n2;
                    Toast.makeText(getBaseContext(), "Resultado suma " + resultadoSuma, Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroUno.getText().toString().isEmpty() || numeroDos.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Rellene los campos vacíos", Toast.LENGTH_LONG).show();
                } else {
                    int n1 = Integer.parseInt(numeroUno.getText().toString());
                    int n2 = Integer.parseInt((numeroDos.getText().toString()));
                    int resultadoResta = n1 - n2;
                    Toast.makeText(getBaseContext(), "Resultado resta " + resultadoResta, Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroUno.getText().toString().isEmpty() || numeroDos.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Rellene los campos vacíos", Toast.LENGTH_LONG).show();
                } else {
                    int n1 = Integer.parseInt(numeroUno.getText().toString());
                    int n2 = Integer.parseInt((numeroDos.getText().toString()));
                    int resultadoMultiplicacion = n1 * n2;
                    Toast.makeText(getBaseContext(), "Resultado multiplicacion " + resultadoMultiplicacion, Toast.LENGTH_SHORT).show();
                }
            }
        });

        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (numeroUno.getText().toString().isEmpty() || numeroDos.getText().toString().isEmpty()) {
                    Toast.makeText(getBaseContext(), "Rellene los campos vacíos", Toast.LENGTH_LONG).show();
                } else {
                    if (Integer.parseInt(numeroDos.getText().toString()) == 0 ) {
                        Toast.makeText(getBaseContext(), "No  puede dividir por cero", Toast.LENGTH_LONG).show();
                    } else {
                        double n1 = Integer.parseInt(numeroUno.getText().toString());
                        double n2 = Integer.parseInt((numeroDos.getText().toString()));
                        double resultadoDivision = n1 / n2;
                        Toast.makeText(getBaseContext(), "Resultado división " + resultadoDivision, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }


}



