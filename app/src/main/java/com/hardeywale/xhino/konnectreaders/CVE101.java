package com.hardeywale.xhino.konnectreaders;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CVE101 extends ListActivity {


    String courses[] = {"complete Handout", "Practice Question","Summary"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses));

    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        if (id==0){
            Intent intent = new Intent(this, Handoutcve.class);
            startActivity(intent);


        }




        if (id==1){
            Intent intent = new Intent(this, Cvepract.class);
            startActivity(intent);


        }


        if (id==2){
            Intent intent = new Intent(this,Cvesum.class);
            startActivity(intent);


        }





    }
}