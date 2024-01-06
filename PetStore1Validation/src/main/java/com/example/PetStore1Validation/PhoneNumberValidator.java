package com.example.PetStore1Validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;


public class PhoneNumberValidator implements ConstraintValidator<ValidPhoneNumber, String>{

	private static final String phoneNumberPattern = "^[0-9]{10}$";
	
	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		if(value == null) {
			return true;
		}
		
		Pattern pattern = Pattern.compile(phoneNumberPattern);
		Matcher matcher = pattern.matcher(value);
		
		return matcher.matches();
	}
}
