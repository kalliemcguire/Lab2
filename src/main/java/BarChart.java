import java.util.Scanner;

public class BarChart {
   
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter today's sales for store 1: ");
        int storeOneSales = keyboard.nextInt();
        int storeOneAsterisks = storeOneSales / 100;
        
        System.out.println("Enter today's sales for store 2: ");
        int storeTwoSales = keyboard.nextInt();
        int storeTwoAsterisks = storeTwoSales / 100;
        
        System.out.println("Enter today's sales for store 3: ");
        int storeThreeSales = keyboard.nextInt();
        int storeThreeAsterisks = storeThreeSales / 100;
        
        System.out.println("Enter today's sales for store 4: ");
        int storeFourSales = keyboard.nextInt();
        int storeFourAsterisks = storeFourSales / 100;
        
        System.out.println("Enter today's sales for store 5: ");
        int storeFiveSales = keyboard.nextInt();
        int storeFiveAsterisks = storeFiveSales / 100;
        
        System.out.println("\n");
        System.out.println("Sales Bar Chart: \n");
        
        System.out.print("Store 1:");
        for (int i = 1; i <= storeOneAsterisks; i++) {
        System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Store 2:");
        for (int i = 1; i <= storeTwoAsterisks; i++) {
        System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Store 3:");
        for (int i = 1; i <= storeThreeAsterisks; i++) {
        System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Store 4:");
        for (int i = 1; i <= storeFourAsterisks; i++) {
        System.out.print("*");
        }
        System.out.println("\n");
        
        System.out.print("Store 5:");
        for (int i = 1; i <= storeFiveAsterisks; i++) {
        System.out.print("*");
        }
    }
}