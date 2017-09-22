import java.util.Scanner;

import javax.swing.JOptionPane;

public class Collatz {
	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(System.getProperty("line.separator"));
		
		String descision;
		
		int n;
		int z;
		int redo = 0;
		
		explain("We're going to explore the Collatz Conjecture!");
		sleep(2000);
		explain("The Collatz Conjecture is very simple to state, but has never been solved.");
		sleep(3000);
		explain("You can start with any whole number (yes! any whole number!) and follow a simple procedure:");
		sleep(4000);
		explain("If your number is even, simply divide it by 2.");
		sleep(2000);
		explain("If your number is odd, multiply it by 3 and add 1.");
		sleep(3000);
		explain("You keep repeating this procedure for each number you get.");
		sleep(3000);
		explain("The conjecture says that no matter what number you pick, if you do this process for long enough, \nyou will always get back to 1. ");
		sleep(5000);
		explain("Let's try it out!");
		sleep(2000); 
		
		do {
		int count = 0;
		System.out.print("Do you want a 'random' number or do you want to 'choose' a number? ");
		descision = keyboard.next();
			if ((descision.equals("random"))||(descision.equals("r"))||(descision.equals("Random"))||(descision.equals("rand"))||(descision.equals(" random"))||(descision.equals(" r"))) {
				explain("Alright, we'll go with a random number for now.");
					n = (int) ((Math.random() * 10000) + 5);
					z = n;
				sleep(1000);
				explain("The computer chose " + n + ".");
				sleep(1000);
				explain("Now the computer will execute the Collatz Algorithm.");
				sleep(1000);
				explain("n = " + n);
				do {
					if (n%2 == 0) {
						n = n/2;
						explain("n = " + n);
					} else {
						n = (3*n) + 1;
						explain("n = " + n);
					}
						sleep(50);
						
					count ++;
				} while (n != 1);
				explain("It took " + count + " steps to get to 1 from " + z + "!");
			} else {
				System.out.print("Choose a number! ");
				n = keyboard.nextInt();
				z = n;
				sleep(1000);
				explain("Now the computer will execute the Collatz Algorithm.");
				sleep(1000);
				explain("n = " + n);
				do {
					if (n%2 == 0) {
						n = n/2;
						explain("n = " + n);
					} else {
						n = (3*n) + 1;
						explain("n = " + n);
					}
						sleep(50);
					count ++;
				} while (n != 1);
				explain("It took " + count + " steps to get to 1 from " + z + "!");
			}
			
		System.out.print("Play Again? ");
		String PlayAgain = keyboard.next();
			if ((PlayAgain.equals("no"))||(PlayAgain.equals("n"))||(PlayAgain.equals("No"))||(PlayAgain.equals(" no"))||(PlayAgain.equals("nah"))) {
				redo = 1;
			} else {
				redo = 0 ; 
			}
	
		} while (redo == 0);
		
	explain("Understandable, have a nice day");
		
	}
	private static void explain(String explanation) {
		System.out.println(explanation);
		
	}

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
	

}
