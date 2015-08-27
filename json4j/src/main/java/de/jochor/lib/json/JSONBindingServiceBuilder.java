package de.jochor.lib.json;

import de.jochor.lib.servicebuilder.ServiceBuilder;

/**
 *
 * @author Jochen Hormes
 * @start 2015-08-26
 *
 */
public class JSONBindingServiceBuilder extends ServiceBuilder {

	public static final String CLASS_NAME_PROPERTY = "jochor.json.class-name";

	private static final Class<JSONBindingService> SERVICE_TYPE = JSONBindingService.class;

	private static Class<? extends JSONBindingService> serviceClass;

	static {
		serviceClass = findImplementation(SERVICE_TYPE, CLASS_NAME_PROPERTY);
	}

	public static JSONBindingService create() {
		JSONBindingService jsonBindingService = create(serviceClass);
		return jsonBindingService;
	}

}
