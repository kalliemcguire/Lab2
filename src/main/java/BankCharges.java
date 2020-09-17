
import java.util.Scanner;

public class BankCharges {
    
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the number of checks written this month:");
        int checksWritten = keyboard.nextInt();
        
        double baseFee = 10.00;
        double checkFee = 0.00;
        
        if (checksWritten < 20)
            checkFee = checksWritten * 0.10;
        else if (checksWritten < 40)
            checkFee = checksWritten * 0.08;
        else if (checksWritten < 60)
            checkFee = checksWritten * 0.06;
        else
            checkFee = checksWritten * 0.04;
        
        double totalFees = baseFee + checkFee;
        
        System.out.println("Your total service fee is: " + String.format("%.2f", totalFees));
    }
    
}
