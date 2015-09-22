package de.jochor.lib.json4j;

/**
 * Interface for JSON Binding Service adapter implementations.
 *
 * <p>
 * <b>Started:</b> 2015-08-24
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public interface JSONBindingService {

	/**
	 * Converts a JSON String to an entity of the given type.
	 *
	 * @param <T>
	 *            Entity type
	 * @param json
	 *            String representation
	 * @param entityType
	 *            Type to convert to
	 * @return Entity instance
	 */
	<T> T toEntity(String json, Class<T> entityType);

	/**
	 * Serializes the given entity to JSON.
	 *
	 * @param entity
	 *            Source entity
	 * @return JSON representation
	 */
	String toJSON(Object entity);

}
