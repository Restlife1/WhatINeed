package com.ivet.whatineed.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ivet.whatineed.entity.services.IWhatineedServices;
import com.ivet.whatineed.entity.models.Whatineed;

@RestController
@CrossOrigin(origins="*")
public class WhatineedController {
	
	@Autowired
	private IWhatineedServices whatineedServices;
	
	@GetMapping("/api/whatineed")
	private List<Whatineed> getStuff(){
		
		return whatineedServices.getAllStuff();
		
	}
	
	@GetMapping("/api/whatineed/{id}")
	private Whatineed getOneStuff(@PathVariable(value = "id") long id) {
		
		return whatineedServices.get(id);
		
	}
	
	@PostMapping("/api/whatineed")
	private void addStuff(Whatineed stuff) {
		
		whatineedServices.addStuff(stuff);
		
	}
	
	@PutMapping("/api/whatineed{id}")
	private void updateStuff(Whatineed stuff, @PathVariable(value = "id") long id) {
		
		whatineedServices.put(stuff, id);
		
	}
	
	@DeleteMapping("/api/whatineed/{id}")
	private void deleteStuff(@PathVariable(value = "id") long id) {
		
		whatineedServices.deleteStuff(id);
		
	}

}
