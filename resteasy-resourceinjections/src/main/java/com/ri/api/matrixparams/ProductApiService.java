package com.ri.api.matrixparams;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/product")
public class ProductApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{category}/{productName}")
    public String searchProducts(@PathParam("category") String category,
                                 @PathParam("productName") String productName,
                                 @MatrixParam("connectorType") String connectorType,
                                 @MatrixParam("voltage") String voltage,
                                 @MatrixParam("type") String type,
                                 @MatrixParam("lens") String lens){
        return "{'category':'"+category+"','connectorType':'"+connectorType+"','voltage':'"
                +voltage+"','productName':'"+productName+"','type':'"+type+"','lens':'"+lens+"'}";
    }
}
