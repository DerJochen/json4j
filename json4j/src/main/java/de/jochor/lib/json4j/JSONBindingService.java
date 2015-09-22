package de.jochor.lib.json4j;

/**
 * Interface for JSON Binding Service adapter implementations.
 * 
 * @author Jochen Hormes
 * @start 2015-08-24
 *
 */
public interface JSONBindingService {

	/**
	 * Converts a JSON String to an entity of the given type.
	 * @param json String representation
	 * @param entityType Type to convert to
	 * @return Entity instance
	 */
	<T>T toEntity(String json, Class<T> entityType);

	/**
	 * Serializes the given entity to JSON.
	 * @param entity Source entity
	 * @return JSON representation
	 */
	String toJSON(Object entity);

}
