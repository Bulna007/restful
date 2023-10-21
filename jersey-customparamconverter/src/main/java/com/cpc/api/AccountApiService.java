package com.cpc.api;

import com.cpc.dto.AccountNo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/account")
public class AccountApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("{accountNo}/balance")
    public String getBalance(@PathParam("accountNo") AccountNo accountNo){
        return "83279";
    }
}
