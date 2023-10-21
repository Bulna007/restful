package com.jsonbinding.bind;

import com.jsonbinding.bean.Plan;
import jakarta.json.Json;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;

public class PlanBind {
    public static void main(String[] args) {
        Jsonb jsonb = JsonbBuilder.create();
        //Plan plan = jsonb.fromJson(PlanBind.class.getClassLoader().getResourceAsStream("plan.json"), Plan.class);
        //System.out.println(plan);

        Plan plan = new Plan();
        plan.setPlanNo(83794);
        plan.setPlanName("jeevan bheema");
        plan.setTenure(24);
        plan.setPremiumAmount(7438);
        plan.setInsuredAmount(800000);
        plan.setRiskCoverage(true);
        jsonb.toJson(plan,System.out);
    }
}
