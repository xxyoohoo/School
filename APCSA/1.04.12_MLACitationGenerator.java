import java.util.Scanner;

public class Citation
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the author's name as 'Last name, First name':");
        String name = input.nextLine();
        System.out.println("Enter the year the book was published:");
        int year = input.nextInt();
        System.out.println("Enter the title of the book:");
        input.nextLine();
        String title = input.nextLine();
        System.out.println("Enter the publisher of the book:");
        String pub = input.nextLine();
        System.out.println();
        System.out.print(name + ". " + title + "." + pub + ", " + year + ".");
    }
}
