package com.ri.api.uriinfo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.*;

@Path("/tour/{location}")
public class TourApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{tourType}/{location}/search")
    public String searchTourPackages(@Context UriInfo uriInfo){
        StringBuilder builder = new StringBuilder();

        uriInfo.getPathSegments().forEach(pathSegment->{
            builder.append(pathSegment.getPath())
                    .append("matrixparams : ")
                    .append(pathSegment.getMatrixParameters())
                    .append("/");
        });
        builder.append("query param").append(uriInfo.getQueryParameters());
        return builder.toString();
    }

    public String extractMultiValuedMap(MultivaluedMap<String, String> map){
        StringBuilder builder = new StringBuilder();

        map.forEach((key, list)->{
            builder.append(key).append("=");
            for(String val : list){
                builder.append(val);
                builder.append(";");
            }
        });

        return builder.toString();
    }

}