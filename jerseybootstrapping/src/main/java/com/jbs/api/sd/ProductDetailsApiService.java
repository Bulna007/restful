package com.jbs.api.sd;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/productDetails")
public class ProductDetailsApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getBrandName(@QueryParam("productNo") String productNo){
        return "parle";
    }
}
