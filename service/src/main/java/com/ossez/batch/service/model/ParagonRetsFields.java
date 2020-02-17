/**
 * 
 */
package com.ossez.batch.service.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * @author YuCheng Hu
 *
 */

public enum ParagonRetsFields {
	MLS_NUMBER("L_ListingID"), // ListingID
	LISTING_STATUS("L_Status"), // ListingStatus
	STREET_NUMBER("L_AddressNumber"), // StreetNumberIDX
	STREET_NAME("L_AddressStreet"), // StreetNameIDX
	STREET_TYPE("L_streetdesignationid"), // STREET_TYPE
	TOWN("L_City"), // OfficialTown
	STATE("L_State"), // StateOrProvince
	COUNTY("L_Area"), // County
	ZIP("L_Zip"), // PostalCode
	LATITUDE("LM_char100_5"), // Latitude
	LONGITUDE("LM_char100_6"), // Longitude
	// PHOTO
	PHOTO_COUNT("L_PictureCount"), // photoCount
	// TIMESTAMP
	TS_PHOTO_UPDATED("L_Last_Photo_updt"), // Photo Updated TimeStamp
	TS_CLOSED("L_ClosingDate"),
	TS_LEASED("LM_DateTime_7"),
	MODIFICATION_TIMESTAMP("L_UpdateDate"), // ModificationTimestamp
	
	// MORE
	FULL_BATH_ROOMS("LM_Int1_1"), // Baths
	BED_ROOMS("LM_Int1_6"), // Bedrooms
	

