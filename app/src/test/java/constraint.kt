import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textViewContador: TextView
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewContador = findViewById(R.id.textViewContador)

        val buttonIncrementar: Button = findViewById(R.id.buttonIncrement)
        val buttonResetear: Button = findViewById(R.id.buttonReset)

        buttonIncrementar.setOnClickListener {
            incrementarContador()
        }

        buttonResetear.setOnClickListener {
            resetearContador()
        }
    }

    fun incrementarContador() {
        contador++
        textViewContador.text = contador.toString()
    }

    fun resetearContador() {
        contador = 0
        textViewContador.text = contador.toString()
    }
}
