public class HomeworkTime
{
    public static void main(String[] args)
    {
        int hours = 2;
        int minutes = 30;
        int seconds = 45;
        
        // Add your code here
        int totalSeconds;
        hours*=60;
        minutes+=hours;
        minutes*=60;
        seconds+=minutes;
        totalSeconds=seconds;
        System.out.println(totalSeconds);
        
    }
}
