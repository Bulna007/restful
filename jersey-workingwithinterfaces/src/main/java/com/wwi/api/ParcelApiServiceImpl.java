package com.wwi.api;

import jakarta.ws.rs.Path;

@Path("/parcel")
public class ParcelApiServiceImpl implements ParcelApiService{
    public String trackParcel(String awbNo){
        return "in-transit";
    }
}
