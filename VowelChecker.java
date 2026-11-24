import java.util.Scanner;

public class VowelChecker{
	public static void main(String[] args){
	String  vowel = "AEIOUaeiou";
	int countVowel = 0;
	int countConsonant = 0;
	String seen = "";
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter a word: ");
	String  word = input.next();
	
	for(int character = 0; character <= word.length()-1; character++){
		char letter = word.charAt(character);
		if(seen.indexOf(letter) >= 0){
		continue;
		}
		seen += letter;
		if(vowel.indexOf(letter) >= 0){
		countVowel++;
		}
		else{
		countConsonant++;
		}
	}
	System.out.println("count of vowel : " + countVowel);
	System.out.println("count of consonant : " + countConsonant);
	}
}
