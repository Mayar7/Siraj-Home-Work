package com.javapapers.designpattern;

public class Mode implements Observer {
	private int iNumber;
	private Subject ButtonSubject;

	public Mode(int number) {
		setNumber(number);
	}
	// Get for the number
	public int getNumber() {
		return iNumber;
	}
	// Set for the number
	public void setNumber(int number) {
		this.iNumber = number;
	}
	//set the subject
	public void setSubject(Subject subject) {
		this.ButtonSubject=subject;
	}



}
