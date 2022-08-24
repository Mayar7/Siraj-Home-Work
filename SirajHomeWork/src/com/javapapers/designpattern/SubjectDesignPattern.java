package com.javapapers.designpattern;

import java.io.IOException;

public interface SubjectDesignPattern {

	public char getButton();
	public void setButton(char button);
	public void FuncthionButtonA(ObserverDesignPattern observerButton);
	public void FuncthionButtonB(ObserverDesignPattern observerButton) throws IOException;
	public void FuncthionButtonC(ObserverDesignPattern observerButton);

	
	

}
