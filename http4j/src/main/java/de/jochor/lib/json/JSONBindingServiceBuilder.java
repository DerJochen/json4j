package de.jochor.lib.json;

/**
 *
 * @author Jochen Hormes
 * @start 2015-08-26
 *
 */
public class JSONBindingServiceBuilder {

	// TODO find with classpath scanner
	private static final String BINDING_SERVICE_CLASS_NAME = "de.jochor.lib.json.gson.JSONBindingServiceGson";

	private static Class<? extends JSONBindingService> bindingServiceClass;

	static {
		try {
			ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
			bindingServiceClass = classLoader.loadClass(BINDING_SERVICE_CLASS_NAME).asSubclass(JSONBindingService.class);
		} catch (ClassNotFoundException e) {
			System.out.println("Unable to find " + JSONBindingService.class.getSimpleName() + " implementation");
			// TODO throw new RuntimeException(e);
		}
	}

	public static JSONBindingService create() {
		if (bindingServiceClass == null) {
			throw new IllegalStateException("No service class set");
		}
		try {
			JSONBindingService jsonBindingService = bindingServiceClass.newInstance();
			return jsonBindingService;
		} catch (InstantiationException | IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}

}
