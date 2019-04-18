package com.hardeywale.xhino.konnectreaders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class Biopract extends AppCompatActivity {

    PDFView phy101;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phy101);

        phy101 = (PDFView) findViewById(R.id.phy);
        phy101.fromAsset("bioprat.pdf").load();


    }
}