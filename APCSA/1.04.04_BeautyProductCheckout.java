public class BeautyCheckout
{
    public static void main(String[] args)
    {
        double bathSoap = 20.99;
        double lotion = 15.99;
        double chapstick = 5.99;
        double discount = 0.25;

        // Create a variable to store the total before the discount
        double total=bathSoap+lotion+chapstick;
        // Create a variable to store the total amount saved with the discount
        double saved=total*discount;
        // Create a variable to store the total with the discount applied
        double ans=total-saved;
        System.out.println("Thanks for supporting Vivid Beauty!");
        System.out.println("Here is a summary of your purchase:\n");

        // Print out a summary
        System.out.print("Total before discount is applied: ");
        System.out.println(total);
        System.out.print("Amount saved with discount: ");
        System.out.println(saved);
        System.out.print("Total: ");
        System.out.print(ans);
    }
}
