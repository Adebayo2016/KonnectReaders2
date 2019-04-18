package com.hardeywale.xhino.konnectreaders;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MTSpra  extends AppCompatActivity {

    PDFView past;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_gns);

        past = (PDFView)findViewById(R.id.pastgns);
        past.fromAsset("mtstut.pdf").load();

    }
}