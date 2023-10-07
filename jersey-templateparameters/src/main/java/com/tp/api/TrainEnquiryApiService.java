package com.tp.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/train")
public class TrainEnquiryApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{trainNo}/enquiry")
    public String getTrainStatus(@PathParam("trainNo") String trainNo){
        return "on-hold";
    }
}
