package com.example.davinci.proiect_android;

import java.util.ArrayList;

/**
 * Created by davinci on 11/11/17.
 */

public class ListDomain {
    public static ArrayList<Domain> list = new ArrayList<>();
    public static ArrayList getList(){return list;}

    public ListDomain() {
    }

    public static void update(){
        list.clear();
        Domain new_dom = new Domain(1,"Art","Main articles: European art and Western painting.",
                R.drawable.art );
        Domain new_dom_2 = new Domain(2,"Music","Music is an art form and cultural activity whose medium is sound organized in time.",R.drawable.music);
        ListDomain.getList().add(new_dom);
        ListDomain.getList().add(new_dom_2);
    }
}
