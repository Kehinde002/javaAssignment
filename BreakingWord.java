import java.util.Scanner;

public class BreakingWord{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String  word = input.nextLine();
	
	for(int character = 0; character <= word.length()-1; character++){
		char letter = word.charAt(character);
		if(letter == ' '){
			System.out.println();
		}
		else{
			System.out.print(letter);
		}
	}

	}

