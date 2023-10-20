package com.ri.api.pathsegment;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;

import java.util.concurrent.atomic.AtomicInteger;

@Path("/car")
public class CarApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{manufacturer}/{model}/{location}")
    public String searchUsedCars(@PathParam("manufacturer") PathSegment manufacturer,
                                 @PathParam("model") PathSegment model,
                                 @PathParam("location") PathSegment location){
        StringBuilder builder = new StringBuilder();
        builder.append("{\"manufacturer\": \"").append(manufacturer.getPath()).append("\",\"manufacturer details\":")
                .append(extractMatrixParam(manufacturer.getMatrixParameters())).append(",")
                .append("\"model\": \"").append(model.getPath()).append("\", \"model details\": ")
                .append(extractMatrixParam(model.getMatrixParameters())).append(",")
                .append("\"location\" :\"").append(location.getPath()).append("\", \"location details\":")
                .append(extractMatrixParam(location.getMatrixParameters()))
                .append("}");
        return builder.toString();

    }
    public String extractMatrixParam(MultivaluedMap<String, String> map){
        StringBuilder builder = new StringBuilder();
        if(map.size() != 0){
            builder.append("{");
        }
        AtomicInteger count = new AtomicInteger();
        map.forEach((key,list)->{
            builder.append("\"").append(key).append("\":");
            for(String val : list) {
                builder.append("\""+val+"\"");
                count.getAndIncrement();
            }
            if(count.get() != map.size()){
                builder.append(",");
            }
        });
        if(map.size() != 0){
            builder.append("}");
        }
        return builder.toString();
    }

}
