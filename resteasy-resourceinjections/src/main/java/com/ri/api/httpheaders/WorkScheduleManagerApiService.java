package com.ri.api.httpheaders;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;

@Path("/workschedule")
public class WorkScheduleManagerApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{week}")
    public String getWorkSchedule(@Context HttpHeaders httpHeaders, @PathParam("week") int week){
        StringBuilder builder = new StringBuilder();

        builder.append("httpheader : ").append(extractMultiValuedMap(httpHeaders.getRequestHeaders()))
                .append(",").append("week : ").append(week);

        return builder.toString();
    }

    public String extractMultiValuedMap(MultivaluedMap<String, String> map){
        StringBuilder builder = new StringBuilder();
        map.forEach((key, list) ->{
            builder.append(key).append(":");
            for(String val : list){
                builder.append(val).append(",");
            }
        });
        return builder.toString();
    }
}
