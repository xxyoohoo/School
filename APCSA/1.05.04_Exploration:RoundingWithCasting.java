public class RoundingWithCasting
{
    public static void main(String[] args)
    {
        double value1 = 10.0;
        double value2 = 10.3;
        double value3 = 10.8;
        
        int rounded1 = (int) (value1 + 0.5);
        int rounded2 = (int) (value2 + 0.5);
        int rounded3 = (int) (value3 + 0.5);
        
        System.out.print(value1);
        System.out.print(" rounded = ");
        System.out.println(rounded1);
        
        System.out.print(value2);
        System.out.print(" rounded = ");
        System.out.println(rounded2);
        
        System.out.print(value3);
        System.out.print(" rounded = ");
        System.out.println(rounded3);
        
        double value4 = -2.1;
        int rounded4 = (int) (value4-0.5);
        System.out.println(rounded4);
    }
}
