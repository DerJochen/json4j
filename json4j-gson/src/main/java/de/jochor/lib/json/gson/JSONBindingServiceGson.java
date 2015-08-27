package de.jochor.lib.json.gson;

import com.google.gson.Gson;

import de.jochor.lib.json.JSONBindingService;

/**
 *
 * @author Jochen Hormes
 * @start 2015-08-24
 *
 */
public class JSONBindingServiceGson implements JSONBindingService {

	private Gson gson = new Gson();

	/**
	 * {@inheritDoc}
	 */
	@Override
	public <T> T toEntity(String json, Class<T> entityType) {
		T entity = gson.fromJson(json, entityType);
		return entity;
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
