package com.eh.service;

import com.eh.exception.SubscriptionNotActiveException;

import java.util.UUID;

public class RechargeService {
    public String recharge(String mobileNo, String plan, double amount){
        if(mobileNo.startsWith("999")){
            throw new SubscriptionNotActiveException("Subscription not Active for "+mobileNo);
        }
        return UUID.randomUUID().toString();
    }
}
