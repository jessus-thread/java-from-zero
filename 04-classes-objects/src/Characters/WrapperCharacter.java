package Characters;

public class WrapperCharacter {
    public static void main(String[] args) {
        boolean isLetter = Character.isLetter('A'); // isLetter = true
        boolean isDigit = Character.isDigit('5'); // isDigit = true
        boolean isWhiteSpace = Character.isWhitespace(' '); // isWhiteSpace = true
        char upperText = Character.toUpperCase('a'); // upperText = 'A'
        char lowerText = Character.toLowerCase('A'); // lowerText = 'a'

        System.out.println("It's a letter: " + isLetter);
        System.out.println("It's a digit: " + isDigit);
        System.out.println("It's space: " + isWhiteSpace);
        System.out.println("capital letter: " + upperText);
        System.out.println("Lower case: " + lowerText);
    }
}
