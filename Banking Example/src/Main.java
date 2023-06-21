import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Good Evening Sir/Madam. Please Enter Your Name");
        String username;
        int Accountbalance = 15000;
        Scanner scanner = new Scanner(System.in);
        username = scanner.next();
        System.out.println("Hello" + username + " Welcome to XYZ ATM");
        System.out.println("1.Deposit 2.Withdraw 3.Transfer 4.Account balance 5.I'm Finished");
        int options= scanner.nextInt();



        switch (options){
            case 1 :
                int addOnAmount = scanner.nextInt();
                System.out.println("Enter the amount that you wanted to deposit ");
                Accountbalance = Accountbalance+addOnAmount;
                System.out.println("You have Deposited = "+addOnAmount+" Now your Total Balance is ="+Accountbalance);
                break;
            case 2 :
                int withdraw = scanner.nextInt();
                System.out.println("Enter the Withdrawal Amount");
                Accountbalance = Accountbalance-withdraw;
                System.out.println("You have withdraw ="+withdraw+"You have Total Balance is="+Accountbalance);
                break;
            case 3 :
                int Transfer = scanner.nextInt();
                Accountbalance = Accountbalance-Transfer;
                System.out.println("you have Transfered ="+Transfer+"And Now You Have Total Balance is="+Accountbalance);
                break;
            case 4 :
                System.out.println("You Have Total Balance is ="+Accountbalance);
                break;
            case 5:
                System.out.println("I'm Finished");
                break;
            default:
                System.out.println("You have Entered Invalid Option");
                break;
        }
    }
}