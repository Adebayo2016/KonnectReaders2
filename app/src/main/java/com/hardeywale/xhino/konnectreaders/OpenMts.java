package com.hardeywale.xhino.konnectreaders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class OpenMts extends AppCompatActivity {

    PDFView sets;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csc101);

       sets= (PDFView)findViewById(R.id.csc101);
       sets.fromAsset("sets.pdf").load();








    }

}