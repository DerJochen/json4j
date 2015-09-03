package de.jochor.lib.json4j;

import de.jochor.lib.servicebuilder.ServiceFactory;

/**
 *
 * @author Jochen Hormes
 * @start 2015-08-26
 *
 */
public class JSONBindingServiceFactory extends ServiceFactory {

	private static final String BINDER_NAME = "de/jochor/lib/json4j/StaticJSONBindingBinder.java";

	public static JSONBindingService create() {
		JSONBindingService httpClient = create(BINDER_NAME);
		return httpClient;
	}

}
