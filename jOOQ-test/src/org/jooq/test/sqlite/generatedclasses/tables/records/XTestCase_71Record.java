/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlite.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class XTestCase_71Record extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.sqlite.generatedclasses.tables.records.XTestCase_71Record> {

	private static final long serialVersionUID = 2008548439;

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.ID, value);
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setTestCase_64_69Id(java.lang.Short value) {
		setValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Short getTestCase_64_69Id() {
		return getValue(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.TEST_CASE_64_69_ID);
	}

	/**
	 * Create a detached XTestCase_71Record
	 */
	public XTestCase_71Record() {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71);
	}

	/**
	 * Create an attached XTestCase_71Record
	 * @deprecated - 1.6.4 [#363, #789] - use the other constructor instead for unattached
	 * records, or {@link org.jooq.impl.Factory#newRecord(org.jooq.Table)} for attached ones
	 */
	@Deprecated
	public XTestCase_71Record(org.jooq.Configuration configuration) {
		super(org.jooq.test.sqlite.generatedclasses.tables.XTestCase_71.X_TEST_CASE_71, configuration);
	}
}
