package com.sr.nr;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

public class PhilipsHomeApplianceApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{serialNo}/extendedWarranty")
    public String extendedWarranty(@PathParam("serialNo") String serialNo){
        return "{'SerialNo':'"+serialNo+"','ExtendedDate':'"+ LocalDate.now().plusMonths(12)+"'}";
    }
}
