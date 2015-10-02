package de.jochor.lib.json4j;

/**
 * <p>
 * <b>Started:</b> 2015-10-02
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class StaticJSONBindingBinder {

	public static JSONBindingService create() {
		return new JSONBindingService() {

			@Override
			public <T> T toEntity(String json, Class<T> entityType) {
				return null;
			}

			@Override
			public String toJSON(Object entity) {
				return null;
			}

		};
	}

}
