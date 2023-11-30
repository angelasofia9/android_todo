import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var gridView: GridView
    private lateinit var autoCompleteTextView: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView = findViewById(R.id.gridView)
        autoCompleteTextView = findViewById(R.id.autoCompleteTextView)


        val items = arrayOf("Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4")

        val gridAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)
        gridView.adapter = gridAdapter


        val autoCompleteAdapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
        autoCompleteTextView.setAdapter(autoCompleteAdapter)
    }
}
