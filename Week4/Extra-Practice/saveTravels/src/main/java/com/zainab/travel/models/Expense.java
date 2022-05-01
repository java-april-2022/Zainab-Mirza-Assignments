package com.zainab.travel.models;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="expenses")
public class Expense {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotNull 
	@Size(min=5, max=200, message="Name must be at least 5 characters.")
	private String expenseName; 
	
	@NotNull 
	@Size(min=5, max=200, message="Vendor must be at least 5 characters.")
	private String vendor; 
	
	@NotNull 
	@Range(min=1, max=1000, message="Amount must be filled out.")
	private Double amount; 
	
	
	@Column(updatable=false)
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date createdAt;
	    @DateTimeFormat(pattern="yyyy-MM-dd")
	    private Date updatedAt;
	    
	    
	    
	    public Expense() {
	    	
	    }
	
	    public Expense(String expenseName, String vendor, Double amount) {
	        this.expenseName = expenseName;
	        this.amount = amount;
	        this.vendor = vendor;
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getExpenseName() {
			return expenseName;
		}

		public void setExpenseName(String expenseName) {
			this.expenseName = expenseName;
		}

		public String getVendor() {
			return vendor;
		}

		public void setVendor(String vendor) {
			this.vendor = vendor;
		}

		public Double getAmount() {
			return amount;
		}

		public void setAmount(Double amount) {
			this.amount = amount;
		}

		@PrePersist
	    protected void onCreate(){
	        this.createdAt = new Date();
	    }
	    @PreUpdate
	    protected void onUpdate(){
	        this.updatedAt = new Date();
	    }
		
		
	
	
}
