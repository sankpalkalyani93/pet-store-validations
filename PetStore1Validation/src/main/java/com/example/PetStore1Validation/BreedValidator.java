package com.example.PetStore1Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class BreedValidator implements ConstraintValidator<ValidBreed, String>{

	@Override
	public boolean isValid(String breed, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return breed != null && (breed.equalsIgnoreCase("Labrador") || breed.equalsIgnoreCase("Husky") || breed.equalsIgnoreCase("german-shephard"));
	}
}