	AGENT_MLSID("LA1_AgentID"), // ListingAgentID
	LISTAGENT_AGENTID("L_ListAgent1"), // ListAgentAgentID
	LISTAGENT_OFFICEID("L_ListOffice1"), // ListAgentOfficeID
	LISTPRICE("L_AskingPrice"), // ListPrice
	PRICE_CLOSED("L_SoldPrice"),
	PRICE_LEASED("LM_Dec_30"),
	MAPCOORDINATES("LM_Char25_7"), // MapCoordinates
	LISTING_TYPE("L_Type_"), // PropertyType
	DESCRIPTION("LR_remarks22"), // description
	ROOMS_TOTAL("LM_Int1_16"), // TotalRooms
	SCHOOL_DISTRICT("LM_Char10_32"), // SchoolDistrict
	SCHOOL_ELEMENTARY("LM_Char10_68"), // SchoolElementary
	SCHOOL_HIGH("LM_Char10_2"), // SchoolHigh
	SCHOOL_JUNIORHIG("LM_Char10_69"), // JuniorHighSchool
	SEASONAL("LM_Char5_60"), // SeasonalYN
	FINISHED_SQFT("LM_Int4_16"), // ApxFinSqFtTotal
	LOT_SIZE("L_NumAcres"), // LotSizeArea
	TAXES("LM_Dec_29"), // TaxAmount
	BATH_ROOMS("LM_Int4_36"), // TotalBaths
	VIRTUALTOUR_URL("VT_VTourURL"), // VirtualTourURL
	YEAR_BUILT("LM_Int2_4"), // YearBuilt
	AMENITIES("LFD_FeaturesInterior_15"), // Amenities
	BASEMENT("LFD_BasementDescription_3"), // Basement
	CONSTRUCTION("LFD_Construction_4"), // Construction
	DRIVEWAY("LFD_Driveway_8"), // Driveway
	ELECTRIC("LFD_Electric_9"), // Electric
	EQUIPMENT_AND_APPLIANCES("LFD_Appliances_2"), // EquipmentAndAppliances
	EXTERIOR("LFD_Exterior_12"), // Exterior
	EXTERIOR_FEAT("LFD_FeaturesExterior_14"), // ExteriorFeat
	FINANCING("LFD_Financing_18"), // Financing
	FOUNDATION("LFD_Foundation_20"), // Foundation
	GARAGE_AND_PARKING("LM_Char10_26"), // GarageAndParking
	GARAGE("LM_Char1_2"),
	GARAGE_SIZE("LM_Dec_8"), // GarageCapacityNumber
	HEATING("LFD_Heating_23"), // HeatingAndCooling
	COOLING("LFD_Cooling_6"), // HeatingAndCooling
	HEAT_FUEL("LFD_HeatFuel_22"), // HeatFuel
	INTERIOR_FEAT("LFD_SaleIncludes_100"), // InteriorFeat
	LOT_DESCRIPTION("LFD_LotDescription_24"), // LotDescription
	ROOF("LFD_Roof_29"), // Roof
	ROADS("LFD_Roads_28"), // Roads
	SEWER("LFD_Sewer_30"), // Sewer
	STYLE("LFD_Style_32"), // Style
	WATER_HEATER("LFD_WaterHeater_36"), // WaterHeater
	DISABILITY_FEATURES("LFD_FeaturesAccessibility_13"), // DisabilityFeatures
	TAX_YEAR("LM_Char10_48"), // TaxYear
	LOT("LM_Char25_12"), // Lot
	SURVEYED("LM_Char1_26"), // SurveyedYN
	FLOODZONE("LM_Char1_18"), // FloodZone
	DINING_ROOM_SIZE("LM_Char30_12"), // DiningRoomSize
	ASSESSMENT_AMOUNT("LM_Int4_1"), // AssessmentAmount
	BATHS_PARTIAL("LM_Int1_2"), // BathsPartial
	BATHS34("LM_Int1_4"), // Baths34
	HOA_FEES("LM_Dec_10"), // CondoOwnersAssociationDues
	BEDROOM2_SIZE("LM_Char30_18"), // Bedroom2Size
	BEDROOM3_SIZE("LM_Char30_19"), // Bedroom3Size
	BEDROOM4_SIZE("LM_Char30_20"), // Bedroom4Size
	LIVINGROOM_SIZE("LM_Char30_13"), // LivingRoomSize
	BEDROOM_MASTER_DIMENSIONS("LM_Char30_17"), // BedRoomMasterDimensions
	KITCHEN_SIZE("LM_Char30_11"), // KitchenSize
	WATER_FRONTAGEP("LM_Int4_40"), // WaterFrontage
	DEVELOPMENT_DESC("LM_Char50_4"), // DevelopmentDesc
	FAMILYROOM_SIZE("LM_Char30_14"), // FamilyRoomSize
	SERIALNUMBER1("LM_Char25_26"), // SerialNumber1
	MOBILEHOME_MAKE("LM_Char30_5"), // MobileHomeMake
	MODEL_NAME("LM_Char50_2"), // ModelName
	// ZIP("L_ListOffice1"), // TransferFee
	OCCUPANT_RESTRICTIONS("LFD_Restrictions_27"), // OccupantRestrictions
	NEGOTIABLE("LFD_Possession_26"), // Negotiable
	WATER_CF("LFD_Water_35"), // WaterCF
	// ZIP("L_ListOffice1"), // FeeIncludes
	SUITABLE_USE("LFD_SuitableUse_33"), // SuitableUse
	CONDO_UNIT_NUMBER("L_Address2"), // CondoUnitNumber
	FINISHED_ABOVE_GRADE("LM_Dec_21"), // FinishedAboveGrade
	SQFT_FINISHED_BELOW_GRADE("LM_Dec_22"), // SqFtFinishedBelowGrade
	// MEDIA
	MED_MLSNUMBER("L_DisplayId"), // SqFtFinishedBelowGrade
	MED_IMG_URL("MED_media_url"), // SqFtFinishedBelowGrade
	MED_IMG_SEQUENCE("MED_sequence"), // SqFtFinishedBelowGrade
	// CLOSE
	DOM("L_DOM"),
	CLOSE_AGENTID("L_SellingAgent1"),
	CLOSE_OFFICEID("L_SellingOffice1");

	public String val;

	ParagonRetsFields(String val) {
		this.val = val;
	}

	public String getVal() {
		return val;
	}

	public void setVal(String val) {
		this.val = val;
	}

