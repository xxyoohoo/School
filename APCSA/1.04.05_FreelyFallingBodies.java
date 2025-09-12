public class FallingBodies
{
    public static void main(String[] args)
    {
        int time=23;
        double h=0.5*9.8*time*time;
        double v=9.8*time;
        System.out.print("The height of the cliff is ");
        System.out.print(h);
        System.out.println(" m.");
        System.out.print("The final velocity of the ball is ");
        System.out.print(v);
        System.out.print(" m/s.");
    }
}
