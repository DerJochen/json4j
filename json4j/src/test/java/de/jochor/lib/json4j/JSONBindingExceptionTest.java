package de.jochor.lib.json4j;

import org.junit.Assert;
import org.junit.Test;

/**
 * Ttest for the {@link JSONBindingException}..
 *
 * <p>
 * <b>Started:</b> 2015-08-24
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class JSONBindingExceptionTest {

	@Test
	public void testJSONBindingException() {
		Exception parent = new Exception("Test");
		JSONBindingException e = new JSONBindingException(parent);
		Assert.assertEquals(Exception.class.getName() + ": Test", e.getMessage());
		Assert.assertEquals(parent, e.getCause());
	}

}
