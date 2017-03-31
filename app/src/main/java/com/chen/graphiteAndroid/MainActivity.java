package com.chen.graphiteAndroid;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.example.chen.graphiteandroid.R;

import org.sil.palaso.Graphite;

public class MainActivity extends AppCompatActivity {
    Typeface mtfp;
    // Used to load the 'native-lib' library on application startup.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Graphite.loadGraphite();
        mtfp = (Typeface)Graphite.addFontResource(getAssets(), "MenkHar_a_NoFtrTig.ttf", "MenkHar", 0, "", "");
        setContentView(R.layout.activity_main);
        String s = "ᠠᠠᠠᠠᠬᠰᠹᠺᠵᠬᠠᠰᠳᠹᠬᠺᠠᠹᠬᠺᠠᠰᠳᠵᠹᠺᠠᠰᠬᠳᠹᠺᠯᠠᠰᠬᠵᠳᠠᠰᠺᠯᠬᠹᠠ";
        // Example of a call to a native method
        EditText tv = (EditText) findViewById(R.id.editText2);
        tv.setTypeface(mtfp);
        tv.setText(s);
    }
}
