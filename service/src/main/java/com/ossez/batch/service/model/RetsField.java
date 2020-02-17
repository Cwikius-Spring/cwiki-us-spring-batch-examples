/**
 * 
 */
package com.ossez.batch.service.model;

/**
 * @author YuCheng Hu
 *
 */

public class RetsField {

	// AGENT INFO FIELDs
	public static enum Agent {
		AGENT_ID, EMAIL, FIRST_NAME, LAST_NAME, DATE_UPDATE
	}

	// OFFICE INFO FIELDs
	public static enum Office {
		OFFICE_ID, OFFICE_NAME, OFFICE_ABBREVIATION, DATE_UPDATE
	}

	// RE INFO FIELDs
	public static enum Residential {
		MLS_NUMBER,
		LISTING_TYPE,
		LISTING_STATUS,
		LISTING_PRICE,
		// ADDRESS
		ADDRESS,
		ADDRESS_NUMBER,
		ADDRESS_NAME,
		ADDRESS_TYPE,
		CITY,
		COUNTY,
		STATE,
		ZIP,
		LATITUDE,
		LONGITUDE,
		// IMG
		TS_MODIFICATION
	}
}
