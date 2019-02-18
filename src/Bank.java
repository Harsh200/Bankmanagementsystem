import java.util.*;
//This is a main methid for program
public class Bank {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(("Please Enter Name and id"));
        String name=scanner.nextLine();
        String id=scanner.nextLine();

        BankAccount obj=new BankAccount(name,id);
        obj.show();

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
        System.out.println("Welcome:" +customername);
        System.out.println("Your id is :"+customerid);
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
                    System.out.println("*******************************");
                    int amount2=sc.nextInt();
                    withdrawl(amount2);
                    System.out.println("\n");
                    break;

                case 'D':
                    System.out.println("*******************************");
                    getprevioustransaction();;
                    System.out.println("*********************************");
                    System.out.println(("\n"));
                    break;

                case 'E':
                    System.out.println("****************************");
                    break;

                    default:
                        System.out.println("Invalid Option ! Please enter again");
                        break;
            }
        }

        //termination for
        while (option!='E');
        System.out.println("ThankYou for using our services ");
        System.out.println("Please do come again");


    }
}
