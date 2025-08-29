import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter mark:");

        try {
            int mark = Integer.parseInt(input);

            // Call logic and get result
            String result = CheckPassFailSwitch.check(mark);

            // Show result in GUI
            JOptionPane.showMessageDialog(null, result);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!");
        }
    }
}
