package BasicAlgorithms;

import java.util.Random;
import java.util.Scanner;

//This notebook simulates a classic game where you have to guess a random number 
//from within a certain range. Typically, you might have to guess a number from
//1 to 10, and have three guesses to get the right answer.\n",

//In this case, you'll need to guess a random number between 1 and 100, and you
//will have 7 tries.\n",

//Try running it and playing a round or two. Notice that the game always tells 
//you whether your guess was too high or too low. This information allows you to 
//rule out some of the numbers (so that you don't waste time guessing those
//numbers).\n",

//"With this fact in mind, try to make your guesses in the most efficient way you can. Specifically, 
//try to make guesses that rule out the largest number of possibilities each time."




public class Tries {
	
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		guess_the_number( 7, 1, 100);
	
	}

	 private static void guess_the_number(int total_tries, int start, int end) {
		
	 Random random = new Random();
	 int random_number = random.nextInt(100-1)+1;
	 int attempt;
	 
	 String  success_message = "Awesome! You guessed correctly";
	 String  failure_message = "Sorry! No more retries left";
	 String  miss_message   = "Oops! That's incorrect";
				
	 int num_tries=0;
	 
		while (num_tries < total_tries) {

			System.out.println("Guess a number: ");
			attempt = scanner.nextInt();

			if (attempt == random_number) {
				System.out.println(success_message);
				return;
			}

			System.out.println(miss_message);
			
			if (attempt < random_number) {
				System.out.println("Go higher!");
			} else {
				System.out.println("Go lower!");
			}
		}
		
		num_tries ++;
		System.out.println(failure_message);
 
	}

	static int checkUserChoise(int random, int choose) {
		 
		 if(choose>random) return 1; 
		 if(choose<random) return -1;;

		 return 0;

	}

	
	
	public static int guessAnumber() {
		
		System.out.println("Guess a number: ");
		 int num = scanner.nextInt();
		
		
		return num;
	}


}





