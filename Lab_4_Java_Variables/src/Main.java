public class Main {

    public static void main(String[] args)
    {
	double purchasePrice = 100;
    double salesTax = 0;
    double total = 0;
    double shippingRate = 0.05;

    salesTax = shippingRate * purchasePrice;
    total = purchasePrice + salesTax;

    System.out.println("Your total price is " + total);
    System.out.println("And your sales tax was " + salesTax + " with a rate of " + shippingRate);
    }
}
