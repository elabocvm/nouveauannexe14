package eric.labonte.projetannexe14;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner spin;
    TextView nbPass;
    BanqueAeroport instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin = findViewById(R.id.spinner);
        nbPass = findViewById(R.id.texteNBPassagers);
        instance = BanqueAeroport.getInstance();
        ArrayAdapter a = new ArrayAdapter(this, android.R.layout.simple_list_item_1, instance.retournerVilles() );
        spin.setAdapter(a);

        Ecouteur ec = new Ecouteur();
        spin.setOnItemSelectedListener(ec);
    }
    private class Ecouteur implements AdapterView.OnItemSelectedListener
    {

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
            String villeSec = (String)spin.getSelectedItem();
            //début du calcul
            long tempsDebut = System.nanoTime();
            nbPass.setText(String.valueOf(instance.retournerAchalandage(villeSec)));
            long tempsFin = System.nanoTime();
            //fin du calcul
            System.out.println ( tempsFin - tempsDebut);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }
}