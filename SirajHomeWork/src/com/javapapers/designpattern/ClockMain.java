package com.javapapers.designpattern;

import java.io.IOException;

final class ClockMain {

	public static void main(String[] args) throws IOException {
		//this project is about building a watch for the company called "מה השעה",
		//i builded it with the help of Observer that is type of design pattern.
		//the package contain 5 classes and one text file


		
		Button B1=new Button('A');
		Button B2=new Button('B');
		Button B3=new Button('C');
		//
		Mode M1=new Mode(1);
		Mode M2=new Mode(2);
		Mode M3=new Mode(3);
		Mode M4=new Mode(4);
		//mode1
		System.out.println("=======Mode1=======");
		B1.FuncthionButtonA(M1);
		B2.FuncthionButtonB(M1);
		B3.FuncthionButtonC(M1);
		//mode2
		System.out.println("=======Mode2=======");
		B1.FuncthionButtonA(M2);
		B2.FuncthionButtonB(M2);
		B3.FuncthionButtonC(M2);
		//mode3
		System.out.println("=======Mode3=======");
		B1.FuncthionButtonA(M3);
		B2.FuncthionButtonB(M3);
		B3.FuncthionButtonC(M3);
		//mode4
		System.out.println("=======Mode4=======");
		B1.FuncthionButtonA(M4);
		B2.FuncthionButtonB(M4);
		B3.FuncthionButtonC(M4);

		 





	}

}
