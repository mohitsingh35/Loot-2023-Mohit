package com.hackncs.zealicon.loot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NewActivity extends AppCompatActivity {
    Button button;
    BottomScreenFile bottomScreenFile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
        try {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e) {
        }
        button=findViewById(R.id.bottom_screen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BottomScreenFile bottomSheet = new BottomScreenFile();
                bottomSheet.show(getSupportFragmentManager(), "bottomsheet");
            }
        });

    }
}