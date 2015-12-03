package de.jochor.lib.json4j.gson;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import de.jochor.lib.json4j.JSONBindingException;
import de.jochor.lib.json4j.JSONBindingService;

/**
 * json4j adapter implementation for GSON.
 *
 * <p>
 * <b>Started:</b> 2015-08-24
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class JSONBindingServiceGson implements JSONBindingService {

	private Gson gson = new Gson();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T toEntity(String json, Class<T> entityType) {
		try {
			T entity = gson.fromJson(json, entityType);
			return entity;
		} catch (JsonSyntaxException e) {
			throw new JSONBindingException(e);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toJSON(Object entity) {
		String json = gson.toJson(entity);
		return json;
	}

}
