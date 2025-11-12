import java.util.Scanner;
class Account{
 private int accountNumber;
 double balance =0;
 Account(int accountNumber){
     this.accountNumber=accountNumber;
 }
 public int getAccountNumber(){
     return accountNumber;
 }
 public void setAccountNumber(int accountNumber){
     this.accountNumber=accountNumber;
 }


 public void deposit(Scanner sc) {
     System.out.println("How much money do you want to deposit ");
     double moneyDeposit = sc.nextDouble();
     if (moneyDeposit > 0) {
         balance += moneyDeposit;
         System.out.println("Successfully Deposited");
         System.out.println("Your balance: "+balance);
     }else {
         System.out.println("Enter valid amount");
     }
 }

 public void withdraw(Scanner sc){
     System.out.println("How much money do you want to withdraw");
     double withdrawMoney=sc.nextDouble();
     if(balance >= withdrawMoney){
         balance-=withdrawMoney;
         System.out.println("Successfully withdrawn");
         System.out.println("Your new balance: "+balance);
     }
     else {
         System.out.println("Insufficient balance");
     }
 }
 public void checkBalance(){
     System.out.println("Balance :"+ balance);
 }
}
public class BankAccountSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter account number");
        int accountNumber = sc.nextInt();
        Account account = new Account(accountNumber);
        while (true) {
            System.out.println("What you want to do :");
            System.out.println("1 : Check Balance:");
            System.out.println("2 : Deposit money:");
            System.out.println("3: Withdraw money");
            System.out.println("4: Exit");
            int option= sc.nextInt();
            switch (option){
                case 1 :
                    account.checkBalance();
                    break;
                case 2:
                    account.deposit(sc);
                    break;
                case 3 :
                    account.withdraw(sc);
                    break;
                case 4:
                    System.out.println("Thank you for using");
                    return;
                default:
                    System.out.println("Invalid choice");
            }


        }

    }
}

