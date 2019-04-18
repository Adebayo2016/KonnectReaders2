package com.hardeywale.xhino.konnectreaders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.github.barteksc.pdfviewer.PDFView;

public class GNS103 extends AppCompatActivity {



PDFView gns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gns103);
        Toast.makeText(this, "lectures may be different from this handout", Toast.LENGTH_LONG).show();

        gns= (PDFView)findViewById(R.id.gns103);
        gns.fromAsset("gns103.pdf").load();

    }
}
