package com.jang.array;

import java.io.IOException;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
public class ByteArrayToJsonExample {

	public static void main(String[] args) {
		
		
		
	/*	// Convert byte array to String
        String jsonString = new String(byteArray);

        // Convert String to JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Print JSON object
        System.out.println(jsonObject.toString());
        
        */
        
        
		byte[] byteArray = "{\"name\":\"John\", \"age\":30}".getBytes();

        // Create ObjectMapper instance
        ObjectMapper mapper = new ObjectMapper();

        try {
            // Convert byte array to JSON as a Map
            Map<String, Object> jsonMap = mapper.readValue(byteArray, Map.class);

            // Print JSON object
            System.out.print(jsonMap);
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
}
