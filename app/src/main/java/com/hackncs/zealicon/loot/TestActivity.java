package com.hackncs.zealicon.loot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.hackncs.zealicon.loot.databinding.ActivityTestBinding;

public class TestActivity extends AppCompatActivity {
    ActivityTestBinding binding;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTestBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        textView=binding.textView9;
        button= binding.testbutton;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isEmulator()){
                    textView.setText("Emulator detected");
                }else{
                    textView.setText("Not a Emulator");
                }
            }
        });
    }
    public static boolean isEmulator() {
        boolean isEmulator = false;
        String model = Build.MODEL;
        String product = Build.PRODUCT;
        String manufacturer = Build.MANUFACTURER;
        String brand = Build.BRAND;
        if (model != null && model.toLowerCase().contains("sdk")
                || product != null && product.toLowerCase().contains("sdk")
                || manufacturer != null && manufacturer.toLowerCase().contains("genymotion")
                || brand != null && brand.toLowerCase().contains("generic")) {
            isEmulator = true;
        }
        return isEmulator;
    }

}