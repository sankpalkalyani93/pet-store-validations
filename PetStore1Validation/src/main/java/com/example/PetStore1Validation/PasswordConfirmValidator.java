package com.example.PetStore1Validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PasswordConfirmValidator implements ConstraintValidator<ValidPasssword, Pet>{

	
	@Override
	public boolean isValid(Pet pet, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		String password = pet.getPassword();
		String confirmPassword = pet.getConfirmPassword();
		
		return password != null && password.equals(confirmPassword);
	}
}