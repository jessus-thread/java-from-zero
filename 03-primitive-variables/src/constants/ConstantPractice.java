package constants;

public class ConstantPractice {
    public static void main(String[] args) {
        final double TAX_RATE = 0.10;
        int grossSalary = 100000;
        double netSalary = grossSalary * ( 1 - TAX_RATE );

        System.out.println("netSalary = " + netSalary);
    }
}
