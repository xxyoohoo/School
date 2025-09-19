import java.util.Scanner;

public class PhotoWallPlanner
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the height of each picture?");
        int h=input.nextInt();
        int wall=8*12;
        double part=wall/(double) h;
        int comp=wall/h;
        int left=wall-(comp*h);
        System.out.println("Total rows (including partial rows): "+part);
        System.out.println("Complete rows: "+comp);
        System.out.println("Inches Leftover: "+left);
    }
}
