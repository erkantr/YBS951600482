package tr.edu.medipol.ybs95160048;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MyCityActivity extends AppCompatActivity {

    ImageView image;

    Spinner spinner;
    String myCity[] = {"Perre Antik Kenti", "Beştepeler", "Arsemia Antik Kenti", "Cendere Köprüsü",
            "Aziz Paul Kilisesi", "Eskisaray Camii", "Adıyaman Müzesi", "Turuş Kaya Mezarları"};

    int images[] = {R.drawable.perre1, R.drawable.bestepeler1, R.drawable.arsemia1, R.drawable.cendere_koprusu1, R.drawable.aziz_paul_kilisesi1,
            R.drawable.eskisaray_camii1, R.drawable.adiyaman_muzesi1, R.drawable.turus_kaya_mezarlari1};
    TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_city);
        spinner = findViewById(R.id.spinner);
        image = findViewById(R.id.imagevw);
        name = findViewById(R.id.name);
        ImageView back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NavUtils.navigateUpFromSameTask(MyCityActivity.this);
            }
        });


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                name.setText(myCity[position]);

                switch (position) {
                    case 0:
                    default:
                        image.setImageResource(R.drawable.perre);

                        break;
                    case 1:
                        image.setImageResource(R.drawable.bestepeler);

                        break;
                    case 2:
                        image.setImageResource(R.drawable.arsemia);

                        break;
                    case 3:
                        image.setImageResource(R.drawable.cendere_koprusu);

                        break;
                    case 4:
                        image.setImageResource(R.drawable.aziz_paul_kilisesi);

                        break;
                    case 5:
                        image.setImageResource(R.drawable.eskisaray_camii);

                        break;
                    case 6:
                        image.setImageResource(R.drawable.adiyaman_muzesi);

                        break;
                    case 7:
                        image.setImageResource(R.drawable.turus_kaya_mezarlari);

                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        MyAdapter adapter = new MyAdapter(MyCityActivity.this, images, myCity);
        spinner.setAdapter(adapter);
    }
}
