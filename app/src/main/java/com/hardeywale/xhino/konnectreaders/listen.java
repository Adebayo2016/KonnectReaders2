package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class listen extends AppCompatActivity {

    PDFView list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listen);

        list=(PDFView)findViewById(R.id.listen);
        list.fromAsset("listening.pdf").load();


    }
}
