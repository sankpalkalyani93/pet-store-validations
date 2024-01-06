package com.example.PetStore1Validation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/pets")
@Validated
public class PetController {

	@Autowired
	private PetService petService;
	
	@PostMapping
	public ResponseEntity<Pet> savePet(@Valid @RequestBody Pet p) {
		Pet p1 = petService.savePet(p);
		return ResponseEntity.ok(p1);
	}
	
	@GetMapping
	public List<Pet> getAllPets(){
		return petService.getAllPets();
	}
	
	@GetMapping("/{id}")
	public Pet getPetById(@PathVariable Long id) {
		return petService.getPetById(id);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePetById(@PathVariable Long id) {
		petService.deletePetById(id);
		return ResponseEntity.ok("Pet deleted successfully");
	}
	
	@PutMapping("/{id}")
	public Pet updatePet(@RequestBody Pet pet, @PathVariable Long id) {
		pet.setId(id);
		return this.petService.updatePet(pet);
	}
}
