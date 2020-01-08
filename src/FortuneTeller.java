import java.util.Scanner;
import java.util.Random;
class FortuneTeller {

	public static void main(String args[]) {
	fortuneTeller();
	}
		
	public static void fortuneTeller() {
		Scanner myScanner = new Scanner(System.in);
		Random myRandom = new Random();
		int randomNumber;

		System.out.print("Type your question, my child:  \n");
		
		String input = myScanner.nextLine();
		randomNumber = myRandom.nextInt(10) + 1;
		
		if (randomNumber > 6) {
			System.out.println("My, my, Yes. Isn't it obvious?");
			}
		
		else if (randomNumber <= 6 && randomNumber >= 3) {
		System.out.println("Oh my, No. This is not the case.");
		}
		
		else {
		System.out.println("At the moment, it is unclear.");
		}
		
		System.out.println("Now, would you like to ask another question? Yes or No.");
		
		String nextInput = myScanner.nextLine();
		
		if (nextInput.equals("YES") || nextInput.equals("Yes") || nextInput.equals("yes")){
	        fortuneTeller();
		}
		else if (nextInput.equals("NO") || nextInput.equals("No") || nextInput.equals("no")) {
			System.out.println("Okay my child, take care.");
		}
		else {
	        System.out.println("That's not a valid answer. I shall go for now.");
		}
	}
}