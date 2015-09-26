package de.jochor.lib.json4j;

import de.jochor.lib.json4j.gson.JSONBindingServiceGson;

/**
 * Static service binder for the json4j adapter for GSON.
 *
 * <p>
 * <b>Started:</b> 2015-09-03
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class StaticJSONBindingBinder {

	public static JSONBindingService create() {
		JSONBindingServiceGson jsonBindingService = new JSONBindingServiceGson();
		return jsonBindingService;
	}

}
