package com.ri.api.regex;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("/profile")
public class ProfileApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{mobileNo:\\d{10}}/details")
    public String getProfile(@PathParam("mobileNo") String mobileNo){
        return "{'MobileNo':'"+mobileNo+"','dob':'"+ LocalDate.of(1999,12,22).toString()+"','Gender':'Male'}";
    }
}
