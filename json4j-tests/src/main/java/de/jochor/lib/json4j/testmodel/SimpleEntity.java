package de.jochor.lib.json4j.testmodel;

import lombok.Getter;
import lombok.Setter;

/**
 * Simple entity with some basic fields for the tests for JSON Binding Service adapter implementations.
 *
 * <p>
 * <b>Started:</b> 2015-09-26
 * </p>
 *
 * @author Jochen Hormes
 *
 */
@Getter
@Setter
public class SimpleEntity {

	private int id;

	private long version;

	private String name;

	private int strangely_named;

}
