/**
 * @author Itopia
 * 27-Apr-2015
 */
package com.sony.radio.rest.client.controller;

/**
 * @author Itopia
 *
 */

public class RestURIConstants {
	public static final String DUMMY_FRM = "/rest/emp/show";
	public static final String DUMMY_EMP = "/rest/emp/dummy";
	public static final String GET_EMP = "/rest/emp/{id}";
	public static final String GET_ALL_EMP = "/rest/emps";
	public static final String CREATE_EMP = "/rest/emp/create";
	public static final String DELETE_EMP = "/rest/emp/delete/{id}";

	public static final String EZ_USER_ALL = "/rest/ez/user/show";
	public static final String EZ_USER_BY_ID = "/rest/ez/user/{id}";
	public static final String EZ_USER_BY_NAME = "/rest/ez/user/{name}";
	
	public static final String EZ_STATE_ALL = "/rest/ez/state/show";
	public static final String EZ_COUNTRY_ALL = "/rest/ez/country/show";
	public static final String EZ_CITY_ALL = "/show";
}
