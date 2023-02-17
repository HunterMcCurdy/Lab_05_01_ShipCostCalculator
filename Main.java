public class Main {
    public static void main(String[] args) {
        // declare variables like shipping cost and product cost
        double shippingCost = .02;
        double totalCost = 0;
        double productCost = 175;
        // asks if the product is over 100 dollars
        if (productCost > 100)
        {
            shippingCost = 0;
        }
        // if not over 100 dollars charge 2% shipping cost
        else
        {
            shippingCost = productCost * .02;
        }
        // calculate total cost and print values 
        totalCost = productCost + shippingCost;
        System.out.println("Your total price is " + totalCost + " and your shipping cost is " + shippingCost);






    }

}