package com.fizha.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button explicitIntent;
    Button implicitIntent;
    Button profil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        explicitIntent = (Button) findViewById(R.id.explicit_intent);
        explicitIntent.setOnClickListener(this);

        implicitIntent = (Button) findViewById(R.id.implicit_intent);
        implicitIntent.setOnClickListener(this);

        profil = (Button) findViewById(R.id.profil_intent);
        profil.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.explicit_intent:
                Intent explicit = new Intent(MainActivity.this, IntentActivity.class);
                startActivity(explicit);
                break;
            case R.id.implicit_intent:
                Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.w3schools.com"));
                startActivity(implicit);
                break;
            case R.id.profil_intent:
                Intent profil = new Intent(MainActivity.this, Profil.class);
                startActivity(profil);
                break;
            case R.id.instagram:
                Intent insta = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/fidzfadillah"));
                startActivity(insta);
                break;
            case R.id.facebook:
                Intent face = new Intent(Intent.ACTION_VIEW, Uri.parse("https://facebook.com/hafidz.fadillah.184"));
                startActivity(face);
                break;
            case R.id.twitter:
                Intent tw = new Intent(Intent.ACTION_VIEW, Uri.parse("https://mobile.twitter.com/fidzfadillah_"));
                startActivity(tw);
                break;
            default:
                break;
        }
    }
}