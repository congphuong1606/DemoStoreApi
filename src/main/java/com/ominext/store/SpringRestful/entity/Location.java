package com.ominext.store.SpringRestful.entity;

import com.fasterxml.jackson.core.SerializableString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="tbl_location")
public class Location implements Serializable {
    @Id
    private long locationId;
    private float locationLat;
    private float locationLng;


    public long getLocationId() {
        return locationId;
    }

    public void setLocationId(long locationId) {
        this.locationId = locationId;
    }

    public float getLocationLat() {
        return locationLat;
    }

    public void setLocationLat(float locationLat) {
        this.locationLat = locationLat;
    }

    public float getLocationLng() {
        return locationLng;
    }

    public void setLocationLng(float locationLng) {
        this.locationLng = locationLng;
    }


}
