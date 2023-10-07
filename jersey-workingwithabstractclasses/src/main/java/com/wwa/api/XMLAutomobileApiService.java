package com.wwa.api;

import com.wwa.dto.Bill;
import jakarta.ws.rs.Path;

@Path("/xml/automobile")
public class XMLAutomobileApiService extends AutomobileApiService{

    public String buildBillResponse(Bill bill){
        StringBuilder builder = new StringBuilder();
        builder.append("<bill><billNo>"+bill.getBillNo()+"</billNo><jobCardNo>"
                +bill.getJobCardNo()+"</jobCardNo><amount>"
                +bill.getAmount()+"</amount><email>"
                +bill.getEmail()+"</email><amount>"
                +bill.getAmount()+"</amount><mobileNo>"
                +bill.getMobileNo()+"</mobileNo>"
                +"</bill>");
        return builder.toString();
    }
}
