package scannerPractice;

import java.util.Scanner;

public class ScannerProject {
	
	public static void main (String[] args){
		 Scanner sc = new Scanner(System.in);
		
		 String answer = "yes";
		 
		 
		 while(answer.equalsIgnoreCase("yes")){
		 System.out.print("Enter a number: ");
		 int num1 = sc.nextInt();
		 System.out.print("Enter an operation: ");
		 String opcode = sc.next();
		 System.out.print("Enter a number: ");
		 int num2 = sc.nextInt();
		 
		 opcode = opcode.trim();
		 
		 if(opcode.equals("+")){
			 int result = num1 + num2; 
			 System.out.print(result);
		 }
		 else if(opcode.equals("-")){
		 	int result = num1 - num2;
		 	System.out.print(result);
		 }
		 else if(opcode.equals("*")){
			 int result = num1 * num2;
			 System.out.print(result);
		 }
		 else if(opcode.equals("/")){
			 int result = num1 / num2;
			 System.out.print(result);
		 }
		 else
			 System.out.println("Doesn't work");
		 
		 System.out.println();
		 System.out.print("Do you want to try again? ");
		 
		 answer = sc.next();
		 
		 
		 System.out.println();
		 }	 
		 
}
}