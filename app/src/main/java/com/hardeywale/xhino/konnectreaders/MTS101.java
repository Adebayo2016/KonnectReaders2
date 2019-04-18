package com.hardeywale.xhino.konnectreaders;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MTS101 extends ListActivity {

    String[] Mts= {"Set theory","Sequence and series ", "Trigonometry","practice Questions",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setListAdapter( new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Mts));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        if (id==0){
            Intent intent = new Intent(this, OpenMts.class);
            startActivity(intent);


        }



        if (id==1){
            Intent intent = new Intent(this, Sequence.class);
            startActivity(intent);


        }

        if (id==2){
            Intent intent = new Intent(this, Trigono.class);
            startActivity(intent);


        }

        if (id==3){
            Intent intent = new Intent(this, MTSpra.class);
            startActivity(intent);


        }






    }
}
