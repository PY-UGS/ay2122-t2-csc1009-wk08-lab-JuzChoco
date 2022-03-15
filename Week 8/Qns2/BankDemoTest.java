package Qns2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.lang.*;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat dF = new DecimalFormat("0.00");

        System.out.println("Please enter your deposit amount: "); //Get deposit input
        double deposit = sc.nextDouble();

        CheckingAccount checkingAccount = new CheckingAccount(10000, "123456789"); //Create a new checkingAccount() object

        checkingAccount.deposit(deposit); //Deposits amount into balance of current user

        try {
            System.out.println("Please enter the amount you wish to withdraw "); 
            double withdrawalAmount = sc.nextDouble();
            checkingAccount.withdraw(withdrawalAmount); //Utilises the withdraw() method of the checkingAccount class
            System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance()); //Prints the balance after withdrawal is successful

        } catch (InsufficientFundsException e) { //Exception thrown if balance < withdraw amount
            System.out.println("Sorry, but your account is short by: $" + dF.format(Math.abs((checkingAccount.getBalance() - e.getAmount())))); //Uses abs value to print out the value of the missing amount
        }

        sc.close();
    }
}
