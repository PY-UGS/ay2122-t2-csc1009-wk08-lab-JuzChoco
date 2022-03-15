package Qns2;
public class CheckingAccount {

        private double balance;
        private String accountNumber;

        //Constructor for this class
        public CheckingAccount(double balance, String accountNumber){
            this.balance = balance;
            this.accountNumber = accountNumber;
        }
    
        public double getBalance(){
            return this.balance;
        }
    
        public String getNumber(){
            return this.accountNumber;
        }
    
        public void deposit(double amount){
            balance += amount;
        }
        
        //withdraw() method that throws an exception if amount intended to be withdrawn > current balance 
        public void withdraw(double amount) throws InsufficientFundsException {
            if (amount > this.getBalance()) { 
                throw new InsufficientFundsException(amount);
            }
            else {
                balance -= amount; //If balanace > amount intended to be withdrawn then amount gets deducted from balance
            }
    
        }
    
    
}
