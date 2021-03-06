package br.com.teravalt.toastapp;

import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.teravalt.minhabiblioteca.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomToast customToast = new CustomToast();
        if(BuildConfig.REPORT_CRASH) {
            customToast.showToast(this, "Resport Crash");
        }else {
            customToast.showToast(this, "Mensagem de teste");
        }
    }
}
