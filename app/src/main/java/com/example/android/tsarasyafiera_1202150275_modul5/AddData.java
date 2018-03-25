package com.example.android.tsarasyafiera_1202150275_modul5;

/**
 * Created by TSARA on 25/03/2018.
 */

public class AddData {
    //deklarasi variabel
    String todo, desc, prior;

    //konstruktor pada add data
    public AddData(String todo, String desc, String prior){
        this.todo=todo;
        this.desc=desc;
        this.prior=prior;
    }

    //method setter dan getter untuk to do , description dan priority
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPrior() {
        return prior;
    }

    public void setPrior(String prior) {
        this.prior = prior;
    }
}

