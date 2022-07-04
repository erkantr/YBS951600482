package tr.edu.medipol.ybs95160048;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button call;
    Button sendMail;
    Button city;
    Button courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        call = findViewById(R.id.call);
        sendMail = findViewById(R.id.sendMail);
        city = findViewById(R.id.city);
        courses = findViewById(R.id.courses);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri mUri = Uri.parse("tel:555550000");
                Intent call = new Intent(Intent.ACTION_DIAL, mUri);
                startActivity(call);

            }
        });

        sendMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent sendMail = new Intent(Intent.ACTION_SEND);
                sendMail.setType("plain/text");
                String[] mail = {"erkanm11t@gmail.com"};
                sendMail.putExtra(Intent.EXTRA_EMAIL, mail);
                startActivity(sendMail);

            }
        });

        city.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cityActivity = new Intent(MainActivity.this, MyCityActivity.class);
                startActivity(cityActivity);
            }
        });

        courses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent courses = new Intent(MainActivity.this, CoursesActivity.class);
                startActivity(courses);
            }
        });

    }
}
