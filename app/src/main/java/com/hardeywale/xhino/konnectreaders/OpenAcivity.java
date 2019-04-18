package com.hardeywale.xhino.konnectreaders;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import java.util.Objects;

public class OpenAcivity extends AppCompatActivity {
    String receivedData=getIntent().getExtras().getString("trans");
    PDFView pdfView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_acivity);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Objects.equals(receivedData, "gns103")){


                pdfView = (PDFView)findViewById(R.id.pdf);
                pdfView.fromAsset("gns103.pdf").load();

            }
        }


    }
}
