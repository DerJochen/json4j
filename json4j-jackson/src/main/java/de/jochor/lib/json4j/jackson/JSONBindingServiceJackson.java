package de.jochor.lib.json4j.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import de.jochor.lib.json4j.JSONBindingService;

/**
 * json4j adapter implementation for Jackson.
 *
 * <p>
 * <b>Started:</b> 2015-08-24
 * </p>
 * 
 * @author Jochen Hormes
 *
 */
public class JSONBindingServiceJackson implements JSONBindingService {

	private final ObjectMapper mapper = new ObjectMapper();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T toEntity(String json, Class<T> entityType) {
		T entity = mapper.convertValue(json, entityType);
		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toJSON(Object entity) {
		try {
			String json = mapper.writeValueAsString(entity);
			return json;
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

}
