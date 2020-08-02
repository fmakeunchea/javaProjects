package chapter3;

import javax.swing.*;

public class NameDialog
{
    public static void main(String[] args) {
        // prompt the user to enter name
        String name = JOptionPane.showInputDialog("What is your name:");

        //create the message
        String message = String.format("Welcome , %s, to Java Programming!", name);

        //display the message to welcome the user by name
        JOptionPane.showMessageDialog(null, message);
    }
}
