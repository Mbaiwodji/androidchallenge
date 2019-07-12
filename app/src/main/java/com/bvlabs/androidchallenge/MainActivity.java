package com.bvlabs.androidchallenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mAboutButton;
    Button mProfileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAboutButton = (Button) findViewById(R.id.bt_about_alc);
        mProfileButton =(Button) findViewById(R.id.bt_profile);

        mAboutButton.setOnClickListener(this);
        mProfileButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_profile:
                startActivity(new Intent(this,MyProfile.class));
                return;
            case R.id.bt_about_alc:
                startActivity(new Intent(this,AboutALC.class));
                return;
        }
    }
}
