package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Time extends AppCompatActivity {
    PDFView tm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        tm=(PDFView)findViewById(R.id.time);
        tm.fromAsset("times.pdf").load();



    }


}
