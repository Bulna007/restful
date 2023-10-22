package com.cch.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@XmlType(name = "Policy")
@XmlRootElement(name = "policy")
@XmlAccessorType(XmlAccessType.FIELD)
public class Policy {
    private int policyNo;
    private String policyHolderName;
    private String planName;
    private String issuedDate;
    private String effectiveDate;
    private String maturityDate;
    private double premiumAmount;
    private int tenure;
    private double insuredAmount;
    private String status;

}
