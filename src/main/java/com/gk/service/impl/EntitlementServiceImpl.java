package com.gk.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.gk.dto.EntitlementRequest;
import com.gk.exception.EntitlementIdNotFoundException;
import com.gk.model.Entitlement;
import com.gk.service.EntitlementService;

@Service
public class EntitlementServiceImpl implements EntitlementService {

	private int id = 1;

	private List<Entitlement> entitlements = new ArrayList<>();

	@Override
	public Entitlement save(Entitlement entitlement) {
		entitlement.setId(id);
		id++;
		entitlements.add(entitlement);
		System.out.println(entitlement);
		return entitlement;
	}

	@Override
	public List<Entitlement> findAll() {

		return entitlements;
	}

	@Override
	public Entitlement findById(final long id) throws EntitlementIdNotFoundException {
		List<Entitlement> entilementFind = entitlements.stream().filter(entilement -> entilement.getId() == id)
				.collect(Collectors.toList());
		if (entilementFind.size() != 0) {
			return entilementFind.get(0);
		} else
			throw new EntitlementIdNotFoundException("Not found  entitlement " + id + " id.");
	}

	@Override
	public List<Entitlement> update(EntitlementRequest entitlementRequest) {
		for(Entitlement entitlement: entitlementRequest.getEntitlements()) {
			if(entitlement.getOperation().toLowerCase().equals("remove")) {
				entitlements.remove(entitlement);
			}else if(entitlement.getOperation().toLowerCase().equals("add")) {
				entitlements.add(entitlement);
			}
		}
		return entitlements;
	}
	
	

}
