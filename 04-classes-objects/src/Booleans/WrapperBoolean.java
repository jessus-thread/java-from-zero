package Booleans;

public class WrapperBoolean {
      public static void main(String[] args) {
        boolean value = Boolean.parseBoolean("true"); // value = true
        Boolean wrapper = Boolean.valueOf("true"); // wrapper = true (as Boolean)
        String text = Boolean.toString(true); // text = "true"
        boolean result = Boolean.logicalAnd(true, false); // result = false
        boolean result2 = Boolean.logicalOr(true, false); // result = true

        System.out.println("The value of 'value' is: " + value);
        System.out.println("The value of 'wrapper' is: " + wrapper);
        System.out.println("The value of 'text' is: " + text);
        System.out.println("The result of 'Boolean.logicalAnd(true, false)' is: " + result);
        System.out.println("The result of 'Boolean.logicalOr(true, false)' is: " + result2);
    }
}
