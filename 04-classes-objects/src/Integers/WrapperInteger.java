package Integers;

public class WrapperInteger {

    public static void main(String[] args) {
        // Examples with Integer
        int number = Integer.parseInt("123"); // number = 123
        Integer wrapper = Integer.valueOf("123"); // wrapper = 123 (as Integer)
        String text = Integer.toString(123); // text = "123"
        int result = Integer.compare(10, 20); // resulte = -1 (because 10 < 20)
        int max = Integer.max(10, 20); // max = 20
        int min = Integer.min(10, 20); // min = 10

        // Examples with Byte
        byte number2 = Byte.parseByte("127"); // number = 127
        Byte wrapper2 = Byte.valueOf("127"); // wrapper = 127 (as Byte)
        String text2 = Byte.toString((byte) 127); // text = "127"

        // Examples with Short
        short number3 = Short.parseShort("32000"); // number = 32000
        Short wrapper3 = Short.valueOf("32000"); // wrapper = 32000 (as Short)
        String text3 = Short.toString((short) 32000); // text = "32000"

        // Examples with Long
        long number4 = Long.parseLong("123456789"); // number = 123456789
        Long wrapper4 = Long.valueOf("123456789"); // wrapper = 123456789 (as Long)
        String text4 = Long.toString(123456789L); // text = "123456789"

        System.out.println("The value of 'number' is: " + number);
        System.out.println("The value of 'wrapper' is: " + wrapper);
        System.out.println("The value of 'text' is: " + text);
        System.out.println("The value of 'Integer.compare(10, 20)' is: " + result);
        System.out.println("The value of 'max' is: " + max);
        System.out.println("The value of 'min' is: " + min);
        System.out.println("The value of 'number2' is: " + number2);
        System.out.println("The value of 'wrapper2' is: " + wrapper2);
        System.out.println("The value of 'text2' is: " + text2);
        System.out.println("The value of 'number3' is: " + number3);
        System.out.println("The value of 'wrapper3' is: " + wrapper3);
        System.out.println("The value of 'text3' is: " + text3);
        System.out.println("The value of 'number4' is: " + number4);
        System.out.println("The value of 'wrapper4' is: " + wrapper4);
        System.out.println("The value of 'text4' is: " + text4);
    }

}