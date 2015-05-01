package edu.sjsu.cmpe273.facebookarchiver.entity;

/**
 * Created by emy on 4/25/15.
 */
public class PhotoInfo {

    private String id;
    private String createdAt;

    public PhotoInfo() {}

    public void setId(String id){
        this.id=id;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
}
