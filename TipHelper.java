// Arman Chandani, I am Pakistani.
public class TipHelper{
public static void main(String[] args) {
        float tipPercentage = 0.15f;
        float mealTotal = 20.17f;
        int numberItemsOrdered = 3;
        String customerName = "Jacob" ;
        float totalTip = tipPercentage * mealTotal;
        float totalAmountPaid = totalTip + mealTotal;

        System.out.printf("The total tip was $%.2f!\n", totalTip);
        System.out.printf(customerName + " owes a total of $%.2f.\n", totalAmountPaid);
  }
}
