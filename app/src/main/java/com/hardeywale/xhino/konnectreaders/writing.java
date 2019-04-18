package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class writing extends AppCompatActivity {



    PDFView write;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_writing);

        write = (PDFView)findViewById(R.id.write);
        write.fromAsset("writing.pdf").load();

    }
}
