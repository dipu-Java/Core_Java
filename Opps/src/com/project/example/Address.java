package com.project.example;

public class Address {
       int hno;
       String streeet;
       String country;
       long pincode;
	public Address(int hno, String streeet, String country, long pincode) {
		super();
		this.hno = hno;
		this.streeet = streeet;
		this.country = country;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", streeet=" + streeet + ", country=" + country + ", pincode=" + pincode + "]";
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Address))return false;
		Address a=(Address)obj;
		return this.hno==a.hno && this.streeet.equals(a.streeet) &&
				this.country.equals(a.country)&&this.pincode==a.pincode;
	}
	
}
