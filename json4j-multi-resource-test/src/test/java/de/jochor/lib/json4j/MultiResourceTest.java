package de.jochor.lib.json4j;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.jochor.lib.json4j.gson.JSONBindingServiceGson;
import de.jochor.lib.json4j.jackson.JSONBindingServiceJackson;
import de.jochor.lib.servicefactory.ServiceFactory;

/**
 * Test for the behavior of the {@link ServiceFactory} when finding the same static binder in multiple sources.
 *
 * <p>
 * <b>Started:</b> 2015-11-15
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class MultiResourceTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		// Switch off outputs from the service factory
		System.setProperty(ServiceFactory.SILENT_MODE, "true");
	}

	@Test
	public void testCreate_default() throws Throwable {
		Object service = JSONBindingServiceFactory.create();
		Assert.assertNotNull(service);
		Assert.assertTrue(service instanceof JSONBindingServiceGson || service instanceof JSONBindingServiceJackson);
	}

	@Test
	public void testCreate_Gson() throws Throwable {
		System.setProperty(ServiceFactory.PROPERTIES_BASE + StaticJSONBindingBinder.class.getName(), JSONBindingServiceGson.class.getName());

		Object service = JSONBindingServiceFactory.create();
		Assert.assertNotNull(service);
		Assert.assertTrue(service instanceof JSONBindingServiceGson);
	}

	@Test
	public void testCreate_Jackson() throws Throwable {
		System.setProperty(ServiceFactory.PROPERTIES_BASE + StaticJSONBindingBinder.class.getName(), JSONBindingServiceJackson.class.getName());

		Object service = JSONBindingServiceFactory.create();
		Assert.assertNotNull(service);
		Assert.assertTrue(service instanceof JSONBindingServiceJackson);
	}

}