package com.wwa.api;

import com.wwa.dto.Bill;
import jakarta.ws.rs.Path;

@Path("/json/automobile")
public class JSONAutomobileApiService extends AutomobileApiService{
    public String buildBillResponse(Bill bill){
        StringBuilder builder = new StringBuilder();
        builder.append("{'billNo': "+bill.getBillNo()+"," +
                "'jobCardNo':'"+bill.getJobCardNo()+"','email':'"+bill.getEmail()+
                "','amount':"+bill.getAmount()+",'mobileNo':'"+bill.getMobileNo()+"'}");
        return builder.toString();
    }
}
