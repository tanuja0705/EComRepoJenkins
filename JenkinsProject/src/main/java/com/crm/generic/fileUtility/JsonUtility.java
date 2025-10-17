package com.crm.generic.fileUtility;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonUtility {
	
	public String getDataFromJsonFile(String key) throws Throwable, ParseException {
		
		FileReader fis= new FileReader("./ConfigData/jsondata.json");
		JSONParser parser = new JSONParser();
				
		Object obj = parser.parse(fis);
		JSONObject jobj = (JSONObject) obj;
		String value = (String) jobj.get(key);
		return value;
	}

}
