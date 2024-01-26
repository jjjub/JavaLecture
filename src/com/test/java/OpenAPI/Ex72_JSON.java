package com.test.java.OpenAPI;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Ex72_JSON {

	public static void main(String[] args) {
		
		/*
		 {
		 	"name": "홍길동",
		 	"age": 20,
		 	"nick": ["강아지", "멍멍이", "고양이"]
		 }
		 
		 
		 */
		
		String json ="""
			{
				 	"name": "홍길동",
				 	"age": 20,
				 	"nick": ["강아지", "멍멍이", "고양이"]
			}	
		""";
		
		try {
			JSONParser parser = new JSONParser();
			
			JSONObject obj = (JSONObject)parser.parse(json);
			
			String name = (String) obj.get("name");
			System.out.println(name);
			
			long age = (Long)obj.get("age");
			System.out.println(age);
			
			obj.get("nick");
			JSONArray nick = (JSONArray)obj.get("nick");
			
			for(Object n : nick) {
				System.out.println(n);
			}
			
		} catch (Exception e) {
			System.out.println("Ex72_JSON.main");
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
