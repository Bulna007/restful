package com.eh.api;

import com.eh.dto.Error;
import com.eh.dto.Receipt;
import com.eh.dto.RechargeInfo;
import com.eh.exception.SubscriptionNotActiveException;
import com.eh.service.RechargeService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.UUID;

@Path("/recharge")
public class MobileRechargeApiService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/noexcepmgmt")
    public Receipt rechargeWithNoExceptionManagement(RechargeInfo info){
        RechargeService rechargeService = null;
        String receiptNo = null;
        Receipt receipt = null;

        rechargeService = new RechargeService();
        receiptNo = rechargeService.recharge(info.getMobileNo(),info.getPlan(),info.getAmount());

        receipt = Receipt.of()
                .mobileNo(info.getMobileNo())
                .amount(info.getAmount())
                .receiptNo(receiptNo)
                .status("Success")
                .build();
        return receipt;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/excepResponse")
    public Response rechargeWithExceptionResponse(RechargeInfo info){
        RechargeService rechargeService = null;
        String receiptNo = null;
        Receipt receipt = null;

        rechargeService = new RechargeService();
        try{
            receiptNo = rechargeService.recharge(info.getMobileNo(),info.getPlan(),info.getAmount());
            receipt = Receipt.of()
                    .mobileNo(info.getMobileNo())
                    .amount(info.getAmount())
                    .receiptNo(receiptNo)
                    .status("Success")
                    .build();
        }catch (SubscriptionNotActiveException ex){
            Response response = Response.status(Response.Status.BAD_REQUEST)
                    .entity(Entity.json(Error.of()
                            .errorCode(UUID.randomUUID().toString())
                            .errorMessage("Subscription Not Active")
                            .build())).build();
            return response;
        }
        return Response.ok(Entity.json(receipt)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/excep")
    public Response rechargeWithException(RechargeInfo info){
        RechargeService rechargeService = null;
        String receiptNo = null;
        Receipt receipt = null;

        rechargeService = new RechargeService();
        try{
            receiptNo = rechargeService.recharge(info.getMobileNo(), info.getPlan(), info.getAmount());
            receipt = Receipt.of().receiptNo(receiptNo).mobileNo(info.getMobileNo()).amount(info.getAmount()).status("Success").build();
        }catch (SubscriptionNotActiveException ex){
            Response response = Response.status(Response.Status.BAD_REQUEST)
                    .entity(Entity.json(Error.of().errorCode(UUID.randomUUID().toString())
                            .errorMessage("Subscription not Active").build())).build();
            throw new WebApplicationException(response);
        }
        return  Response.ok(Entity.json(receipt)).build();
    }

}
