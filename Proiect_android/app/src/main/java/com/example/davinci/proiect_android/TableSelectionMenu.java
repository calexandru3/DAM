package com.example.davinci.proiect_android;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.net.Network;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TableSelectionMenu extends AppCompatActivity {


    ListView listDomains;
    final int COD_CERERE_ADAUGA = 1;
    MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table_selection_menu);

        ListDomain.update();//TODO database update
        listDomains = (ListView) findViewById(R.id.Lista);
        myAdapter = new MyAdapter(this,ListDomain.getList());
        listDomains.setAdapter(myAdapter);

        listDomains.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent mIntent = new Intent(TableSelectionMenu.this, Detalied.class);
                ArrayList<Domain> lista = ListDomain.getList();
                mIntent.putExtra("domain",lista.get(position).getTitle());
                startActivity(mIntent);
            }
        });


    }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if((requestCode == COD_CERERE_ADAUGA) && (resultCode == RESULT_OK)) {
            myAdapter.notifyDataSetChanged();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.navigation_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.adauga:
                Intent intent = new Intent(this, AddDomains.class);
                startActivityForResult(intent,COD_CERERE_ADAUGA);
                return true;
            case R.id.modifica:

                return true;
            case R.id.log_out:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }



}

















