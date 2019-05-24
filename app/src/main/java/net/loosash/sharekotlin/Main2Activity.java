package net.loosash.sharekotlin;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import net.loosash.sharekotlin.demo.CustomView;
import net.loosash.sharekotlin.demo.KTExtensionKt;
import net.loosash.sharekotlin.javacoder.KTStaticMethod;
import net.loosash.sharekotlin.javacoder.Preference;

import javax.net.ssl.ExtendedSSLSession;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        KTExtensionKt.times("abc",3);


        CustomView customView = new CustomView(this);
     }
}
