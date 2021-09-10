import java.util.Arrays;

public class ExerciseTwo {
	public static void main(String[] args) {
		char[] alphabet = getAlphabetArray();
		
		System.out.println(Arrays.toString(alphabet));
	}
	
	public static char[] getAlphabetArray() {
		char[] alphabet = new char[26];
		char letter = 'a';
		int index = 0;
		
		do {
			alphabet[index] = letter;
			index++;
			letter++;
		}
		while (index < alphabet.length && letter <= 'z');
		
		return alphabet;
	}
}