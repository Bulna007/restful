package com.sr.api;

import com.sr.nr.PhilipsHomeApplianceApiService;
import com.sr.nr.PhilipsStereoCustomerCareApiService;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/customerCare")
public class PhilipsCustomerCareApiService {

    /*@Path("/homeAppliance")
    public PhilipsHomeApplianceApiService homeApplianceApiService(){
        return new PhilipsHomeApplianceApiService();
    }

    @Path("/stereo")
    public PhilipsStereoCustomerCareApiService stereoCustomerCareApiService(){
        return new PhilipsStereoCustomerCareApiService();
    }*/

    //Dynamic Dispatching
    @Path("/{division}")
    public Object locateCustomerCare(@PathParam("division") String division){
        if(division.equals("stereo")){
            return new PhilipsStereoCustomerCareApiService();
        }else if(division.equals("homeAppliance")){
            return new PhilipsHomeApplianceApiService();
        }else{
            return null;
        }
    }

}
