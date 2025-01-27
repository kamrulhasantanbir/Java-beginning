import javax.swing.JOptionPane;

public class Gui_3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String age_s = JOptionPane.showInputDialog("How old are you?");
        int age = Integer.parseInt(age_s);
        String height_s = JOptionPane.showInputDialog("What is your height in inches?");
        double height = Double.parseDouble(height_s);

        JOptionPane.showMessageDialog(null, "Your name is: " + name);
        JOptionPane.showMessageDialog(null, "Your age is: " + age + " years old.");
        JOptionPane.showMessageDialog(null, "Your height is: " + height + " inches.");

        JOptionPane.showMessageDialog(null, "Thank you for using the program!");
    }
}
