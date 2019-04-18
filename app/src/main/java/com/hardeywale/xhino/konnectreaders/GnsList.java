package com.hardeywale.xhino.konnectreaders;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GnsList extends ListActivity {
    String [] topic = { "time management", " critical literacy","word formation","listening", "writing","Practice question"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter < String >( this, android.R.layout.simple_list_item_1,topic));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {



        if (id == 1){
            Intent intent = new Intent ( this, Critical.class);
            startActivity( intent );

        }

        if (id == 0){
            Intent intent = new Intent ( this, Time.class);
            startActivity( intent );



        }


        if (id == 2){
            Intent intent = new Intent ( this, word.class);
            startActivity( intent );




}

        if (id == 5){
            Intent intent = new Intent ( this, pastGns.class);
            startActivity( intent );

    }

        if (id == 3){
            Intent intent = new Intent ( this, listen.class);
            startActivity( intent );

}

        if (id == 4){
            Intent intent = new Intent ( this, writing.class);
            startActivity( intent );

}
}}

