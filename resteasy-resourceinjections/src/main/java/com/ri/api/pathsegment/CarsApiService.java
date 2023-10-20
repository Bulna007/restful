package com.ri.api.pathsegment;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;

import java.util.List;

@Path("/cars")
public class CarsApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{model}/{manufacturer}/{location}/find")
    public String searchCars(@PathParam("model") PathSegment model,
                             @PathParam("manufacturer") PathSegment manufacturer,
                             @PathParam("location") PathSegment location){
        StringBuilder builder = new StringBuilder();

        builder.append("{\"model\": \"").append(model.getPath()).append("\",")
                .append("\"model details\": ").append(extractMatrixParam(model.getMatrixParameters()))

                .append("}");

        return builder.toString();
    }

    public String extractMatrixParam(MultivaluedMap<String, String> map){
        StringBuilder builder = new StringBuilder();

        map.forEach((key, list)->{
            builder.append(key).append(":");
            for(String val : list){
                builder.append(val);
            }
            builder.append(",");
        });

        return builder.toString();
    }
}
