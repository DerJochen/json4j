package de.jochor.lib.json4j;

import de.jochor.lib.json4j.jackson.JSONBindingServiceJackson;

/**
*
* @author Jochen Hormes
* @start 2015-09-03
*
*/
public class StaticJSONBindingBinder {

	public static JSONBindingService create(){
		JSONBindingServiceJackson jsonBindingService = new JSONBindingServiceJackson();
		return jsonBindingService;
	}
	
}
