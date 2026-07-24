package conditionals;

public class Conditionals {
    public static void main(String[] args) {
        final byte age = 17;
        final byte day = 2;
        final double average = 7.5;

        Conditionals.exampleUseIfElse(age, average);
        Conditionals.exampleUseSwitch(day);
        Conditionals.exampleUseSwitchModern(day);

        String dayName = Conditionals.dictionaryPatternWithSwitch(day);

        System.out.println("Dictionary Pattern: " + dayName);
    }

    private static String dictionaryPatternWithSwitch(byte day) {
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
    }

    // Enhanced Switch Expression
    private static void exampleUseSwitchModern(byte day) {
        switch (day) {
            case 1 -> System.out.println("Monday Modern");
            case 2 -> System.out.println("Tuesday Modern");
            case 3 -> System.out.println("Wednesday Modern");
            default -> System.out.println("Invalid day");
        }
    }

    private static void exampleUseSwitch(byte day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    private static void exampleUseIfElse(byte age, double average) {
        boolean isAdult = age >= 18;
        boolean hasPassingGrade = average >= 9.0;

        if (isAdult && hasPassingGrade) {
            System.out.println("The student meets the requirements.");
        } else if (!isAdult) {
            System.out.println("The student is not an adult.");
        } else {
            System.out.println("The student does not have a passing grade.");
        }
    }
}
