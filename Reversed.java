import java.util.Scanner;

public class Reversed{
	public static void main(String[] args){
		System.out.print("Enter a word: ");
		String word = input.next();
		String reversed = "";
		
		for(int character = 0; character < word.length(); character ++){
			reversed = word.charAt(character) + reversed;
		}
		System.out.print(reversed);
	}
}
