package com.yeah.texas;

import javax.persistence.Column;
import javax.persistence.Id;

public class Texas {

	@Id
	@Column(name="id")
	private String id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="dS")
	private String dS;
	
	@Column(name="leftCounter")
	private String leftCounter;
	
	@Column(name="pAndL")
	private String pAndL;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getdS() {
		return dS;
	}

	public void setdS(String dS) {
		this.dS = dS;
	}

	public String getLeftCounter() {
		return leftCounter;
	}

	public void setLeftCounter(String leftCounter) {
		this.leftCounter = leftCounter;
	}

	public String getpAndL() {
		return pAndL;
	}

	public void setpAndL(String pAndL) {
		this.pAndL = pAndL;
	}
	

	
	
}
