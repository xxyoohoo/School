import java.util.Scanner;

public class Banking101
{
    public static void main(String[] args)
    {   
        // Write your code here
        Scanner in = new Scanner(System.in);
        System.out.println("Enter initial balance: ");
        double ini=in.nextDouble();
        System.out.println("Initial balance: $" + ini);
        double interest=1.03;
        double fin=ini*interest;
        System.out.println("Balance after interest: $" + fin);
        System.out.println("Enter deposit amount: ");
        double dep=in.nextDouble();
        fin+=dep;
        fin*=interest;
        System.out.println("Final balance: "+ fin);
        
        
    }
}
