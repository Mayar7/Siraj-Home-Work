package com.javapapers.designpattern;

import java.io.IOException;

public interface Subject {

	public char getButton();
	public void setButton(char button);
	public void FuncthionButtonA(Observer observerButton);
	public void FuncthionButtonB(Observer observerButton) throws IOException;
	public void FuncthionButtonC(Observer observerButton);

	
	

}
