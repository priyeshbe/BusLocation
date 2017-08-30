package com.beohar.priyesh.buslocation;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by priyesh on 23/8/17.
 */

@IgnoreExtraProperties
public class BusUpdate {

    private String busId;
    private String busno;
    private String lat;
    private String lng;

    public BusUpdate(){    }

    public BusUpdate(String busId, String busno, String lat, String lng) {
        this.busId = busId;
        this.busno = busno;
        this.lat = lat;
        this.lng = lng;
    }

    public String getBusId() { return busId; }
    public String getBusno() { return busno; }
    public String getLat() { return lat; }
    public String getLng() { return lng; }
}
