package com.github.pnowy.nc.core;

import com.github.pnowy.nc.core.mappers.NativeObjectMapper;

import java.util.Date;

/**
 * Interface CriteriaResult.
 */
public interface CriteriaResult {

    /**
     * Next.
     *
     * @return true, if successful
     */
    boolean next();

    /**
     * Gets the string.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the string
     */
    String getString(int idx, String defaultResult);

    /**
     * Gets the string. Default value is null.
     *
     * @param idx idx
     * @return value,
     */
    String getString(int idx);

    /**
     * Gets the string.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the string
     */
    String getString(String columnName, String defaultResult);

    /**
     * Gets the string. Default value is null.
     *
     * @param columnName the column name
     * @return value,
     */
    String getString(String columnName);

    /**
     * Gets the integer.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the integer
     */
    Integer getInteger(int idx, Integer defaultResult);

    /**
     * Gets the integer. Default value is null.
     *
     * @param idx idx
     * @return integer, default is null
     */
    Integer getInteger(int idx);

    /**
     * Gets the double.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the double
     */
    Double getDouble(int idx, Double defaultResult);

    /**
     * Gets the double. Default result is null.
     *
     * @param idx idx
     * @return the double, default is null
     */
    Double getDouble(int idx);

    /**
     * Gets the double.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the double
     */
    Double getDouble(String columnName, Double defaultResult);

    /**
     * Gets the double. Default result is null.
     *
     * @param columnName the column name
     * @return the double, default result is null
     */
    Double getDouble(String columnName);

    /**
     * Gets the integer.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the integer
     */
    Integer getInteger(String columnName, Integer defaultResult);

    /**
     * Gets the integer. Default value is null.
     *
     * @param columnName the column name
     * @return the integer, default value is null
     */
    Integer getInteger(String columnName);

    /**
     * Gets the long.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the long
     */
    Long getLong(int idx, Long defaultResult);

    /**
     * Gets the long, default result is null.
     *
     * @param idx idx
     * @return the long, default result is null
     */
    Long getLong(int idx);

    /**
     * Gets the long.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the long
     */
    Long getLong(String columnName, Long defaultResult);

    /**
     * Gets the long, default value is null.
     *
     * @param columnName the column name
     * @return the long, default value is null
     */
    Long getLong(String columnName);

    /**
     * Gets the short.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the short
     */
    Short getShort(int idx, Short defaultResult);

    /**
     * Gets the short, default result is null.
     *
     * @param idx idx
     * @return the short, default result is null
     */
    Short getShort(int idx);

    /**
     * Gets the short.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the short
     */
    Short getShort(String columnName, Short defaultResult);

    /**
     * Gets the short, default result is null.
     *
     * @param columnName the column name
     * @return the short, default result is null
     */
    Short getShort(String columnName);

    /**
     * Gets the boolean.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the boolean
     */
    Boolean getBoolean(int idx, Boolean defaultResult);

    /**
     * Gets the boolean, default result is null
     *
     * @param idx idx
     * @return the boolean, default result is null
     */
    Boolean getBoolean(int idx);

    /**
     * Gets the boolean.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the boolean
     */
    Boolean getBoolean(String columnName, Boolean defaultResult);

    /**
     * Gets the boolean, default result is boolean
     *
     * @param columnName column name
     * @return the boolean, default result is null
     */
    Boolean getBoolean(String columnName);

    /**
     * Gets the date.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the date
     */
    Date getDate(int idx, Date defaultResult);

    /**
     * Gets the date, default result is null.
     *
     * @param idx idx
     * @return the date, default result is null
     */
    Date getDate(int idx);

    /**
     * Gets the date.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the date
     */
    Date getDate(String columnName, Date defaultResult);

    /**
     * Gets the date, default result is null
     *
     * @param columnName the column name
     * @return the date, default result is null
     */
    Date getDate(String columnName);

    /**
     * Gets the value.
     *
     * @param idx           the idx
     * @param defaultResult the default result
     * @return the value
     */
    public Object getValue(int idx, Object defaultResult);

    /**
     * Gets the object, default value is null.
     *
     * @param idx idx
     * @return the object, default value is null
     */
    Object getValue(int idx);

    /**
     * Gets the value.
     *
     * @param columnName    the column name
     * @param defaultResult the default result
     * @return the value
     */
    Object getValue(String columnName, Object defaultResult);

    /**
     * Gets the object, default value is null
     *
     * @param columnName the column name
     * @return the object, default value is null
     */
    Object getValue(String columnName);

    /**
     * Gets the rows number.
     *
     * @return the rows number
     */
    Integer getRowsNumber();

    /**
     * Get query information.
     *
     * @return query information
     */
    QueryInfo getQueryInfo();

    /**
     * Method return all values from current row with pipe separator.
     * Example:
     * <p>
     * 0 | ColumnValue1 | ColumnValue2 | ColumnValue3 | ...<br>
     * 1 | ColumnValue2 | ColumnValue2 | ColumnValue3 | ...<br>
     * 2 | ...
     * </p>
     *
     * @return current rown from result
     */
    String getCurrentRecordDesc();

    /**
     * Mapping criteria result to object.
     *
     * @param mapper implementation of mapper
     * @param <T>    class to return
     * @return object
     */
    <T> T getRow(NativeObjectMapper<T> mapper);

}
