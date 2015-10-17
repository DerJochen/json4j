package de.jochor.lib.json4j;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import de.jochor.lib.servicefactory.ServiceFactory;

/**
 * <p>
 * <b>Started:</b> 2015-10-02
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class JSONBindingServiceFactoryTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		// Switch off outputs from the service factory
		System.setProperty(ServiceFactory.SILENT_MODE, "true");
	}

	@Test
	public void testCreate() {
		JSONBindingService jsonBindingService = JSONBindingServiceFactory.create();
		Assert.assertNotNull(jsonBindingService);
	}

}
