package com.jsonparsing.writer;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

import java.io.FileWriter;

public class ProductWriter {
    public static void main(String[] args) {
        JsonWriter jsonWriter = Json.createWriter(System.out);
        JsonObjectBuilder productJsonObjectBuilder = Json.createObjectBuilder();
        productJsonObjectBuilder.add("productCode",123);
        productJsonObjectBuilder.add("productName","parle");
        productJsonObjectBuilder.add("quantity",23);
        productJsonObjectBuilder.add("price",98.90);
        JsonObject productObject = productJsonObjectBuilder.build();

        jsonWriter.writeObject(productObject);
        jsonWriter.close();
    }
}
