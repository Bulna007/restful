package com.sr.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class Appointment {
    private int appointmentNo;
    private String patientName;
    private LocalDate appointmentDate;
}
