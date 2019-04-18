package com.hardeywale.xhino.konnectreaders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class CSC101 extends AppCompatActivity {


  PDFView csc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csc101);

        csc =(PDFView) findViewById(R.id.csc101);
        csc.fromAsset("csc101.pdf").load();
}

}

