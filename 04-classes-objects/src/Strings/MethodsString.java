package Strings;

public class MethodsString {
    public static void main(String[] args) {
        // length() method
        String text = "Hello, world!";
        System.out.println("Length: " + text.length()); // 12

        // charAt(int index) method
        System.out.println("Character in position 2: " + text.charAt(2)); // 'l'

        // substring(int beginIndex, int endIndex) method
        System.out.println("Subchain: " + text.substring(0, 5)); // "Hello,"

        // toUpperCase() and toLowerCase() methods
        System.out.println("Capital letters: " + text.toUpperCase()); // "HELLO, WORLD!"
        System.out.println("Lowercase: " + text.toLowerCase()); // "hello, world!"

        // equals(Object obj) method
        String text1 = "Hello";
        String text2 = "hello";
        System.out.println("They are the same? " + text1.equals(text2)); // false

        // equalsIgnoreCase(String str) method
        System.out.println("Are they the same (ignoring capitalization)? " + text1.equalsIgnoreCase(text2)); // true

        // contains(CharSequence s) method
        System.out.println("It contains 'world'? " + text.contains("world")); // true

        // replace(char oldChar, char newChar) method
        System.out.println("Replaced: " + text.replace('o', 'a')); // "Hella, warld!"

        // trim() method
        String textWithSpaces = "   Hello, world!   ";
        System.out.println("Trimmed: " + textWithSpaces.trim()); // "Hello, world!"

        // split (String regex) method
        String csvText = "One,Two,Three";
        String[] parts = csvText.split(",");
        String[] parts2 = {"One", "Two", "Three", "Four"};
        System.out.println("Divided:");

        for (String part : parts) {
            System.out.println(part);
        }

        // output:
        // One
        // Two
        // Three
    }
}
