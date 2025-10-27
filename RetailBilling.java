import java.util.Scanner;

public class RetailBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Retail Billing System ===");
        System.out.print("Enter Product Name: ");
        String product = sc.nextLine();

        System.out.print("Enter Selling Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Cost Price: ");
        double cost = sc.nextDouble();

        double profit = price - cost;

        System.out.println("Product: " + product);
        System.out.println("Profit: ₹" + profit);
        System.out.println("Thank you for using the DevOps Billing System!");

        sc.close();
    }
}
