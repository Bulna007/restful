package com.nb.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/account")
public class AccountApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public double getBalance(@QueryParam("accountNo") String accountNo){
        return new SecureRandom().nextDouble(10000);
    }
}
