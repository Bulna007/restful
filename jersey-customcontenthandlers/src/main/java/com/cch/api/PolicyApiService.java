package com.cch.api;

import com.cch.dto.EnrollmentForm;
import com.cch.dto.Policy;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;
import java.util.UUID;

@Path("/policy")
public class PolicyApiService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Path("/new")
    public Policy newPolicy(EnrollmentForm form){
        Policy policy = new Policy();
        System.out.println("Received enrollment details "+form);

        policy.setPolicyNo(form.getPlanNo());
        policy.setPolicyHolderName(form.getFullname());
        policy.setTenure(form.getTenure());
        policy.setInsuredAmount(form.getInsuredAmount());
        policy.setStatus("In-Progress");
        policy.setPremiumAmount(new SecureRandom().nextDouble(99999));
        policy.setPlanName(form.getPlanName());
        return policy;
    }
}
