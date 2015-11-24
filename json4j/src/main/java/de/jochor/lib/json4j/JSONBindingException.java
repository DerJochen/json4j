package de.jochor.lib.json4j;

/**
 * Exception thrown on problems during de/serialization.
 *
 * <p>
 * <b>Started:</b> 2015-11-22
 * </p>
 *
 * @author Jochen Hormes
 *
 */
public class JSONBindingException extends RuntimeException {

	private static final long serialVersionUID = 5956642129984074560L;

	/**
	 * Create a new {@link JSONBindingException} for a parent exception.
	 *
	 * @param e
	 *            Parent exception
	 */
	public JSONBindingException(Exception e) {
		super(e);
	}

}
