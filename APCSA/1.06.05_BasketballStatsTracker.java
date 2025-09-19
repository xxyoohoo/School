public class BasketballStatsTracker
{
    public static void main(String[] args)
    {
        int totalPoints = 0;
        int shotsMade = 0;
        int shotsMissed = 0;
        
        int twoPointer = 2;
        int threePointer = 3;
        int freeThrow = 1;
        
        //Makes a two-pointer shot
        totalPoints += twoPointer;
        shotsMade += 1;
        
        //Makes a three-pointer shot
        totalPoints += threePointer;
        shotsMade += 1;
        
        //Misses a shot
        shotsMissed += 1;
        
        //Makes two free throws
        totalPoints += freeThrow;
        totalPoints += freeThrow;
        shotsMade += 2;
        
        //Misses a shot
        shotsMissed += 1;
        
        System.out.print("Total points scored: ");
        System.out.println(totalPoints);
        System.out.print("Total shots attempted: ");
        System.out.println(shotsMade);
    }
}
