package com.fizha.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Profil extends AppCompatActivity implements View.OnClickListener {
    Button ig;
    Button fb;
    Button twit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        ig = (Button) findViewById(R.id.instagram);
        ig.setOnClickListener(this);

        fb = (Button) findViewById(R.id.facebook);
        fb.setOnClickListener(this);

        twit = (Button) findViewById(R.id.twitter);
        twit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
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