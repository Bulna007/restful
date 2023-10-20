package com.ri.api.cookieparam;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/uber")
public class UberCabApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{source}/{destination}/estimate")
    public String estimateTrip(@PathParam("source") String source,
                               @PathParam("destination") String destination,
                               @QueryParam("cabType") String cabType,
                               @CookieParam("platformType") String platformType){
        return "{\"source\":\""+source+"\",\"destination\":\""+destination+"\",\"cabType\":\""+cabType+"\",\"platformType\":\""+platformType+"\"}";
    }
}
