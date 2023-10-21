package com.jsonstreaming.generator;

import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;

public class ProductGenerator {
    public static void main(String[] args) {
        JsonGenerator jsonGenerator = Json.createGenerator(System.out);
        jsonGenerator.writeStartObject();

        jsonGenerator.write("productNo",896);
        jsonGenerator.write("productName","tv");
        jsonGenerator.write("manufacturer","lg");
        jsonGenerator.write("price",789234.90);

        jsonGenerator.writeEnd();
        jsonGenerator.close();
    }
}
