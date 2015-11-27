package de.jochor.lib.json4j.testmodel;

import lombok.Getter;

/**
 * Recursive entity for the tests for JSON Binding Service adapter implementations.
 *
 * <p>
 * <b>Started:</b> 2015-11-27
 * </p>
 *
 * @author Jochen Hormes
 *
 */
@Getter
public class RecursiveEntity {

	private RecursiveEntity self;

	public RecursiveEntity() {
		self = this;
	}

}
