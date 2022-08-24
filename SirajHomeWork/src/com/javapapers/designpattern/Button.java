package com.javapapers.designpattern;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter; 

public class Button implements Subject{
	private char LaterButton;
	Date date=new Date(); 

	public Button(char button) {
		setButton(button);
	}

	//get for the number
	public char getButton() {
		return LaterButton;
	}
	// Set for the number
	public void setButton(char button) {
		this.LaterButton = button;
	}

	public void FuncthionButtonA(Observer observerButton) {
		int key=observerButton.getNumber();
		switch (key) {
		case 1:
			System.out.println("Move to the next mode");
			break;
		case 2:
			System.out.println("Move to the next mode");
			break;
		case 3:
			System.out.println("Move to the next mode");
			
			break;
		case 4:
			System.out.println("Move back to the first mode");
			
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}


	}

	public void FuncthionButtonB(Observer observerButton) throws IOException {
		int key=observerButton.getNumber();
		switch (key) {
		case 1:
			SimpleDateFormat formatTime = new SimpleDateFormat("HH:mm aa");
			String time = formatTime.format(date); // changing the format of 'date'
			// display time as per format
			System.out.println("Current Time in AM/PM Format is : " + time);
			break;
		case 2:
			//the year
			int year=date.getYear();   
			int currentYearForTheWatch=year+1900;//adding 1900 it will gave us the current Year  
			System.out.println("year is :"+currentYearForTheWatch);  
			break;
		case 3:
			System.out.print("Initial mode :");TimeForTheUser(0);
			System.out.print("Start mode :");TimeForTheUser(1);
			System.out.print("Pause mode: ");TimeForTheUser(1);
			System.out.print("Resume mode :");TimeForTheUser(2);
			break;
		case 4:
			//1-Create a file:
			File file1=new File("output.txt");

			//2- Create a file writer class:
			FileWriter writer =new FileWriter(file1);

			//3- Create a print writer class:
			PrintWriter Print= new PrintWriter(writer);

			Print.println("The One s2!");//it will print in the file text called output.txt
			Print.close();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}


	}
	public void FuncthionButtonC(Observer observerButton) {
		int key=observerButton.getNumber();
		switch (key) {
		case 1:
			System.out.println("Light");
			break;
		case 2:
			Format f = new SimpleDateFormat("EEEE");  
			String str = f.format(new Date());  
			System.out.println("day of the week is : "+ str);
			break;
		case 3:
			TimeForTheUser(0);
			break;
		case 4:
			//i printed this so it can be easy for you to see if it correct,
			//but you can delete this print and with the break it will not do anything.
			System.out.println("Do nothing");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}
	//help function: for time
	public void TimeForTheUser(int i) {
		SimpleDateFormat sdf = new SimpleDateFormat(" HH:mm:ss");
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, i);
		now.set(Calendar.HOUR_OF_DAY, 0);
		System.out.println(sdf.format(now.getTime()));		
	}



}
