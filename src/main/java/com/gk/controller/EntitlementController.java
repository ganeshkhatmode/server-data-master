package com.gk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gk.exception.EntitlementIdNotFoundException;
import com.gk.model.Entitlement;
import com.gk.service.EntitlementService;

@RestController
@RequestMapping("/api/v1/entitlement")
public class EntitlementController {

	@Autowired
	private EntitlementService entitlementService;
	
	@PostMapping("/add")
	public Entitlement save(@RequestBody Entitlement entitlement) {
		return entitlementService.save(entitlement);
	}
	
	@GetMapping("/{id}")
	public Entitlement getEntitlement(@PathVariable("id") long id) throws EntitlementIdNotFoundException {
		return entitlementService.findById(id);
	}
	
	@GetMapping("/all")
	public List<Entitlement> findAll(){
		return entitlementService.findAll();
	}
}
