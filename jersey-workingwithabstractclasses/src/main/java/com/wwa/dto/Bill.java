package com.wwa.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class Bill {
    private int billNo;
    private String jobCardNo;
    private String email;
    private double amount;
    private String mobileNo;
}
