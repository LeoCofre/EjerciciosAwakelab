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
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculadora);

        numeroUno = findViewById(R.id.editTextPrimerNumero);
        numeroDos = findViewById(R.id.editTextSegundoNumero);
        textResultado = findViewById(R.id.textResultado);

        Button botonSuma = findViewById(R.id.buttonSuma);
        Button botonResta = findViewById(R.id.buttonResta);
        Button botonMultiplicacion = findViewById(R.id.buttonMultiplicacion);
        Button botonDivision = findViewById(R.id.buttonDivision);

        botonSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validarCamposVacios();
                double n1 = Double.parseDouble(numeroUno.getText().toString());
                double n2 = Double.parseDouble(numeroDos.getText().toString());
                double resultadoSuma = n1 + n2;
                Toast.makeText(getBaseContext(), "Resultado suma " + resultadoSuma, Toast.LENGTH_SHORT).show();
            }
        });

        botonResta.setOnClickListener(new View.OnClickListener  () {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                validarCamposVacios();
                Toast.makeText(getBaseContext(), "Presionaste el boton de resta " + n1 + " - " + n2, Toast.LENGTH_SHORT).show();
            }
        });

        botonMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(getBaseContext(), "Presionaste el boton de multiplicacion " + n1 + " x " + n2, Toast.LENGTH_SHORT).show();
            }
        });

        botonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n1 = numeroUno.getText().toString();
                String n2 = numeroDos.getText().toString();
                Toast.makeText(getBaseContext(), "Presionaste el boton de division " + n1 + " / " + n2, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void validarCamposVacios() {
        if (numeroUno.getText().toString().isEmpty() || numeroDos.getText().toString().isEmpty()){
            Toast.makeText(getBaseContext(),"Rellene los campos vacíos", Toast.LENGTH_LONG).show();
            return;
        };
    }
}



