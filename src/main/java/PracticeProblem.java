public class PracticeProblem {
	//Create a function called lettersToFive that takes a String and a character as parameters.
	//Using a while loop, output how many letters into the word it takes to find 5 instances of the character.
	//If there are no instances of the character, return -1.	
	//Examples:
	//lettersToFive("hello lillian", 'l')
	//returns: 10
	//countLetter("Whatever", 'e')
	//returns: -1
	
	public static int lettersToFive(String word, char check) {
		int loopcounter = 0;
		int lettercounter = 0;
		while (loopcounter < word.length()) {
			if (word.charAt(loopcounter) == check) {
				lettercounter++;
			} 
			loopcounter++;
			if (lettercounter == 5) { 
				return loopcounter;
			}
		}
		return -1;

	}
	
	//Create a function called countLetter which takes in a String and a character.
	//Return the amount of occurances of the character in the String.
	//Examples:
	//countLetter("hello", 'l')
	//returns: 2
	//countLetter("I don't know", 'e')
	//returns: 0
	
	public static int countLetter(String word, char check) {
		int loopcounter = 0;
		int lettercounter = 0;
		while (loopcounter < word.length()) {
			if (word.charAt(loopcounter) == check) {
				lettercounter++;
			} 
			loopcounter++;
		}
		return lettercounter;

	}
	
	//Create a function called oddSum which takes in two integers as parameters. returns the sum of all odd integers between the two numbers inclusively. Order of the integers does not matter
	//Examples:
	//oddSum(2, 6)
	//returns: 8
	//Explanation: 3+5 = 8
	//oddSum(0, 10)
	//returns 25
	//Explanation: 1+3+5+7+9 = 25
	//oddSum(9, 2)
	//returns 24
	//Explanation: 3+5+7+9 = 24
	public static int oddSum(int num3, int num4) {
		int sum = 0;
		int num1 = Math.min(num4, num3);
		int num2 = Math.max(num4, num3);
		while (num1 <= num2) {
			if (num1 % 2 != 0) {
				sum += num1;
			} 
			num1++;
		}
		return sum;

	}
}
