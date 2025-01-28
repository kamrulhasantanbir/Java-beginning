import java.util.Random;

public class RandomValues_5 {
    public static void main(String[] args) {
        Random rand = new Random();

        int intNoLimit = rand.nextInt();
        int intOneLimit = rand.nextInt(100);
        int intRangeLimit = rand.nextInt(51) + 50;

        long longNoLimit = rand.nextLong();
        long longOneLimit = Math.abs(rand.nextLong()) % 100;
        long longRangeLimit = Math.abs(rand.nextLong()) % (50) + 50;

        float floatNoLimit = rand.nextFloat();
        float floatOneLimit = rand.nextFloat() * 100;
        float floatRangeLimit = rand.nextFloat() * (50) + 50;

        double doubleNoLimit = rand.nextDouble();
        double doubleOneLimit = rand.nextDouble() * 100;
        double doubleRangeLimit = rand.nextDouble() * (50) + 50;

        boolean boolVal = rand.nextBoolean();

        System.out.println("Integer (No Limit): " + intNoLimit);
        System.out.println("Integer (One Limit 0-99): " + intOneLimit);
        System.out.println("Integer (Range 50-100): " + intRangeLimit);

        System.out.println("Long (No Limit): " + longNoLimit);
        System.out.println("Long (One Limit 0-99): " + longOneLimit);
        System.out.println("Long (Range 50-100): " + longRangeLimit);

        System.out.println("Float (No Limit 0.0-1.0): " + floatNoLimit);
        System.out.println("Float (One Limit 0.0-100.0): " + floatOneLimit);
        System.out.println("Float (Range 50.0-100.0): " + floatRangeLimit);

        System.out.println("Double (No Limit 0.0-1.0): " + doubleNoLimit);
        System.out.println("Double (One Limit 0.0-100.0): " + doubleOneLimit);
        System.out.println("Double (Range 50.0-100.0): " + doubleRangeLimit);

        System.out.println("Boolean Value : " + boolVal);
    }
}
