import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double price=2.5;
        System.out.println("What flavor ice cream would you like?");
        String flavor=input.nextLine();
        System.out.println("\nHow many scoops would you like?");
        int num=input.nextInt();
        System.out.println("Order Summary:");
        System.out.print("Flavor: ");
        System.out.println(flavor);
        System.out.print("Number of Scoops: ");
        System.out.println(num);
        System.out.print("Total: ");
        System.out.print(num*price);
    }
}
