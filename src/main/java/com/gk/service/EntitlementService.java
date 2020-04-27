package com.gk.service;

import java.util.List;

import com.gk.dto.EntitlementRequest;
import com.gk.exception.EntitlementIdNotFoundException;
import com.gk.model.Entitlement;

public interface EntitlementService {

	public Entitlement save(Entitlement entitlement);
	
	public List<Entitlement> findAll();
	
	public Entitlement findById(long id) throws EntitlementIdNotFoundException;
	
	public List<Entitlement> update(EntitlementRequest entitlementRequest);
}
