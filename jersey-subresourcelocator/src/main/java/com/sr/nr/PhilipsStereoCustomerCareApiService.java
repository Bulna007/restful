package com.sr.nr;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

public class PhilipsStereoCustomerCareApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{serialNo}/warranty")
    public String getWarranty(@PathParam("serialNo") String serialNo){
        return "{'SerialNo':'"+serialNo+"','Warranty':'In-Warranty'";
    }
}
