package com.example.portaldaneshjo.Adapters.ListViewAdapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.portaldaneshjo.R;


import com.example.portaldaneshjo.Model.ListItem_BarnameHaftegi;

import java.util.ArrayList;

public class Listview_barname_haftegi extends ArrayAdapter<ListItem_BarnameHaftegi> {
    Context context ;
    ArrayList<ListItem_BarnameHaftegi>listItem_barnameHaftegi;
    public Listview_barname_haftegi(@NonNull Context context,  ArrayList<ListItem_BarnameHaftegi>listItem_barnameHaftegi) {
        super(context, 0 , listItem_barnameHaftegi);
        this.context = context ;
        this.listItem_barnameHaftegi = listItem_barnameHaftegi;


    }


    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ListItem_BarnameHaftegi listItem_barnameHaftegi = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_barname_haftegi_listview ,parent,false);
        }
        TextView courseName = convertView.findViewById(R.id.txt_course_name);
        TextView teacherName = convertView.findViewById(R.id.txt_teacher_name);
        TextView vahedeAmali = convertView.findViewById(R.id.txt_vahede_amali);
        TextView vahedeNazari = convertView.findViewById(R.id.txt_vahede_nazari);
        TextView jensiat = convertView.findViewById(R.id.txt_jensiat);
        TextView tarikheEmtehan = convertView.findViewById(R.id.txt_tarikhe_emtehan);
        assert listItem_barnameHaftegi != null ;

        courseName.setText(listItem_barnameHaftegi.getNameDars());
        teacherName.setText(listItem_barnameHaftegi.getNameOstad());
        vahedeAmali.setText(String.valueOf(listItem_barnameHaftegi.getTedadeVahedeAmali()));
        vahedeNazari.setText(String.valueOf(listItem_barnameHaftegi.getTedadeVahedeNazari()));
        jensiat.setText(listItem_barnameHaftegi.getJensiat());
        tarikheEmtehan.setText(listItem_barnameHaftegi.getTarikheEmtehan());
        return convertView ;
    }
}
