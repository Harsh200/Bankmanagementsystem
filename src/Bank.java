import java.util.*;
public class Bank {
    public static void main(String[] args) {

    }
}
class BankAccount{
    int balance;
    int previoustransaction;
    String customername;
    String customerid;
    BankAccount(String cname,String cid){
        customername=cname;
        customerid=cid;
    }
     // now we are creating deposit method

    void deposit(int amount){
        if(amount!=0){
            balance=balance+amount;
            previoustransaction=amount;
        }
    }
    // for withdrawing the amount and we indicate - sign for mention deducting amount
    void withdrawl(int amount){
        if(amount!=0){
            balance=balance-amount;
            previoustransaction=-amount;
        }
    }
    //this getprevioustransaction method is for knowing the previous amount we have in our account.
    void getprevioustransaction(){
        if(previoustransaction > 0){
            System.out.println("deposited:" +previoustransaction);
        }
        else if(previoustransaction < 0){
            System.out.println("withdrawl:"+ Math.abs(previoustransaction));
        }
        else {
            System.out.println(("NO transaction occured"));
        }
    }

    void show(){
        char option='\0';
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome" +customername);
        System.out.println("Your id is"+customerid);
        System.out.println(("\n"));
        System.out.println("A.Check Balance");
        System.out.println("B.Deposit");
        System.out.println("C.Withdrawl");
        System.out.println("D. previous Transaction");
        System.out.println(" E.Exit");


        do{
            System.out.println(" **************************************** ");
            System.out.println("Enter an option");
            System.out.println(" *********************  ");
            option=sc.next().charAt(0);
            System.out.println("\n");
            switch (option){
                case 'A':
                    System.out.println("*********************");
                    System.out.println("Balance =" +balance);
                    System.out.println("*************************");
                    System.out.println("\n");
                    break;


                case 'B':
                    System.out.println("******************************");
                    System.out.println("Enter an amount to deposit");
                    System.out.println("************************");
                    int amount=sc.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("***********************");
                    System.out.println("Enter an amount to withdraw");
                    System.out.println();
            }

        }

    }
}
