import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int contador = 0;
    private TextView textViewContador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referenciamos los componentes en el layout
        Button buttonIncrementar = findViewById(R.id.buttonIncrementar);
        textViewContador = findViewById(R.id.textViewContador);

        // Configuramos el listener para el botón
        buttonIncrementar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementarContador();
            }
        });
    }

    private void incrementarContador() {
        contador++;
        textViewContador.setText("Contador: " + contador);
    }
}