	/**
	 * Residential
	 */
	public static String[] getResidentialFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MLS_NUMBER);
		fieldList.add(LISTING_STATUS);
		fieldList.add(STREET_NUMBER);
		fieldList.add(STREET_NAME);
		fieldList.add(STREET_TYPE);
		fieldList.add(TOWN);
		fieldList.add(STATE);
		fieldList.add(COUNTY);
		fieldList.add(ZIP);
		fieldList.add(LATITUDE);
		fieldList.add(LONGITUDE);
		fieldList.add(PHOTO_COUNT);
		fieldList.add(TS_PHOTO_UPDATED);
		fieldList.add(FULL_BATH_ROOMS);
		fieldList.add(BED_ROOMS);
		fieldList.add(MODIFICATION_TIMESTAMP);
		fieldList.add(GARAGE);
		fieldList.add(GARAGE_SIZE);
		fieldList.add(AGENT_MLSID);
		fieldList.add(LISTAGENT_AGENTID);
		fieldList.add(LISTAGENT_OFFICEID);
		fieldList.add(LISTPRICE);
		fieldList.add(PRICE_CLOSED);
		fieldList.add(CLOSE_AGENTID);
		fieldList.add(CLOSE_OFFICEID);
		fieldList.add(TS_CLOSED);
		fieldList.add(TS_LEASED);
		fieldList.add(DOM);
		fieldList.add(MAPCOORDINATES);
		fieldList.add(LISTING_TYPE);
		fieldList.add(DESCRIPTION);
		fieldList.add(ROOMS_TOTAL);
		fieldList.add(SCHOOL_DISTRICT);
		fieldList.add(SCHOOL_ELEMENTARY);
		fieldList.add(SCHOOL_HIGH);
		fieldList.add(SCHOOL_JUNIORHIG);
		fieldList.add(SEASONAL);
		fieldList.add(FINISHED_SQFT);
		fieldList.add(LOT_SIZE);
		fieldList.add(TAXES);
		fieldList.add(BATH_ROOMS);
		fieldList.add(VIRTUALTOUR_URL);
		fieldList.add(YEAR_BUILT);
		fieldList.add(AMENITIES);
		fieldList.add(BASEMENT);
		fieldList.add(CONSTRUCTION);
		fieldList.add(DRIVEWAY);
		fieldList.add(ELECTRIC);
		fieldList.add(EQUIPMENT_AND_APPLIANCES);
		fieldList.add(EXTERIOR);
		fieldList.add(EXTERIOR_FEAT);
		fieldList.add(FINANCING);
		fieldList.add(FOUNDATION);
		fieldList.add(GARAGE_AND_PARKING);
		fieldList.add(HEATING);
		fieldList.add(COOLING);
		fieldList.add(HEAT_FUEL);
		fieldList.add(INTERIOR_FEAT);
		fieldList.add(LOT_DESCRIPTION);
		fieldList.add(ROOF);
		fieldList.add(ROADS);
		fieldList.add(SEWER);
		fieldList.add(STYLE);
		fieldList.add(WATER_HEATER);
		fieldList.add(DISABILITY_FEATURES);
		fieldList.add(TAX_YEAR);
		fieldList.add(LOT);
		fieldList.add(SURVEYED);
		fieldList.add(FLOODZONE);
		fieldList.add(DINING_ROOM_SIZE);
		fieldList.add(ASSESSMENT_AMOUNT);
		fieldList.add(BATHS_PARTIAL);
		fieldList.add(BATHS34);
		fieldList.add(BEDROOM2_SIZE);
		fieldList.add(BEDROOM3_SIZE);
		fieldList.add(BEDROOM4_SIZE);
		fieldList.add(LIVINGROOM_SIZE);
		fieldList.add(BEDROOM_MASTER_DIMENSIONS);
		fieldList.add(KITCHEN_SIZE);
		fieldList.add(WATER_FRONTAGEP);
		fieldList.add(DEVELOPMENT_DESC);
		fieldList.add(FAMILYROOM_SIZE);
		fieldList.add(SERIALNUMBER1);
		fieldList.add(MOBILEHOME_MAKE);
		fieldList.add(MODEL_NAME);
		fieldList.add(OCCUPANT_RESTRICTIONS);
		fieldList.add(NEGOTIABLE);
		fieldList.add(WATER_CF);
		fieldList.add(SUITABLE_USE);
		fieldList.add(CONDO_UNIT_NUMBER);
		fieldList.add(FINISHED_ABOVE_GRADE);
		fieldList.add(SQFT_FINISHED_BELOW_GRADE);
		fieldList.add(HOA_FEES);

		return fieldsToArray(fieldList);
	}

	/**
	 * Land
	 * 
	 * @return
	 */
	public static String[] getLandFields() {
		String[] retsFields = new String[] { MLS_NUMBER.val, LISTING_STATUS.val, STREET_NUMBER.val, STREET_NAME.val, STREET_TYPE.val,
				TOWN.val, STATE.val, COUNTY.val, ZIP.val, LATITUDE.val, LONGITUDE.val, PHOTO_COUNT.val, TS_PHOTO_UPDATED.val,
				FULL_BATH_ROOMS.val, BED_ROOMS.val, MODIFICATION_TIMESTAMP.val, AGENT_MLSID.val, LISTAGENT_AGENTID.val,
				LISTAGENT_OFFICEID.val, LISTPRICE.val, MAPCOORDINATES.val, LISTING_TYPE.val, DESCRIPTION.val, SCHOOL_DISTRICT.val,
				SCHOOL_ELEMENTARY.val, SCHOOL_HIGH.val, SCHOOL_JUNIORHIG.val, LOT_SIZE.val, TAXES.val, BATH_ROOMS.val,
				VIRTUALTOUR_URL.val };
		return retsFields;
	}

	/**
	 * Commercial Sale
	 * 
	 * @return
	 */
	public static String[] getCommercialSaleFields() {
		String[] retsFields = new String[] { MLS_NUMBER.val, LISTING_STATUS.val, STREET_NUMBER.val, STREET_NAME.val, STREET_TYPE.val,
				TOWN.val, STATE.val, COUNTY.val, ZIP.val, LATITUDE.val, LONGITUDE.val, PHOTO_COUNT.val, TS_PHOTO_UPDATED.val,
				FULL_BATH_ROOMS.val, BED_ROOMS.val, MODIFICATION_TIMESTAMP.val, GARAGE_SIZE.val, AGENT_MLSID.val, LISTAGENT_AGENTID.val,
				LISTAGENT_OFFICEID.val, LISTPRICE.val, MAPCOORDINATES.val, LISTING_TYPE.val, DESCRIPTION.val, SEASONAL.val,
				FINISHED_SQFT.val, LOT_SIZE.val, TAXES.val, BATH_ROOMS.val, VIRTUALTOUR_URL.val, YEAR_BUILT.val };
		return retsFields;
	}

	/**
	 * Commercial Lease
	 * 
	 * @return
	 */
	public static String[] getCommercialLeaseFields() {
		String[] retsFields = new String[] { MLS_NUMBER.val, LISTING_STATUS.val, STREET_NUMBER.val, STREET_NAME.val, STREET_TYPE.val,
				TOWN.val, STATE.val, COUNTY.val, ZIP.val, LATITUDE.val, LONGITUDE.val, PHOTO_COUNT.val, TS_PHOTO_UPDATED.val,
				FULL_BATH_ROOMS.val, BED_ROOMS.val, MODIFICATION_TIMESTAMP.val, AGENT_MLSID.val, LISTAGENT_AGENTID.val,
				LISTAGENT_OFFICEID.val, LISTPRICE.val, MAPCOORDINATES.val, LISTING_TYPE.val, DESCRIPTION.val, SEASONAL.val,
				FINISHED_SQFT.val, LOT_SIZE.val, BATH_ROOMS.val, VIRTUALTOUR_URL.val, YEAR_BUILT.val };
		return retsFields;
	}

	/**
	 * Multi-Family
	 * 
	 * @return
	 */
	public static String[] getMultiFamilyFields() {
		String[] retsFields = new String[] { MLS_NUMBER.val, LISTING_STATUS.val, STREET_NUMBER.val, STREET_NAME.val, STREET_TYPE.val,
				TOWN.val, STATE.val, COUNTY.val, ZIP.val, LATITUDE.val, LONGITUDE.val, PHOTO_COUNT.val, TS_PHOTO_UPDATED.val,
				FULL_BATH_ROOMS.val, BED_ROOMS.val, MODIFICATION_TIMESTAMP.val, GARAGE_SIZE.val, AGENT_MLSID.val, LISTAGENT_AGENTID.val,
				LISTAGENT_OFFICEID.val, LISTPRICE.val, MAPCOORDINATES.val, LISTING_TYPE.val, DESCRIPTION.val, ROOMS_TOTAL.val,
				SCHOOL_DISTRICT.val, SCHOOL_ELEMENTARY.val, SCHOOL_HIGH.val, SCHOOL_JUNIORHIG.val, SEASONAL.val, FINISHED_SQFT.val,
				LOT_SIZE.val, TAXES.val, BATH_ROOMS.val, VIRTUALTOUR_URL.val, YEAR_BUILT.val };
		return retsFields;
	}

	/**
	 * Get PruneListingFields
	 * 
	 * @return
	 */
	public static String[] getPruneListingFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MLS_NUMBER);
		fieldList.add(LISTING_STATUS);

		return fieldsToArray(fieldList);
	}

	public static String[] getCloseListingFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MLS_NUMBER);
		fieldList.add(PRICE_CLOSED);
		fieldList.add(LISTING_STATUS);
		fieldList.add(CLOSE_AGENTID);
		fieldList.add(CLOSE_OFFICEID);
		fieldList.add(TS_CLOSED);
		fieldList.add(TS_LEASED);
		fieldList.add(DOM);

		return fieldsToArray(fieldList);
	}

	public static String[] getCloseCommercialLeaseListingFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MLS_NUMBER);
		fieldList.add(PRICE_CLOSED);
		fieldList.add(PRICE_LEASED);
		fieldList.add(LISTING_STATUS);
		fieldList.add(CLOSE_AGENTID);
		fieldList.add(CLOSE_OFFICEID);
		fieldList.add(TS_CLOSED);
		fieldList.add(TS_LEASED);
		fieldList.add(DOM);

		return fieldsToArray(fieldList);
	}

	/**
	 * PHOTO FIELDS
	 * 
	 * @return
	 */
	public static String[] getPhotoFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MLS_NUMBER);
		fieldList.add(PHOTO_COUNT);
		fieldList.add(TS_PHOTO_UPDATED);

		return fieldsToArray(fieldList);
	}

	/**
	 * Media Fields
	 * 
	 * @return
	 */
	public static String[] getMediaFields() {
		List<ParagonRetsFields> fieldList = new ArrayList<ParagonRetsFields>();
		fieldList.add(MED_MLSNUMBER);
		fieldList.add(MED_IMG_URL);
		fieldList.add(MED_IMG_SEQUENCE);

		return fieldsToArray(fieldList);
	}

	/**
	 * Get Residential FeatureNames
	 * 
	 * @return
	 */
	public static HashMap<String, String> getResidentialFeatureNames() {
		HashMap<String, String> residentialFeatureMap = new LinkedHashMap<String, String>();
		residentialFeatureMap.put(AMENITIES.val, "Amenities");
		residentialFeatureMap.put(BASEMENT.val, "Basement");
		residentialFeatureMap.put(CONSTRUCTION.val, "Construction");
		residentialFeatureMap.put(DRIVEWAY.val, "Driveway");
		residentialFeatureMap.put(ELECTRIC.val, "Electric");
		residentialFeatureMap.put(EQUIPMENT_AND_APPLIANCES.val, "EquipmentAndAppliances");
		residentialFeatureMap.put(EXTERIOR.val, "Exterior");
		residentialFeatureMap.put(EXTERIOR_FEAT.val, "ExteriorFeat");
		residentialFeatureMap.put(FINANCING.val, "Financing");
		residentialFeatureMap.put(FOUNDATION.val, "Foundation");
		residentialFeatureMap.put(GARAGE_AND_PARKING.val, "GarageAndParking");
		residentialFeatureMap.put(INTERIOR_FEAT.val, "InteriorFeat");
		residentialFeatureMap.put(HEATING.val, "HeatingAndCooling");
		residentialFeatureMap.put(COOLING.val, "HeatingAndCooling");
		residentialFeatureMap.put(HEAT_FUEL.val, "HeatFuel");
		residentialFeatureMap.put(LOT_DESCRIPTION.val, "LotDescription");
		residentialFeatureMap.put(NEGOTIABLE.val, "Negotiable");
		residentialFeatureMap.put(OCCUPANT_RESTRICTIONS.val, "OccupantRestrictions");
		residentialFeatureMap.put(ROADS.val, "Roads");
		residentialFeatureMap.put(ROOF.val, "Roof");
		residentialFeatureMap.put(SEWER.val, "Sewer");
		residentialFeatureMap.put(WATER_HEATER.val, "WaterHeater");
		// residentialFeatureMap.put(FEE.val, "FeeIncludes");
		residentialFeatureMap.put(DISABILITY_FEATURES.val, "DisabilityFeatures");
		residentialFeatureMap.put(STYLE.val, "Style");
		residentialFeatureMap.put(WATER_CF.val, "WaterCF");
		residentialFeatureMap.put(SUITABLE_USE.val, "SuitableUse");
		residentialFeatureMap.put(FINISHED_ABOVE_GRADE.val, "FinishedAboveGrade");
		residentialFeatureMap.put(SQFT_FINISHED_BELOW_GRADE.val, "SqFtFinishedBelowGrade");

		return residentialFeatureMap;
	}

	public static HashMap<String, String> getLandFeatureNames() {
		HashMap<String, String> featureMap = new LinkedHashMap<String, String>();
		featureMap.put(AMENITIES.val, "Amenities");
		featureMap.put(BASEMENT.val, "Basement");
		featureMap.put(CONSTRUCTION.val, "Construction");
		featureMap.put(DRIVEWAY.val, "Driveway");
		featureMap.put(ELECTRIC.val, "Electric");
		featureMap.put(EQUIPMENT_AND_APPLIANCES.val, "EquipmentAndAppliances");
		featureMap.put(EXTERIOR.val, "Exterior");
		featureMap.put(EXTERIOR_FEAT.val, "ExteriorFeat");
		featureMap.put(FINANCING.val, "Financing");
		featureMap.put(FOUNDATION.val, "Foundation");
		featureMap.put(GARAGE_AND_PARKING.val, "GarageAndParking");
		featureMap.put(INTERIOR_FEAT.val, "InteriorFeat");
		featureMap.put(HEATING.val, "HeatingAndCooling");
		featureMap.put(COOLING.val, "HeatingAndCooling");
		featureMap.put(HEAT_FUEL.val, "HeatFuel");
		featureMap.put(LOT_DESCRIPTION.val, "LotDescription");
		featureMap.put(NEGOTIABLE.val, "Negotiable");
		featureMap.put(OCCUPANT_RESTRICTIONS.val, "OccupantRestrictions");
		featureMap.put(ROADS.val, "Roads");
		featureMap.put(ROOF.val, "Roof");
		featureMap.put(SEWER.val, "Sewer");
		featureMap.put(WATER_HEATER.val, "WaterHeater");
		// residentialFeatureMap.put(FEE.val, "FeeIncludes");
		featureMap.put(DISABILITY_FEATURES.val, "DisabilityFeatures");
		featureMap.put(STYLE.val, "Style");
		featureMap.put(WATER_CF.val, "WaterCF");
		featureMap.put(SUITABLE_USE.val, "SuitableUse");
		featureMap.put(FINISHED_ABOVE_GRADE.val, "FinishedAboveGrade");
		featureMap.put(SQFT_FINISHED_BELOW_GRADE.val, "SqFtFinishedBelowGrade");

		return featureMap;
	}

	/**
	 * Get Land FeatureNames
	 * 
	 * @return
	 */
	public static HashMap<String, String> getCommercialFeatureNames() {
		HashMap<String, String> featureMap = new LinkedHashMap<String, String>();
		featureMap.put(HEATING.val, "HeatingAndCooling");
		featureMap.put(COOLING.val, "HeatingAndCooling");
		featureMap.put(HEAT_FUEL.val, "Fuel");
		featureMap.put(GARAGE_AND_PARKING.val, "Parking");
		featureMap.put(CONSTRUCTION.val, "Construction");
		featureMap.put(EXTERIOR.val, "Exterior");
		featureMap.put(FINANCING.val, "Financing");
		featureMap.put(BASEMENT.val, "Basement");
		featureMap.put(FOUNDATION.val, "Foundation");
		// featureMap.put(??, "Misc");
		featureMap.put(ROOF.val, "Roof");
		featureMap.put(INTERIOR_FEAT.val, "SaleIncludes");
		// featureMap.put(??, "Transport");
		featureMap.put(LISTING_TYPE.val, "Type");
		// featureMap.put(LOT_DESCRIPTION.val, "Utilities");
		featureMap.put(DISABILITY_FEATURES.val, "DisabilityFeatures");
		featureMap.put(STYLE.val, "Style");
		// featureMap.put(OCCUPANT_RESTRICTIONS.val, "Floors");
		// featureMap.put(ROADS.val, "LeaseType");
		// featureMap.put(SEWER.val, "MLSType");
		featureMap.put(LISTING_TYPE.val, "PropertyType");

		return featureMap;
	}

	/**
	 * 
	 * @param fieldList
	 * @return
	 */
	private static String[] fieldsToArray(List<ParagonRetsFields> fieldList) {
		List<String> valList = new ArrayList<String>();
		for (int i = 0; i < fieldList.size(); i++) {
			valList.add(fieldList.get(i).val);
		}
		return valList.toArray(new String[valList.size()]);
	}

}
