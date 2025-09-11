public class TipCalculator
{
    public static void main(String[] args)
    {
        double meal = 25.99;
        double appetizer = 6.50;
        double drink = 3.99;
        
        // Create variables to store the different tip options
        double tip15=(meal+appetizer+drink)*0.15;
        double tip20=(meal+appetizer+drink)*0.20;
        double tip25=(meal+appetizer+drink)*0.25;
        
        // Print out the total and different amounts for each tip option
        System.out.print("Total cost of the meal: ");
        System.out.println(meal+appetizer+drink);
        System.out.print("15% tip amount: ");
        System.out.println(tip15);
        System.out.print("20% tip amount: ");
        System.out.println(tip20);
        System.out.print("25% tip amount: ");
        System.out.println(tip25);
    }
}
