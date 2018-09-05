package com.cubic.HibernateWithAnnotations;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="conemp")
public class ContractEmployee extends Employee{
	@Column(name="payperhour")
	private int payperhour;
	@Column(name="duration")
	private String duration;
	public int getPayperhour() {
		return payperhour;
	}
	public void setPayperhour(int payperhour) {
		this.payperhour = payperhour;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
}
