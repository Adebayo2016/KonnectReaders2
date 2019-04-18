package com.hardeywale.xhino.konnectreaders;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.io.File;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY,19);
        calendar.set(Calendar.MINUTE,40);
        calendar.set(Calendar.SECOND,00);


        Intent intent = new Intent (getApplicationContext(), Notification_Receiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(getApplicationContext(),100,intent ,PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager=(AlarmManager)getSystemService(ALARM_SERVICE);
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY,pendingIntent);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Konnect'19(09061504461), oluoke123@gmail.com", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_course) {

            Intent intent = new Intent(this, Courses.class);

            startActivity(intent);


        } else if (id == R.id.nav_request) {

            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            String url2 = "https://wa.me/2349061504461?text=Please i need a pdf on ";
            intent2.setData(Uri.parse(url2));

            startActivity(intent2);

        } else if (id == R.id.nav_online) {

            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            String url2 = "http://learn.futa.edu.ng";
            intent2.setData(Uri.parse(url2));

            startActivity(intent2);


        } else if (id == R.id.nav_share) {

            ApplicationInfo api= getApplicationContext().getApplicationInfo();

            String Apkpath=api.sourceDir;
            Intent intent = new Intent (Intent.ACTION_SEND);
            intent.setType("application/vnd.android.package-archive");
            intent.putExtra(Intent.EXTRA_STREAM,Uri.fromFile(new File(Apkpath)));
            startActivity(Intent.createChooser(intent,"Share with other futarians Using "));




        } else if (id == R.id.nav_join) {




            Intent intent2 = new Intent(Intent.ACTION_VIEW);
            String url2 = "https://chat.whatsapp.com/EFQj3tTO3TR5jZKBBMfVc4";
            intent2.setData(Uri.parse(url2));

            startActivity(intent2);



        }else if (id==R.id.nav_about){
            Intent intent = new Intent(this, About.class);
            startActivity(intent);





        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void OpenMts(View view) {
        Intent intent = new Intent (this,TutorialSolution.class );
        startActivity(intent);


    }

    public void Aboutdev(View view) {

        Intent intent = new Intent(this, AboutDev.class);
        startActivity(intent);
    }

    public void phyrev(View view) {

        Intent intent = new Intent (this, PhyRev.class);
        startActivity(intent);
    }

    public void gnsope(View view) {

        Intent intent = new Intent(this, Gns.class);
        startActivity(intent);

    }
}
