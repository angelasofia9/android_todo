import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViewResultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewResultado = findViewById(R.id.textViewResultado)

        val buttonOption1: Button = findViewById(R.id.buttonOption1)
        val buttonOption2: Button = findViewById(R.id.buttonOption2)

        buttonOption1.setOnClickListener {
            opcionSeleccionada("Opción 1 seleccionada")
        }

        buttonOption2.setOnClickListener {
            opcionSeleccionada("Opción 2 seleccionada")
        }
    }

    fun opcionSeleccionada(mensaje: String) {
        textViewResultado.text = mensaje
    }
}
