package com.gk.dto;

import java.util.List;

import org.springframework.stereotype.Component;

import com.gk.model.Entitlement;

@Component
public class EntitlementRequest {

	private List<Entitlement> entitlements;

	public EntitlementRequest() {
		super();
	}

	public List<Entitlement> getEntitlements() {
		return entitlements;
	}

	public void setEntitlements(List<Entitlement> entitlements) {
		this.entitlements = entitlements;
	}

	@Override
	public String toString() {
		return "EntitlementRequest [entitlements=" + entitlements + "]";
	}
	
	
	
	
}
