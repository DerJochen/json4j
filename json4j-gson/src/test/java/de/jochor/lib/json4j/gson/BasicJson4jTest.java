package de.jochor.lib.json4j.gson;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Test for JSON Binding Service adapter implementation for GSON.<br>
 * All tests are inherited from the general json4j test class.
 *
 * <p>
 * <b>Started:</b> 2015-09-26
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class BasicJson4jTest extends de.jochor.lib.json4j.BasicJson4jTest {

	@Ignore
	@Override
	@Test
	public void testRecursiveEntity() {
		// GSON just ignores recursive attributes
	}

	@Ignore
	@Override
	@Test
	public void testEmptyEntity_unknownAttribute() {
		// GSON just ignores unknown attributes
	}

}
