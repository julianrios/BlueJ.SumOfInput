/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args){
        sumOfTheNums();
    }

    public static void sumOfTheNums() {
    
    boolean quit = false;
    int sum = 0;
    // ask for input
    while(!quit) {
        System.out.println("Please enter a number");
            
        if(scanner.hasNextInt()) {
        // put into scanner
        int number = scanner.nextInt();
        // int number = scanner.nextInt();  
        // loop to n and add all the numbers up to n
    for (int i=1; i <= number; i++) {
                sum += i;
    }
    System.out.printf("The sum of 1 to %d is %d", number, sum); 
    quit = true;
        }
    }           
  }  
}
