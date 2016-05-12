package co.herovitamin.preferencias;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences preferences = getSharedPreferences("MY_XML", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("NOMBRE", "Kerry T. Perez");
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();

        //SharedPreferences preferences = getPreferences(MODE_PRIVATE);
        SharedPreferences preferences = getSharedPreferences("MY_XML", MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();

        editor.putString("NOMBRE", "Kerry Perez Huanca");
        editor.commit();
    }
}
