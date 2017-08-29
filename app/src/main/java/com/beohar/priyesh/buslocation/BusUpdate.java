package com.beohar.priyesh.buslocation;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by priyesh on 23/8/17.
 */

@IgnoreExtraProperties
public class BusUpdate {

    private String locBusno;
    private String locLat;
    private String locLng;

    public BusUpdate(){

    }

    public BusUpdate(String locBusno, String locLat, String locLng) {
        this.locBusno = locBusno;
        this.locLat = locLat;
        this.locLng = locLng;
    }

    public String getLocBusno() { return locBusno; }
    public String getLocLat() {
        return locLat;
    }
    public String getLocLng() {
        return locLng;
    }
}
