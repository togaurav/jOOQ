/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.procedures;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class PUnused extends org.jooq.impl.StoredProcedureImpl {

	private static final long serialVersionUID = 2080633776;


	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.String> IN1 = new org.jooq.impl.ParameterImpl<java.lang.String>("in1", org.jooq.impl.SQLDataType.VARCHAR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT1 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("out1", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.Parameter<java.lang.Integer> OUT2 = new org.jooq.impl.ParameterImpl<java.lang.Integer>("out2", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new procedure call instance
	 */
	public PUnused() {
		super(org.jooq.SQLDialect.POSTGRES, "p_unused", org.jooq.test.postgres.generatedclasses.Public.PUBLIC);

		addInParameter(IN1);
		addOutParameter(OUT1);
		addInOutParameter(OUT2);
	}

	public void setIn1(java.lang.String value) {
		setValue(IN1, value);
	}

	public void setOut2(java.lang.Integer value) {
		setValue(OUT2, value);
	}

	public java.lang.Integer getOut1() {
		return getValue(OUT1);
	}

	public java.lang.Integer getOut2() {
		return getValue(OUT2);
	}
}
