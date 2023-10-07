package com.srm.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/book")
public class BookApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/price")
    public double getBookPrice(@QueryParam("isbnNo") String isbnNo){
        return new SecureRandom().nextDouble(10000);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/author")
    public String getBookAuthor(@QueryParam("isbnNo") String isbnNo){
        return "Paul";
    }
}
