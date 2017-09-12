package com.beohar.priyesh.buslocation;

/**
 * Created by priyesh on 7/9/17.
 */

public class BusAllot {
    private String busNumber;

    public String getBusNumber() {
        return busNumber;
    }

    public void setBusNumber(String driverID) {


        //String bn = FirebaseDatabase.getInstance().getReference("driver").child(driverID).child("busno/").toString();
        //DatabaseReference dR = FirebaseDatabase.getInstance().getReference("driver").child(driverID);
        //Query query = ref.orderByChild("Author").equalTo("Author1", "Author");
        //String bno = dR.getRef("busno").addListenerForSingleValueEvent();
        //var dbreflat = firebase.database().ref('bus').child('bus2/lat');

        //FirebaseDatabase database = FirebaseDatabase.getInstance();
        //DatabaseReference myRef = database.getReference("driver").child(driverID).child("busno");



        this.busNumber = "bus2";
        //Toast.makeText(getApplicationContext(), "ek baar aaya", Toast.LENGTH_LONG).show();
        // 6f7BiwBUWkbUeOJcDQ4dxCgUmzX2
    }
}
