package org.txs;

import java.util.Scanner;

public class JavaProg {
	
	
		
		
	

	  public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter a number: ");
	    int number = input.nextInt();
	    int reverse = 0;
	    int originalNumber = number;
	    System.out.println("GIT Push");
	    while (number != 0) {
	      int lastDigit = number % 10;
	      reverse = (reverse * 10) + lastDigit;
	      number /= 10;
	    }
	    
	    if (originalNumber == reverse) {
	      System.out.println(originalNumber + " is a reverse of " + reverse);
	    } else {
	      System.out.println(originalNumber + " is not a reverse of " + reverse);
	    }
	  }
	}