package com.example.portaldaneshjo.Activity.Omor_amozeshi_activities;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;

import com.example.portaldaneshjo.Adapters.ListViewAdapter.Listview_barname_haftegi;
import com.example.portaldaneshjo.Adapters.SpinnerAdapter_Nimsal;
import com.example.portaldaneshjo.Model.ListItem_BarnameHaftegi;
import com.example.portaldaneshjo.Model.Nimsaltahsili;
import com.example.portaldaneshjo.R;

import java.util.ArrayList;

public class BarnameHaftegi extends AppCompatActivity {

    Toolbar toolbar;
    ListView listView;
    private Spinner spinner;
    private SpinnerAdapter_Nimsal sAdapter;
    private ArrayList<ListItem_BarnameHaftegi>listItem_barnameHaftegis ;
    private Listview_barname_haftegi listViewAdapter_barnameHaftegi ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barname_haftegi);
        listView = (ListView)findViewById(R.id.listView_barname_haftegi);
        toolbar = (Toolbar) findViewById(R.id.toolbar_barnamehaftegi_id);
        spinner = (Spinner) findViewById(R.id.spn_nimsaltahsili_barnamehaftegi_id);
        toolbar.setTitle("برنامه هفتگی");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final ArrayList<Nimsaltahsili> nimsaltahsili = new ArrayList<>();
        nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 97 - 98"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 97 - 98"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال اول 98 - 99"));
        nimsaltahsili.add(new Nimsaltahsili("نیمسال دوم 98 - 99"));

        sAdapter = new SpinnerAdapter_Nimsal(BarnameHaftegi.this,nimsaltahsili);
        spinner.setAdapter(sAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Snackbar snackbar = Snackbar.make(view,nimsaltahsili.get(position).getNimsal(),Snackbar.LENGTH_SHORT);
                snackbar.show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //اسپینر برای انتخاب نیمسال تحصیلی


        listItem_barnameHaftegis = new ArrayList<ListItem_BarnameHaftegi>();
        listViewAdapter_barnameHaftegi = new Listview_barname_haftegi(getApplicationContext() , listItem_barnameHaftegis);
        barnameHaftegiListView();
        listView.setAdapter(listViewAdapter_barnameHaftegi);
    }

    public void barnameHaftegiListView(){
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
        listItem_barnameHaftegis.add(new ListItem_BarnameHaftegi("برنامه نویسی مقدماتی" ,"عباسی",3,3,"مرد","۲۲/۴/۵"));
    }


}
