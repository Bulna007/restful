package com.wwa.api;

import com.wwa.dto.Bill;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

abstract public class AutomobileApiService {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String getBill(@QueryParam("jobCardNo") String jobCardNo){
        String response = null;
        Bill bill = new Bill
                (new SecureRandom().nextInt(), jobCardNo, "abc@api.com",
                        new SecureRandom().nextDouble(200),"9870598998");
        response = buildBillResponse(bill);
        return response;
    }

    protected abstract String buildBillResponse(Bill bill);
}
