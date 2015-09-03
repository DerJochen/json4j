package de.jochor.lib.json4j;

/**
 *
 * @author Jochen Hormes
 * @start 2015-08-24
 *
 */
public interface JSONBindingService {

	<T>T toEntity(String json, Class<T> entityType);

	String toJSON(Object entity);

}
