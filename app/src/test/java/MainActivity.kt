import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var editTextNombre: EditText
    private lateinit var textSaludo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextNombre = findViewById(R.id.editTextNombre)
        textSaludo = findViewById(R.id.textSaludo)

        val buttonSaludar: Button = findViewById(R.id.buttonSaludar)
        buttonSaludar.setOnClickListener {
            saludar()
        }
    }

    private fun saludar() {
        val nombre = editTextNombre.text.toString()
        if (nombre.isNotEmpty()) {
            val saludo = "¡Hola, $nombre!"
            textSaludo.text = saludo
        } else {
            textSaludo.text = "Por favor, ingrese su nombre."
        }
    }
}
