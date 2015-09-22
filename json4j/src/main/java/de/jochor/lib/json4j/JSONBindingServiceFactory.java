package de.jochor.lib.json4j;

import de.jochor.lib.servicefactory.ServiceFactory;

/**
 * Factory for JSON Binding Service adapters. Use the static {@link #create()} method to retrieve an instance.
 * 
 * @author Jochen Hormes
 * @start 2015-08-26
 *
 */
public class JSONBindingServiceFactory extends ServiceFactory {

	private static final String BINDER_NAME = "de/jochor/lib/json4j/StaticJSONBindingBinder.java";

	/**
	 * Factory method to produce a new instance of a JSON Binding Service adapter.
	 * 
	 * @return Service instance
	 */
	public static JSONBindingService create() {
		JSONBindingService jsonBindingService = create(BINDER_NAME);
		return jsonBindingService;
	}

}
