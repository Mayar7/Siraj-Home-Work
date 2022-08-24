package com.javapapers.designpattern;

public class Mode implements ObserverDesignPattern {
	private int iNumber;
	private SubjectDesignPattern ButtonSubject;

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
	public void setSubject(SubjectDesignPattern subjectButton) {
		this.ButtonSubject=subjectButton;
	}



}
