package com.ri.api.automaticparam;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/shipment")
public class ShipmentApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{awbNo}/track")
    public String track(@PathParam("awbNo") AwbNo awbNo){
        return "AwbNo : " + awbNo + ", Status : In-Transit";
    }
}