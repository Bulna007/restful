package com.jsonparsing.reader;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class PersonReader {
    public static void main(String[] args) {
        JsonReader jsonReader = Json.createReader(PersonReader.class.getClassLoader().getResourceAsStream("person.json"));
        JsonObject personObject = jsonReader.readObject();

        System.out.println(personObject.getString("firstName"));
        System.out.println(personObject.getInt("age"));

        JsonObject addressObject = personObject.getJsonObject("address");
        System.out.println(addressObject.getString("city")+"-"+addressObject.getInt("pin code"));
    }
}
