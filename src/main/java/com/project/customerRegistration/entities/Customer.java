package com.project.customerRegistration.entities;

import java.io.Serializable;
import java.util.ArrayList;  
import java.util.Date;
import java.util.List; 
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table( name = "tb_Customer" )
public class Customer implements Serializable {
	 private static final long serialVersionUID = 1L;
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;

	 private String name;
	 private String identification;
	 private MaritalStatus maritalstatus;
	 private Character gender;  
	
	 @Temporal(TemporalType.DATE)
	 private Date birth;
	
	 @OneToOne
	 @JoinColumn(name = "address_id")
	 private Address address;
 
	 @OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL )   
	 private List<Phone> phones = new ArrayList<>();
	 
	 public Customer() {
		super();
	 }
	  
	public Customer(Long id, String name, String identification, MaritalStatus maritalstatus, Character gender,
			Date birth, Address address, List<Phone> phones) {  
		super();
		this.id = id;
		this.name = name;
		this.identification = identification;
		this.maritalstatus = maritalstatus;
		this.gender = gender;
		this.birth = birth;
		this.address = address;
		this.phones = phones;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public MaritalStatus getMaritalstatus() {
		return maritalstatus;
	}

	public void setMaritalstatus(MaritalStatus maritalstatus) {
		this.maritalstatus = maritalstatus;
	}

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public List<Phone> getPhones() {  
		return phones;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}

}
