import java.util.Scanner;

public class TestScoresandGrade {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter your first test score:");
        double testScoreOne = keyboard.nextDouble();
        
        System.out.println("Please enter your second test score:");
        double testScoreTwo = keyboard.nextDouble();
        
        System.out.println("Please enter your third test score:");
        double testScoreThree = keyboard.nextDouble();

        double testAverage = (testScoreOne + testScoreTwo + testScoreThree) / 3;
        
        System.out.println("Your average test score was: " + testAverage);
        
        if (testAverage < 60)
            System.out.println("Your average grade was an F.");
        else if (testAverage < 70)
            System.out.println("Your average grade was a D.");
        else if (testAverage < 80)
            System.out.println("Your average grade was a C.");
        else if (testAverage < 90)
            System.out.println("Your average grade was a B.");
        else
            System.out.println("Your average grade was an A.");
    }
}
    

