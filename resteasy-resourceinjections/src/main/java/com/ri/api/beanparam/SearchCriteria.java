package com.ri.api.beanparam;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.MatrixParam;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.QueryParam;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class SearchCriteria {
    @PathParam("propertyType")
    private String propertyType;
    @PathParam("city")
    private String city;
    @MatrixParam("area")
    private String area;
    @QueryParam("floor")
    private int floor;
    @QueryParam("facing")
    private String facing;
    @QueryParam("sqft")
    private int sqft;
    @CookieParam("activeSession")
    private String activeSession;

}
