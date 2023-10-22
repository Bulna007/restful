package com.cch.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@XmlType(name = "EnrollmentForm")
@XmlRootElement(name = "enrollment-form")
@XmlAccessorType(XmlAccessType.FIELD)
public class EnrollmentForm {
    private String fullname;
    private String dob;
    private String gender;
    private String mobileNo;
    private String emailAddress;
    private int planNo;
    private String planName;
    private int tenure;
    private double insuredAmount;
}
