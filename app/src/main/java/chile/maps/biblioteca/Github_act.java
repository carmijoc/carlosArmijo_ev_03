package chile.maps.biblioteca;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;



public class Github_act extends AppCompatActivity {

    private Spinner spn;
    private TextView tv;
    private String[] precios = new String[]{"7000", "22000", "45000","88000","156000"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libros_act);

        spn = (Spinner)findViewById(R.id.spn);
        tv = (TextView)findViewById(R.id.result);

        Bundle dat = getIntent().getExtras();
        String[] lista = dat.getStringArray("libros");

        ArrayAdapter adapt = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, lista);

        spn.setAdapter(adapt);

    }

    public void Consulta(View v)
    {
        if(spn.getSelectedItem().equals("Farenheit"))
        {
            String precio = precios[0];
            int pc = Integer.parseInt(precio);
            int resultado = pc;

            tv.setText("El valor de : "+ precio + "\n"
                    + "es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("Revival"))
        {
            String precioRevival = precios[1];
            int pc = Integer.parseInt(precioRevival);
            int resultado = pc;

            tv.setText("El valor de : "+ precioRevival + "\n"
                    + "es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("El Alquimista"))
        {

            String precioTesla = precios[2];
            int pc = Integer.parseInt(precioTesla);
            int resultado = pc;

            tv.setText("El valor de : "+ precioTesla + "\n"
                    + "es: "+ resultado);
        }

        if(spn.getSelectedItem().equals("El Poder"))
        {

            String precioTesla = precios[2];
            int pc = Integer.parseInt(precioTesla);
            int resultado = pc;

            tv.setText("El valor de : "+ precioTesla + "\n"
                    + "es: "+ resultado);
        }
        if(spn.getSelectedItem().equals("Despertar"))
            {
                String precioTesla = precios[2];
                int pc = Integer.parseInt(precioTesla);
                int resultado = pc;

                tv.setText("El valor de : "+ precioTesla + "\n"
                        + "es: "+ resultado);
            }
    }
}
