package com.ri.api.queryparamwithdefaultvalue;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/plan")
public class PlanApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/details")
    public String getPlan(@QueryParam("type") @DefaultValue("all") String type){
        if(type.equals("all")){
            return "{'plan1':'Accidental Insurance','plan2':'Car Insurance'}";
        }
        return type;
    }
}
