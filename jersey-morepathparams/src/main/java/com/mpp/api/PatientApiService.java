package com.mpp.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;
import java.time.LocalTime;

@Path("/patient/{patientNo}")
public class PatientApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/details")
    public String getPatient(@PathParam("patientNo") String patientNo){
        return "{'PatientNo':'"+patientNo+"','PatientName':'Paul'}";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/appointment")
    public String getAppointment(@PathParam("patientNo") String patientNo){
        return "{'PatientNo':'"+patientNo+"','AppointmentDate':'"+ LocalDate.now().plusDays(1) +"'}";
    }

}
