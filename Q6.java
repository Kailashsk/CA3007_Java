import java.util.Scanner;  
class Account1 {  
     int account_number;  
     String name;  
     String address;  
     int balance;  
    Scanner sc = new Scanner(System.in);  

    Account1(int ac_no,String n,String add,int bal)
    {
        account_number=ac_no;
        name=n;
        address=add;
        balance=bal;
    }
    public void summery_display() {  
        System.out.println("Name of account holder: " + name);  
        System.out.println("Account no.: " + account_number);  
        System.out.println("Address: " + address);  
        System.out.println("Balance: " + balance);  
    }  

    public void deposit() {  
        int amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextInt();  
        balance = balance + amt;  
    }  

    public void withdraw() {  
        int amt;  
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextInt();  
        if (balance >= amt) {  
            balance = balance - amt;  
            System.out.println("Balance after withdrawal: " + balance);  
        } else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  

}  
public class Account {  
    public static void main(String arg[]) {  
        Scanner sc = new Scanner(System.in);  
 
        System.out.println("Enter the Account_no");
        int a_no=sc.nextInt();

        System.out.println("Enter a name");
        String n=sc.next();

        System.out.println("Enter the address");
        String add=sc.next();

        System.out.println("Enter the balance");
        int bal=sc.nextInt();

        Account1 ac = new Account1(a_no, n, add, bal); 
       // ac.summery_display();
 
        int ch;  
        do {  
            System.out.println("\n ***Banking System Application***");  
            System.out.println("1. Summary Display \n 2. Deposit\n 3. Withdraw \n 4.Exit ");  
            System.out.println("Enter your choice: ");  
            ch = sc.nextInt();  
                switch (ch) {  
                    case 1:  
                        ac.summery_display();
                        break;  
                    case 2:  
                        ac.deposit(); 
                        break;  
                    case 3:  
                        ac.withdraw();
                        break;  
                    case 4:  
                        System.out.println("See you soon...");  
                        break;  
                }  
            }  
            while (ch != 4);  

            
        }  
    }  


    //@Ks
