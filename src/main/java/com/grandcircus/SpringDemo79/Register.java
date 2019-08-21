package com.grandcircus.SpringDemo79;

import org.springframework.stereotype.Component;

@Component
public class Register {

	private String fName;
	private String lName;
	private String eMail;
	private Double pNumber;
	private String pWord;
	public Register() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Register(String fName, String lName, String eMail, Double pNumber, String pWord) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.eMail = eMail;
		this.pNumber = pNumber;
		this.pWord = pWord;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public Double getpNumber() {
		return pNumber;
	}
	public void setpNumber(Double pNumber) {
		this.pNumber = pNumber;
	}
	public String getpWord() {
		return pWord;
	}
	public void setpWord(String pWord) {
		this.pWord = pWord;
	}
	@Override
	public String toString() {
		return "Login [fName=" + fName + ", lName=" + lName + ", eMail=" + eMail + ", pNumber=" + pNumber + ", pWord="
				+ pWord + "]";
	}
	
	

	
}
