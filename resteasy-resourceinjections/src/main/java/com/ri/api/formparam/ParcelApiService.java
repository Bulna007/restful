package com.ri.api.formparam;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/parcel")
public class ParcelApiService {
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/newConsignment")
    public String newConsignment(@FormParam("source") String source,
                                 @FormParam("destination") String destination,
                                 @FormParam("description") String description,
                                 @FormParam("weight") String weight){
        return "{\"source\":\""+source+"\",\"destination\":\""+destination+"\",\"description\":\""+description+"\",\"weight\":\""+weight+"\"}";
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Path("/newConsignment1")
    public String newConsignment1(@BeanParam Parcel parcel){
        return "{\"source\":\""+parcel.getSource()+"\",\"destination\":\""+parcel.getDestination()+"\",\"description\":\""+parcel.getDescription()+"\",\"weight\":\""+parcel.getWeight()+"\"}";
    }
}