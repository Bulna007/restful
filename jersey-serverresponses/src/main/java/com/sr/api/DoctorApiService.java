package com.sr.api;

import com.sr.dto.Appointment;
import com.sr.dto.DoctorDto;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;

import java.security.SecureRandom;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Path("/doctor")
public class DoctorApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{doctorNo}/info")
    public DoctorDto getDoctor(@PathParam("doctorNo") int doctorNo) throws InterruptedException {
        DoctorDto dto = null;

        dto = DoctorDto.of().doctorNo(new SecureRandom().nextInt())
                .fullname("Paul")
                .age(22)
                .gender("male")
                .emailAddress("paul.sr@mail.com")
                .mobileNo("873593502")
                .experience(2.5)
                .qualification("mbbs")
                .specialization("child specialist")
                .build();
        Thread.sleep(100l);
        System.out.println("returning doctor details");
        return dto;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{doctorNo}/appointments")
    public Response getAppointmentsForDoctor(@PathParam("doctorNo") int doctorNo){
        List<Appointment> appointments = null;
        Response.ResponseBuilder builder = null;
        Response response = null;

        appointments = new ArrayList<>();
        appointments.add(Appointment.of().appointmentNo(new SecureRandom().nextInt(100))
                .patientName("jack")
                .appointmentDate(LocalDate.now().plusDays(3)).build());
        appointments.add(Appointment.of().appointmentNo(new SecureRandom().nextInt(100))
                .patientName("paul")
                .appointmentDate(LocalDate.now()).build());

        builder = Response.status(Response.Status.ACCEPTED);
        builder.entity(Entity.json(appointments));
        response = builder.build();
        System.out.println("returning appointments for doctor");
        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{appointmentNo}/appointment")
    public Response getAppointment(@PathParam("appointmentNo") int appointmentNo){
        Appointment appointment = null;
        Response.ResponseBuilder builder = null;
        Response response = null;

        appointment = Appointment.of().appointmentNo(new SecureRandom().nextInt(1))
                .patientName("max").appointmentDate(LocalDate.now()).build();

        builder = Response.accepted();
        builder = builder.header("clerk-no","c123");
        builder = builder.cookie(new NewCookie("promotion-code","p2738d"));
        builder = builder.entity(Entity.json(appointment));
        response = builder.build();
        return response;
    }

}
