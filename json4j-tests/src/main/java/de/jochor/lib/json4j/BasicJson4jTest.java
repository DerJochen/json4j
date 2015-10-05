package de.jochor.lib.json4j;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import de.jochor.lib.json4j.testmodel.EmptyEntity;
import de.jochor.lib.json4j.testmodel.SimpleEntity;

/**
 * Test for JSON Binding Service adapter implementations.
 *
 * <p>
 * <b>Started:</b> 2015-09-26
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class BasicJson4jTest {

	private JSONBindingService jsonBindingService;

	@BeforeClass
	public static void setUpBeforeClass() {
		// Switch off outputs from the service factory
		System.setProperty("jochor.servicefactory.silence", "true");
	}

	@Before
	public void setUp() throws Exception {
		jsonBindingService = JSONBindingServiceFactory.create();
	}

	@Test
	public void testInstantiation() {
		Assert.assertNotNull(jsonBindingService);
	}

	@Test
	public void testEmptyEntity() {
		Object entity = new EmptyEntity();
		String json = jsonBindingService.toJSON(entity);
		Assert.assertEquals("{}", json);

		EmptyEntity entity2 = jsonBindingService.toEntity(json, EmptyEntity.class);
		Assert.assertNotNull(entity2);
		// No fields to check
	}

	@Test
	public void testEmptyEntityArray() {
		EmptyEntity[] entityArray = new EmptyEntity[3];
		entityArray[0] = new EmptyEntity();
		entityArray[2] = new EmptyEntity();
		String json = jsonBindingService.toJSON(entityArray);
		Assert.assertEquals("[{},null,{}]", json);

		EmptyEntity[] entityArray2 = jsonBindingService.toEntity(json, EmptyEntity[].class);
		Assert.assertNotNull(entityArray2);
		Assert.assertEquals(entityArray.length, entityArray2.length);
		Assert.assertNotNull(entityArray2[0]);
		Assert.assertNull(entityArray2[1]);
		Assert.assertNotNull(entityArray2[2]);
	}

	@Test
	public void testSimpleEntity() {
		ArrayList<String> expectedParts = new ArrayList<>();
		SimpleEntity entity = createSimpleEntity(12, 12345678900L, "Simple test entity", -27, expectedParts);

		String json = jsonBindingService.toJSON(entity);
		checkJSON(json, expectedParts);

		SimpleEntity entity2 = jsonBindingService.toEntity(json, SimpleEntity.class);
		assertEquals(entity, entity2);
	}

	@Test
	public void testSimpleEntityArray() {
		ArrayList<String> expectedParts = new ArrayList<>();
		SimpleEntity[] entityArray = new SimpleEntity[3];
		entityArray[0] = createSimpleEntity(12, 12345678900L, "Simple test entity", -1, expectedParts);
		entityArray[2] = createSimpleEntity(39, 12345678901L, "Simple test entity 2", -2, expectedParts);

		String json = jsonBindingService.toJSON(entityArray);
		checkJSON(json, expectedParts);

		SimpleEntity[] entityArray2 = jsonBindingService.toEntity(json, SimpleEntity[].class);
		Assert.assertNotNull(entityArray2);
		Assert.assertEquals(entityArray.length, entityArray2.length);
		assertEquals(entityArray[0], entityArray2[0]);
		Assert.assertNull(entityArray2[1]);
		assertEquals(entityArray[2], entityArray2[2]);
	}

	protected SimpleEntity createSimpleEntity(int id, long version, String name, int strangely_named, ArrayList<String> expectedParts) {
		SimpleEntity entity = new SimpleEntity();

		entity.setId(id);
		entity.setVersion(version);
		entity.setName(name);
		entity.setStrangely_named(strangely_named);

		expectedParts.addAll(Arrays.asList("\"id\":" + entity.getId(), //
				"\"version\":" + entity.getVersion(), //
				"\"name\":\"" + entity.getName() + "\"", //
				"\"strangely_named\":" + entity.getStrangely_named()) //
				);

		return entity;
	}

	protected void assertEquals(SimpleEntity expected, SimpleEntity actual) {
		Assert.assertNotNull(actual);
		Assert.assertEquals(expected.getId(), actual.getId());
		Assert.assertEquals(expected.getVersion(), actual.getVersion());
		Assert.assertEquals(expected.getName(), actual.getName());
		Assert.assertEquals(expected.getStrangely_named(), actual.getStrangely_named());
	}

	protected void checkJSON(String json, ArrayList<String> expectedParts) {
		for (String expectedPart : expectedParts) {
			Assert.assertTrue(expectedPart + " missing", json.contains(expectedPart));
		}
	}

}
