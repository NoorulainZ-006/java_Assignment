import java.util.Scanner ;
public class TipCalculator {
    public static void main(String[] args){
        System.out.println("SIMPLE TIP CALCULATOR!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bill amount: ");
        double billAmount = scanner.nextDouble();
        double tip = billAmount * 0.15;
        double totalAmount = billAmount + tip;

        System.out.println("\n((((((( Simple Tip Calculator )))))))");
        System.out.println("Bill Amount: " + billAmount +"Rs.");
        System.out.println("Tip (15%): " + tip +"Rs.");
        System.out.println("Total Amount: " + totalAmount +"Rs.");

        //Bonus:
        System.out.print("\nEnter custom tip percentage : ");
        double customTipPercent = scanner.nextDouble();

        double customTip = billAmount * (customTipPercent / 100);
        double customTotal = billAmount + customTip;

        System.out.println("\n ((((((((( Custom Tip Calculator )))))))");
        System.out.println("Bill Amount: " + billAmount +"Rs.");
        System.out.println("Tip (" + customTipPercent + "%): " + customTip +"Rs.");
        System.out.println("Total Amount: " + customTotal +"Rs.");
    }
}