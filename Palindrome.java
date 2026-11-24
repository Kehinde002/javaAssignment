import java.util.Scanner;

public class Palindrome{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.next();
		String reversed = "";
		
		for(int character = 0; character < word.length(); character ++){
			reversed = word.charAt(character) + reversed;
		}
			if(reversed.equals(word)){
				System.out.print("its a palindrome");
			}
			else{
				System.out.print(" its not a palindrome");
			}
		}
	}



