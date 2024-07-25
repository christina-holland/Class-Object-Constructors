public class ProductMain {
    public static void main(String[] args) {
        //Creating a Product object for a gallon of milk
        Product milk = new Product("Milk", 2.89, 2);

        //Printing the product details of milk
        milk.printProduct();

        //Calculating and printing the total cost of milk
        milk.totalCost();
    }
}

