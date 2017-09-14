package com.beohar.priyesh.buslocation;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by priyesh on 23/8/17.
 */

@IgnoreExtraProperties
public class BusUpdate {

    private String busId;
    private String lat;
    private String lng;

    public BusUpdate(){    }

    public BusUpdate(String busId, String lat, String lng) {
        this.busId = busId;
        this.lat = lat;
        this.lng = lng;
    }

    public String getBusId() { return busId; }
    public String getLat() { return lat; }
    public String getLng() { return lng; }
}
