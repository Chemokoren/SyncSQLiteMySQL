package com.msomihub.synctest;

/**
 * Created by kibsoft on 12/24/17.
 */

public class Contact {

    private String Name;
    private int Sync_status;

    public Contact(String Name, int Sync_status) {
        this.setName(Name);
        this.setSync_status(Sync_status);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getSync_status() {
        return Sync_status;
    }

    public void setSync_status(int sync_status) {
        Sync_status = sync_status;
    }
}
