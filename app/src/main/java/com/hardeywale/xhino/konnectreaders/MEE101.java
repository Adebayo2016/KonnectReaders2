package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MEE101 extends AppCompatActivity {

    PDFView mee101;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mee101);


        mee101= (PDFView)findViewById(R.id.mee);
        mee101.fromAsset("mee101.pdf").load();








    }
}
