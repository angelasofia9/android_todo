import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] dataList = {"Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5"};
    private String[] gridDataList = {"Imagen 1", "Imagen 2", "Imagen 3", "Imagen 4"};
    private ArrayAdapter<String> listAdapter;
    private ArrayAdapter<String> gridAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializar vistas
        ListView listView = findViewById(R.id.listView);
        GridView gridView = findViewById(R.id.gridView);
        TextView textViewTitle = findViewById(R.id.textViewTitle);
        TextView textViewDetailTitle = findViewById(R.id.textViewDetailTitle);
        RelativeLayout relativeLayoutDetails = findViewById(R.id.relativeLayoutDetails);

        // Inicializar adaptadores
        listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dataList);
        gridAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, gridDataList);

        // Configurar adaptadores
        listView.setAdapter(listAdapter);
        gridView.setAdapter(gridAdapter);

        // Configurar el evento de clic en el ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = dataList[position];
                textViewDetailTitle.setText(selectedItem + " Detalles");
                relativeLayoutDetails.setVisibility(View.VISIBLE);
            }
        });

        // Configurar el evento de clic en el GridView
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = gridDataList[position];
                // Implementa la lógica para manejar el clic en el GridView si es necesario
            }
        });
    }
}
