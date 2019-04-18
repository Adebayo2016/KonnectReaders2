package com.hardeywale.xhino.konnectreaders;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Courses extends ListActivity {



    String courses[] ={"GNS101", "PHY101", "PHY103", "MTS101", "GNS103","CHE101","MEE101","BIO101", "CVE105","CSC101","Click to Request for other PDF / PQ"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, courses));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        if (id == 9) {

            Intent sharon= new Intent (this, CSC101.class);
            startActivity(sharon);







        }


        if (id == 4) {
            Intent intent = new Intent(this, GNS103.class);
            intent.putExtra("trans","gns103");
            startActivity(intent);


        }

        if (id == 6) {

            Intent intent = new Intent(this, MEE101.class);
            startActivity(intent);
        }

        if (id == 1)  {

            Intent intent = new Intent(this, Phy101.class);
            startActivity(intent);
        }

        if (id == 0)  {

            Intent intent = new Intent(this, GnsList.class);
            startActivity(intent);


    }

        if (id == 3)  {

            Intent intent = new Intent(this, MTS101.class);
            startActivity(intent);


        }




        if (id ==8)  {

            Intent intent = new Intent(this, CVE101.class);
            startActivity(intent);



        }


        if (id ==5)  {

            Intent intent = new Intent(this, CHE101.class);
            startActivity(intent);



        }

        if (id==2){

            Intent paul = new Intent(this, Phy103.class);
            startActivity(paul);
        }

        if (id==7){

            Intent paul = new Intent(this, BIO101.class);
            startActivity(paul);
        }
        if (id==10){
            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            String url2 = "https://wa.me/2349061504461?text=Please i need a pdf on ";
            intent2.setData(Uri.parse(url2));
            startActivity(intent2);



        }







    }}

