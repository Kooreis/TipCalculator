```java
import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the bill amount: ");
        double bill = scanner.nextDouble();
        System.out.println("Enter the tip percentage: ");
        double tipPercentage = scanner.nextDouble();
        double tip = bill * (tipPercentage / 100);
        double total = bill + tip;
        System.out.println("The tip amount is: " + tip);
        System.out.println("The total bill amount is: " + total);
    }
}
```