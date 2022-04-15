package com.caresoft.models;
import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantAdmin;
import com.caresoft.clinicapp.HIPAACompliantUser;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {
	private String role; 
	private ArrayList<String> securityIncidents;
	
	public AdminUser(Integer id, String role) {
		super(id);
		this.role = role;
		this.securityIncidents = new ArrayList<String>(); 
	}

	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}

	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	 public void newIncident(String notes) {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
	            new Date(), this.id, notes
	        );
	        securityIncidents.add(report);
	    }
	    public void authIncident() {
	        String report = String.format(
	            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
	            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
	        );
	        securityIncidents.add(report);
	    }
	
	
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return this.securityIncidents; 
	}

	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length(); 
		if(length == 4) {
			this.pin = pin; 
			return true;
		}
		else {
			return false;
		}
	}
		

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if(this.id != confirmedAuthID) {
			authIncident(); 
			return false;
		}
		else {
			return true;
		}
		

	
	
	
	}
	

}
