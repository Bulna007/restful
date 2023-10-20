package com.ri.api.beanparam;

import jakarta.ws.rs.BeanParam;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("rental")
public class RentalPropertyApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{propertyType}/{city}/search")
    public String searchForRentalProperties(@BeanParam SearchCriteria searchCriteria){
        return searchCriteria.toString();
    }
}
