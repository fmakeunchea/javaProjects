package chapter3;

import java.util.Scanner;

public class AccountTest
{
    public static void main(String[] args) {

        //create an account object and assign it  to myAccount
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        //display initial value of name for each Account
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance() );
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance() );

        //create a Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: " ); //prompt
        double depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("%nAdding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount); //add to account1 balance

        //display balances
        System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter deposit amount for account2: " ); //prompt
        depositAmount = input.nextDouble(); //obtain user input
        System.out.printf("%nAdding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount); //add to account2 balance

        //display balances
        System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());
    }
}
