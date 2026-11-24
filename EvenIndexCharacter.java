import java.util.Scanner;

public class EvenIndexCharacter{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		for(int character = 0; character < word.length(); character +=2){
			System.out.print(word.charAt(character));
		}
		
	}
}
