package com.johntran.burgertracker.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="burgers")
public class Burger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max = 100, message="Burger must be at least 3 characters")
	private String burgerName;
	
	@NotNull
	@Size(min = 3, max = 200, message="Resturant name must be at least 3 characters")
	private String resturantName;
	
	@NotNull
	@Min(value=0)
	@Max(value=5)
	private Integer rating;
	
	@NotNull
	@Size(min = 5, max = 300, message="Note must be longer than 5 characters")
	private String note;
	
	// This will not allow the createdAt column to be updated after creation
    @Column(updatable=false)
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createdAt;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;
    
    //================CONSTRUCTOR==================
	public Burger() {
		
	}
	
    
    public Burger(
			@NotNull @Size(min = 3, max = 100, message = "Burger must be at least 3 characters") String burgerName,
			@NotNull @Size(min = 3, max = 200, message = "Resturant name must be at least 3 characters") String resturantName,
			@NotNull @Min(0) @Max(5) Integer rating, @NotNull @Size(min = 5, max = 300, message = "Note must be longer than 5 characters") String note) {
		this.burgerName = burgerName;
		this.resturantName = resturantName;
		this.rating = rating;
		this.note = note;
	}




	//GETTER AND SETTERS
    public String getNote() {
    	return note;
    }
    
    public void setNote(String note) {
    	this.note = note;
    }
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBurgerName() {
		return burgerName;
	}
	public void setBurgerName(String burgerName) {
		this.burgerName = burgerName;
	}
	public String getResturantName() {
		return resturantName;
	}
	public void setResturantName(String resturantName) {
		this.resturantName = resturantName;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	// other getters and setters removed for brevity
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
	
	
	
	
}
