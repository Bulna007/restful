package com.ri.api.headerparam;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/netbanking")
public class NetBankingApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{accountNo}/{amount}/withdraw")
    public String withdrawal(@PathParam("accountNo") String accountNo,
                             @PathParam("amount") double amount,
                             @HeaderParam("platformType") String platformType){
        return "{'accountNo':'"+accountNo+"','amount':"+amount+",'platformType':'"+platformType+"'}";
    }
}
