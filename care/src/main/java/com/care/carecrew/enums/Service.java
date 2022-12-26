package com.care.carecrew.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Service {
	HOUSEKEEPING("Housekeeping"),

	CHILD_CARE("Child Care"),

	COOKING("Cooking"),

	ELDER_CARE("Elder Care"),

	DRIVING("Driving"),

	OTHER("Other");

	private String name;
}
