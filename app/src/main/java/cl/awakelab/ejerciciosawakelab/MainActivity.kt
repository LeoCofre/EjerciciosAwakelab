package cl.awakelab.ejerciciosawakelab

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var numeroUno: EditText? = null
    private var numeroDos: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calculadora)

        numeroUno = findViewById(R.id.editTextPrimerNumero)
        numeroDos = findViewById(R.id.editTextSegundoNumero)

        val botonSuma = findViewById<Button>(R.id.buttonSuma)
        val botonResta = findViewById<Button>(R.id.buttonResta)
        val botonMultiplicacion = findViewById<Button>(R.id.buttonMultiplicacion)
        val botonDivision = findViewById<Button>(R.id.buttonDivision)

        botonSuma.setOnClickListener {
            if (numeroUno?.text.toString().isEmpty() || numeroDos?.text.toString().isEmpty()) {
                Toast.makeText(this, "Rellene los campos vacíos", Toast.LENGTH_LONG).show()
            } else {
                val n1 = numeroUno?.text.toString().toInt()
                val n2 = numeroDos?.text.toString().toInt()
                val resultadoSuma = n1!! + n2!!
                Toast.makeText(this, "Resultado suma $resultadoSuma", Toast.LENGTH_SHORT).show()
            }
        }

        botonResta.setOnClickListener {
            if (numeroUno?.text.toString().isEmpty() || numeroDos?.text.toString().isEmpty()) {
                Toast.makeText(this, "Rellene los campos vacíos", Toast.LENGTH_LONG).show()
            } else {
                val n1 = numeroUno?.text.toString().toInt()
                val n2 = numeroDos?.text.toString().toInt()
                val resultadoResta = n1!! - n2!!
                Toast.makeText(this, "Resultado resta $resultadoResta", Toast.LENGTH_SHORT).show()
            }
        }

        botonMultiplicacion.setOnClickListener {
            if (numeroUno?.text.toString().isEmpty() || numeroDos?.text.toString().isEmpty()) {
                Toast.makeText(this, "Rellene los campos vacíos", Toast.LENGTH_LONG).show()
            } else {
                val n1 = numeroUno?.text.toString().toInt()
                val n2 = numeroDos?.text.toString().toInt()
                val resultadoMultiplicacion = n1!! * n2!!
                Toast.makeText(this, "Resultado multiplicacion $resultadoMultiplicacion", Toast.LENGTH_SHORT).show()
            }
        }

        botonDivision.setOnClickListener {
            if (numeroUno?.text.toString().isEmpty() || numeroDos?.text.toString().isEmpty()) {
                Toast.makeText(this, "Rellene los campos vacíos", Toast.LENGTH_LONG).show()
            } else {
                if (numeroDos?.text.toString().toInt() == 0) {
                    Toast.makeText(this, "No puede dividir por cero", Toast.LENGTH_LONG).show()
                } else {
                    val n1 = numeroUno?.text.toString().toDouble()
                    val n2 = numeroDos?.text.toString().toDouble()
                    val resultadoDivision = n1 / n2
                    Toast.makeText(this, "Resultado división $resultadoDivision", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
