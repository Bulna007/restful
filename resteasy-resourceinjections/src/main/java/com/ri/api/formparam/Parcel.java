package com.ri.api.formparam;

import jakarta.ws.rs.FormParam;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Parcel {
    @FormParam("source")
    private String source;
    @FormParam("destination")
    private String destination;
    @FormParam("weight")
    private String weight;
    @FormParam("description")
    private String description;
}
