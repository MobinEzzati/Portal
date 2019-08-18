package com.example.portaldaneshjo.Model;

import java.util.Date;

public class ListItem_BarnameHaftegi {
    private String nameDars ;
    private String nameOstad;
    private int tedadeVahedeAmali;
    private int tedadeVahedeNazari ;
    private String jensiat ;
   private String TarikheEmtehan ;

    public ListItem_BarnameHaftegi(String nameDars, String nameOstad, int tedadeVahedeAmali, int tedadeVahedeNazari, String jensiat, String tarikheEmtehan) {
        this.nameDars = nameDars;
        this.nameOstad = nameOstad;
        this.tedadeVahedeAmali = tedadeVahedeAmali;
        this.tedadeVahedeNazari = tedadeVahedeNazari;
        this.jensiat = jensiat;
        this.TarikheEmtehan = tarikheEmtehan;
    }

    public String getJensiat() {
        return jensiat;
    }

    public void setJensiat(String jensiat) {
        this.jensiat = jensiat;
    }

    public String getNameDars() {
        return nameDars;
    }

    public void setNameDars(String nameDars) {
        this.nameDars = nameDars;
    }

    public String getNameOstad() {
        return nameOstad;
    }

    public void setNameOstad(String nameOstad) {
        this.nameOstad = nameOstad;
    }

    public int getTedadeVahedeAmali() {
        return tedadeVahedeAmali;
    }

    public void setTedadeVahedeAmali(int tedadeVahedeAmali) {
        this.tedadeVahedeAmali = tedadeVahedeAmali;
    }

    public int getTedadeVahedeNazari() {
        return tedadeVahedeNazari;
    }

    public void setTedadeVahedeNazari(int tedadeVahedeNazari) {
        this.tedadeVahedeNazari = tedadeVahedeNazari;
    }

    public String getTarikheEmtehan() {

        return TarikheEmtehan;
    }

    public void setTarikheEmtehan(String tarikheEmtehan) {

        this.TarikheEmtehan = tarikheEmtehan;
    }
}
