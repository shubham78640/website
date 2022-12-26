package com.care.carecrew.adapter;

import java.util.ArrayList;
import java.util.List;

import com.care.carecrew.enums.Service;
import com.care.carecrew.generic.dto.EnumListing;

import lombok.experimental.UtilityClass;

@UtilityClass
public class DropDownAdapter {

//	public static List<EnumListing<Cities>> getCities() {
//		List<EnumListing<Cities>> data = new ArrayList<>();
//		for (Cities tag : Cities.values()) {
//			data.add(EnumListing.of(tag, tag.getName()));
//		}
//
//		return data;
//	}

	public static List<EnumListing<Service>> getService() {
		List<EnumListing<Service>> data = new ArrayList<>();
		for (Service tag : Service.values()) {
			data.add(EnumListing.of(tag, tag.getName()));
		}
		return data;
	}
}
