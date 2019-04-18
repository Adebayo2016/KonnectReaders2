package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pastGns extends AppCompatActivity {

    PDFView past;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_gns);

        past = (PDFView)findViewById(R.id.pastgns);
        past.fromAsset("practice.pdf").load();

    }
}
