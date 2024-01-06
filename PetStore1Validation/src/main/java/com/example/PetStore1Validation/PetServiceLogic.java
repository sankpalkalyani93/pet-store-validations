package com.example.PetStore1Validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Service
public class PetServiceLogic implements PetService{

	private PetReository petReository;
	private Validator validator;
	
	@Autowired
	public PetServiceLogic(PetReository petReository, Validator validator) {
		this.petReository = petReository;
		this.validator = validator;
	}
	
	@Override
	public Pet savePet(Pet pet) {
		/*System.out.println("Saving a pet");
		Errors errors = new BeanPropertyBindingResult(pet, "pet");
		validator.validate(pet, errors);
		
		
		if(errors.hasErrors()) {
			throw new PetValidationException("Validation failed...!", errors);
		}*/
		return this.petReository.save(pet);		
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		return this.petReository.findAll();
	}

	@Override
	public Pet getPetById(Long id) {
		// TODO Auto-generated method stub
		return this.petReository.findById(id).orElse(null);
	}
	
	@Override
	public void deletePetById(Long id) {
		// TODO Auto-generated method stub
		this.petReository.deleteById(id);
	}
	
	@Override
	public Pet updatePet(Pet pet) {
		// TODO Auto-generated method stub
		return this.petReository.save(pet);
	}
}
