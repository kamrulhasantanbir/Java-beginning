import java.util.Scanner;
public class Input_Output_2 {
    public static void main(String[] args) {
       Scanner cin = new Scanner (System.in);
       String name , address;
       int age ;
       double res;
       System.out.println("What is your name :");
       name = cin.nextLine();
       System.out.println("How old are you :");
       age = cin.nextInt();
       cin.nextLine();
       System.out.println("Where do you live :");
       address = cin.nextLine();
       System.out.println("What is your current CGPA :");
       res = cin.nextDouble();

      System.out.println("Hello " + name + "!");
      System.out.println("You are " + age + " years old !");
      System.out.println("You live in " + address);
      System.out.println("Your current CGPA is :" + res);

     cin.close();
    }
}
