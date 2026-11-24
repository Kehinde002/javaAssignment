public class NumberSquares{
	public static void main(String[] args){
		for(int digitOne = 1; digitOne <= 9; digitOne++){
			for(int digitTwo = 0; digitTwo <= 9; digitTwo++){
				for(int digitThree = 0; digitThree <= 9; digitThree++){
					int digitOneSquare = digitOne * digitOne;
					int digitTwoSquare = digitTwo * digitTwo;
					int digitThreeSquare = digitThree * digitThree;
					int sumDigitSquare =digitOneSquare + digitTwoSquare + digitThreeSquare;
					int hundred = 100 * digitOne;
					int tenth = 10 * digitTwo;
					int unit = digitThree;
					int number = hundred + tenth + unit;
					if (sumDigitSquare == number){
						System.out.print(number);
					}
				}
			}
		}
	}
}
