package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Critical extends AppCompatActivity {


    PDFView critical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_critical);

        critical = (PDFView)findViewById(R.id.critical);
        critical.fromAsset("critical.pdf").load();
    }

}
