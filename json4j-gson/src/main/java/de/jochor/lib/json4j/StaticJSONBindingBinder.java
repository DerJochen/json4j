package de.jochor.lib.json4j;

import de.jochor.lib.json4j.gson.JSONBindingServiceGson;

/**
*
* @author Jochen Hormes
* @start 2015-09-03
*
*/
public class StaticJSONBindingBinder {

	public static JSONBindingService create(){
		JSONBindingServiceGson jsonBindingService = new JSONBindingServiceGson();
		return jsonBindingService;
	}
	
}
