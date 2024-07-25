public class Product {
    //Creating the attributes for the product cost, quantity, and name
    private double cost;
    private int quantity;
    private String name;

    //Creating the constructor to initialize the product with name, cost, and quantity
    public Product(String name, double cost, int quantity) {
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    //Creating a method to calculate and print the total cost for the product
    public void totalCost() {
        double totalCost = cost * quantity;
        System.out.println("The total cost for " + quantity + " units of " + name + " is: $" + totalCost);
    }

    //Creating a method to print the details of the product
    public void printProduct() {
        System.out.println("Product: " + name);
        System.out.println("Cost per unit: $" + cost);
        System.out.println("Quantity purchased: " + quantity);
    }
}

