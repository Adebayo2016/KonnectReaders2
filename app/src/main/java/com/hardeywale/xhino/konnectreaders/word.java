package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class word extends AppCompatActivity {
    PDFView wf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word);

        wf=(PDFView)findViewById(R.id.word);
        wf.fromAsset("word.pdf").load();



    }
}
