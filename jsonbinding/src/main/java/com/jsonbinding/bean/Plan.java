package com.jsonbinding.bean;

import jakarta.json.bind.annotation.JsonbProperty;

public class Plan {
    @JsonbProperty("plan_no")
    private int planNo;
    @JsonbProperty("plan_nm")
    private String planName;
    private int tenure;
    @JsonbProperty("premium_amount")
    private double premiumAmount;
    @JsonbProperty("insured_amount")
    private double insuredAmount;
    @JsonbProperty("risk_coverage")
    private boolean riskCoverage;

    public int getPlanNo() {
        return planNo;
    }

    public void setPlanNo(int planNo) {
        this.planNo = planNo;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public double getInsuredAmount() {
        return insuredAmount;
    }

    public void setInsuredAmount(double insuredAmount) {
        this.insuredAmount = insuredAmount;
    }

    public boolean isRiskCoverage() {
        return riskCoverage;
    }

    public void setRiskCoverage(boolean riskCoverage) {
        this.riskCoverage = riskCoverage;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "planNo=" + planNo +
                ", planName='" + planName + '\'' +
                ", tenure=" + tenure +
                ", premiumAmount=" + premiumAmount +
                ", insuredAmount=" + insuredAmount +
                ", riskCoverage=" + riskCoverage +
                '}';
    }
}
