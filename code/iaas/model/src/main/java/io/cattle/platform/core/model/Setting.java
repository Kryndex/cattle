/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "setting", schema = "cattle")
public interface Setting extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.setting.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.setting.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.setting.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.setting.name</code>.
	 */
	@javax.persistence.Column(name = "name", nullable = false, length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.setting.value</code>.
	 */
	public void setValue(java.lang.String value);

	/**
	 * Getter for <code>cattle.setting.value</code>.
	 */
	@javax.persistence.Column(name = "value", nullable = false, length = 16777215)
	public java.lang.String getValue();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Setting
	 */
	public void from(io.cattle.platform.core.model.Setting from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Setting
	 */
	public <E extends io.cattle.platform.core.model.Setting> E into(E into);
}
