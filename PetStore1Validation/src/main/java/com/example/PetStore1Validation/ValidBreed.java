package com.example.PetStore1Validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = BreedValidator.class)
public @interface ValidBreed {
	 String message() default "Invalid Breed Name";
	 Class<?>[] groups() default {};
	 Class<? extends Payload> [] payload() default {};
}
