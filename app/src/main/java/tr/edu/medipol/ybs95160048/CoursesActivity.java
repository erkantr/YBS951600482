package tr.edu.medipol.ybs95160048;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CoursesActivity extends AppCompatActivity {


    ListAdapter listAdapter;

    List<Listv> courses = new ArrayList<Listv>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);

        ListView listView = findViewById(R.id.listview);
        this.setTitle(R.string.donem_dersleri);


        courses.add(new Listv("Ekonominin Temelleri", R.drawable.ekonomi));
        courses.add(new Listv("Mobil Programlama", R.drawable.mobil_programlama));
        courses.add(new Listv("Lojistik Yönetimi", R.drawable.lojistik_yonetimi));
        courses.add(new Listv("Bilişim Sistemleri ve E-İşletme", R.drawable.bilisim_sistemleri_ve_e_isletme));
        courses.add(new Listv("Veri Madenciliği ve İş Zekası", R.drawable.veri_madenciligi_ve_is_zekasi));
        courses.add(new Listv("Müşteri İlişkileri Yönetimi", R.drawable.musteri_iliskileri_yonetimi));
        courses.add(new Listv("Girişimcilik", R.drawable.girisimcilik));
        courses.add(new Listv("Bilişim Projeleri Yönetimi", R.drawable.bilisim_projeleri_yonetimi));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Toast.makeText(CoursesActivity.this, "Ekonominin Temelleri", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(CoursesActivity.this, "Mobil Programlama", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(CoursesActivity.this, "Lojistik Yönetimi", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(CoursesActivity.this, "Bilişim Sistemleri ve E-İşletme", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(CoursesActivity.this, "Veri Madenciliği ve İş Zekası", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(CoursesActivity.this, "Müşteri İlişkileri Yönetimi", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(CoursesActivity.this, "Girişimcilik", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(CoursesActivity.this, "Bilişim Projeleri Yönetimi", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        listAdapter = new ListAdapter(CoursesActivity.this, courses);
        listAdapter = new ListAdapter(CoursesActivity.this, courses);
        listView.setAdapter(listAdapter);


    }
}
