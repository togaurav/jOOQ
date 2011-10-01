/**
 * This class is generated by jOOQ
 */
package org.jooq.test.sqlserver.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://www.jooq.org",
                            comments = "This class is generated by jOOQ")
public class TAuthor extends org.jooq.impl.UpdatableTableImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> {

	private static final long serialVersionUID = -1991655806;

	/**
	 * The singleton instance of t_author
	 */
	public static final org.jooq.test.sqlserver.generatedclasses.tables.TAuthor T_AUTHOR = new org.jooq.test.sqlserver.generatedclasses.tables.TAuthor();

	/**
	 * The class holding records for this type
	 */
	private static final java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> __RECORD_TYPE = org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord.class;

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> getRecordType() {
		return __RECORD_TYPE;
	}

	/**
	 * An uncommented item
	 * 
	 * PRIMARY KEY
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> ID = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer>("ID", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String> FIRST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String>("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String> LAST_NAME = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String>("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.sql.Date> DATE_OF_BIRTH = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.sql.Date>("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer> YEAR_OF_BIRTH = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.Integer>("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, T_AUTHOR);

	/**
	 * An uncommented item
	 */
	public static final org.jooq.TableField<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String> ADDRESS = new org.jooq.impl.TableFieldImpl<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord, java.lang.String>("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR, T_AUTHOR);

	/**
	 * No further instances allowed
	 */
	private TAuthor() {
		super("t_author", org.jooq.test.sqlserver.generatedclasses.Dbo.DBO);
	}

	@Override
	public org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord> getMainKey() {
		return org.jooq.test.sqlserver.generatedclasses.Keys.pk_t_author;
	}

	@Override
	@SuppressWarnings("unchecked")
	public java.util.List<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.jooq.test.sqlserver.generatedclasses.tables.records.TAuthorRecord>>asList(org.jooq.test.sqlserver.generatedclasses.Keys.pk_t_author);
	}
}
