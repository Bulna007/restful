package com.jbs.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/product")
public class ProductApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{productNo}/price")
    public double getProductPrice(@PathParam("productNo") String productNo){

        return new SecureRandom().nextDouble();
    }
}
