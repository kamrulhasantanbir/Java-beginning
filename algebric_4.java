import java.lang.Math;

public class algebric_4 {
    public static void main(String[] args) {

        int a = 15, b = -4;
        double x = 15.75, y = 4.33;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int intDivision = a / b;
        int modulus = a % b;
        double floatDivision = x / y;


        int addAssign = a;
        addAssign += b;

        int subAssign = a;
        subAssign -= b;

        int modAssign = a;
        modAssign %= b;

        int mulAssign = a;
        mulAssign *= b;

        int divAssign = a;
        divAssign /= b;


        int postIncrement = a++;
        int preIncrement = ++a;
        int postDecrement = a--;
        int preDecrement = --a;


        int maxVal = Math.max(a, b);
        double minVal = Math.min(x, y);
        double ceilVal = Math.ceil(x);
        double floorVal = Math.floor(x);
        long roundVal = Math.round(x);
        double sqrtVal = Math.sqrt(a);
        int absVal = Math.abs(b);
        double powerVal = Math.pow(a, -b);
        double logVal = Math.log(a);
        double log10Val = Math.log10(100);
        double sinVal = Math.sin(Math.toRadians(30));
        double cosVal = Math.cos(Math.toRadians(60));


        System.out.println("Basic Arithmetic Operations:");
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        System.out.println("Integer Division = " + intDivision);
        System.out.println("Modulus = " + modulus);
        System.out.println("Floating-point Division = " + floatDivision);

        System.out.println("\nCompound Assignment Operations:");
        System.out.println("Addition Assignment (+=) = " + addAssign);
        System.out.println("Subtraction Assignment (-=) = " + subAssign);
        System.out.println("Modulus Assignment (%=) = " + modAssign);
        System.out.println("Multiplication Assignment (*=) = " + mulAssign);
        System.out.println("Division Assignment (/=) = " + divAssign);

        System.out.println("\nIncrement and Decrement Operations:");
        System.out.println("Post-Increment = " + postIncrement);
        System.out.println("Pre-Increment = " + preIncrement);
        System.out.println("Post-Decrement = " + postDecrement);
        System.out.println("Pre-Decrement = " + preDecrement);

        System.out.println("\nMath Class Functions:");
        System.out.println("Max Value = " + maxVal);
        System.out.println("Min Value = " + minVal);
        System.out.println("Ceiling Value = " + ceilVal);
        System.out.println("Floor Value = " + floorVal);
        System.out.println("Round Value = " + roundVal);
        System.out.println("Square Root = " + sqrtVal);
        System.out.println("Absolute Value = " + absVal);
        System.out.println("Power Value (a^b) = " + powerVal);
        System.out.println("Natural Log of a = " + logVal);
        System.out.println("Base-10 Log of 100 = " + log10Val);
        System.out.println("Sine of 30 degrees = " + sinVal);
        System.out.println("Cosine of 60 degrees = " + cosVal);
    }
}

