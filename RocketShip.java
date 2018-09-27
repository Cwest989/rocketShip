import java.util.Scanner;

public class RocketShip {
	public static void main(String args[]) {
		System.out.println("What is your input?");
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		topBottom(input); //Method that will print out the top and bottom cones of the rocket ship
		border(input);// This method will make the border between rocket ship segments
		upArrow(input);// Makes the part of the rocket ship body that looks like arrows pointing up
		downArrow(input);// Makes the part of the rocket ship body that looks like arrows pointing down
		border(input);
		downArrow(input);
		upArrow(input);
		border(input);
		topBottom(input);
		scnr.close();
	}
	
	public static void topBottom(int input) {
		for(int i = 1; i<=((input*2)-1); i++) {//Outer loop that figures out how tall the cone will be for the rocket ship and makes that many lines
			for(int x = 0; x<(((input*2))-i); x++) {//Prints out the number of spaces equal to input*2 minus times run
				System.out.print(" ");
			}
			for(int j = 0; j!= i; j++) {//Prints out slashes until there are as many slashes as times run
				System.out.print("/");
			}
							
		
		System.out.print("**");//Constantly prints out ** even if the rocket ship is size 1000 or size 2
		for(int j = 0; j!=i; j++) {//Prints out backslashes until there are as many as times run 
			System.out.print("\\");//You have to put \\ to print one \ because \ is used to print out new lines and tabs
		}
		System.out.print("\n");//Makes a new line once everything is printed out on the line so it can start a new line
		}
	}
	public static void border(int input) {
		System.out.print("+");//Prints one + at the start of every border
		for(int i = 0; i<(input*2); i++) {//Repeatedly prints out =* input*2 times
			System.out.print("=*");
		}
		System.out.print("+\n");//Prints out one more plus and then makes a new line
	} 
	public static void upArrow(int input) {
		for(int i = 1; i<=input; i++) {//Makes input many lines
			System.out.print("|");//Always prints out one |
			for(int j = 0; j <(input-i); j++) {//Prints out a dot input-times run times
				System.out.print(".");
			}
			for(int x = 0; x<i; x++) {//Prints out /\ the number of time equal to the line it is on
				System.out.print("/\\");
			}
			for(int z = 0; z<((input-i)*2); z++) {//Prints out a dot (input-times run)*2 times
				System.out.print(".");
			}
			for(int x = 0; x<i; x++) {//Prints out /\ the number of time equal to the line it is on
				System.out.print("/\\");
			}
			for(int j = 0; j <(input-i); j++) {//Prints out a dot input-times run times
				System.out.print(".");
			}
			System.out.print("|\n");//Prints out | then makes a new line
		}
	}
	public static void downArrow(int input) {
		for(int i = input; i>0; i--) {//Runs input many times
			System.out.print("|");//Prints out |
			for(int j = 0; j <(input-i); j++) {//Prints out . input -(input-times run) times
				System.out.print(".");
			}
			for(int x = 0; x<i; x++) {//Prints out \/ input-times run times
				System.out.print("\\/");
			}
			for(int z = 0; z<((input-i)*2); z++) {//Prints out .. input -(input-times run) times
				System.out.print(".");
			}
			for(int x = 0; x<i; x++) {//Prints out \/ input-times run times
				System.out.print("\\/");
			}
			for(int j = 0; j <(input-i); j++) {//Prints out . input -(input-times run) times
				System.out.print(".");
			}
			System.out.print("|\n");//Prints out | then makes a new line
		}
	}
}
