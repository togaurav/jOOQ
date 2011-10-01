/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.functions;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class FGetOneCursor extends org.jooq.impl.StoredFunctionImpl<org.jooq.Result<org.jooq.Record>> {

	private static final long serialVersionUID = 1643471225;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer[]> BOOK_IDS = new org.jooq.impl.ParameterImpl<java.lang.Integer[]>("book_ids", org.jooq.impl.SQLDataType.INTEGER.getArrayDataType());

	/**
	 * Create a new function call instance
	 */
	public FGetOneCursor() {
		super(org.jooq.SQLDialect.POSTGRES, "f_get_one_cursor", org.jooq.test.postgres.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.RESULT);

		addInParameter(BOOK_IDS);
	}

	/**
	 * Set the <code>book_ids</code> parameter to the function
	 */
	public void setBookIds(java.lang.Integer[] value) {
		setValue(BOOK_IDS, value);
	}

	/**
	 * Set the <code>book_ids</code> parameter to the function
	 * <p>
	 * Use this method only, if the function is called as a {@link org.jooq.Field} in a {@link org.jooq.Select} statement!
	 */
	public void setBookIds(org.jooq.Field<java.lang.Integer[]> field) {
		setField(BOOK_IDS, field);
	}
}
