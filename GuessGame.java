import java.util.Random;
import java.util.Scanner;

public class GuessGame{
	public static void main(String[] args){

	Scanner input = new Scanner(System.in);



	Random rand = new Random();
	int secretNumber = rand.nextInt(100) +1 ;

	int count = 0;
	int guess = 0;

	while  (guess != secretNumber){
		System.out.print("Guess a number (1-100): ");
		guess = input.nextInt();
		count++;
	
	}	
	System.out.print("Finally got it right after " + count + " attempt");
	}
}
