import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter movie rating (as a decimal)");
        double x=input.nextDouble();
        int ans=(int)(x+0.5);
        System.out.print("Rating rounded: " + ans);
       
    }
}
