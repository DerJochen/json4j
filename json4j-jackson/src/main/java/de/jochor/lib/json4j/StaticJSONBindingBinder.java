package de.jochor.lib.json4j;

import de.jochor.lib.json4j.jackson.JSONBindingServiceJackson;

/**
 * Static service binder for the json4j adapter for Jackson.
 *
 * <p>
 * <b>Started:</b> 2015-09-03
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class StaticJSONBindingBinder {

	private StaticJSONBindingBinder() {
		// Intended blank
	}

	/**
	 * Factory method to produce a new instance of a {@link JSONBindingServiceJackson}.
	 *
	 * @return Service instance
	 */
	public static JSONBindingService create() {
		JSONBindingServiceJackson jsonBindingService = new JSONBindingServiceJackson();
		return jsonBindingService;
	}

	/**
	 * Returns the full qualified name of the service class this binder creates.
	 *
	 * @return Name of the service
	 */
	public static String getImplName() {
		return JSONBindingServiceJackson.class.getName();
	}

}
