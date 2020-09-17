
import java.util.Scanner;

public class SumOfNumbers {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int numberSum = 0;
        int numberEntered = 0;
        
        System.out.println("Please enter a positive, non-zero number: ");
        numberEntered = keyboard.nextInt();
        
        while (numberEntered <= 0) {
            System.out.println("Please enter a positive, non-zero number: ");
            numberEntered = keyboard.nextInt();
        }
        
        for (int i = 1; i <= numberEntered; i++) {
            numberSum = numberSum + i;
        }
       
        System.out.println("The total is: " + numberSum);
    }
    
}
