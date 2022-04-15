package com.caresoft.models;
import java.util.ArrayList;
import java.util.Date;

import com.caresoft.clinicapp.HIPAACompliantUser;

public class Physician extends User implements HIPAACompliantUser {

    	private ArrayList<String> patientNotes;
    	
   
	
    public Physician(Integer id) {
			super(id);
		}



	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}



	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}



	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }



	@Override
	public boolean assignPin(int pin) {
		int length = String.valueOf(pin).length(); 
		if (length == 4) {
			this.pin = pin; 
			return true; 
		} 
		else {
			return false;
		}
		
	}
				
		



	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		if (this.id == confirmedAuthID) {
			return true; 
		}
		else {
			return false;
		}
		
	}

}

	
	

