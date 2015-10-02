package de.jochor.lib.json4j;

import org.junit.Assert;
import org.junit.Test;

/**
 * <p>
 * <b>Started:</b> 2015-10-02
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class JSONBindingServiceFactoryTest {

	@Test
	public void testCreate() {
		JSONBindingService jsonBindingService = JSONBindingServiceFactory.create();
		Assert.assertNotNull(jsonBindingService);
	}

}
