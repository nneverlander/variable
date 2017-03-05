package me.variable.common;

import com.google.apphosting.datastore.EntityV4;

/**
 * Created by adi on 3/5/17.
 */
public class Location {

    private String country;
    private String city;
    private String state;
    private String zip;
    private String address;
    private EntityV4.GeoPoint geoPoint;

    public Location(EntityV4.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }

    public Location(String country, String state, String city, String address, String zip, EntityV4.GeoPoint geoPoint) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.geoPoint = geoPoint;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public EntityV4.GeoPoint getGeoPoint() {
        return geoPoint;
    }

    public void setGeoPoint(EntityV4.GeoPoint geoPoint) {
        this.geoPoint = geoPoint;
    }
}
