public class CustomerOrder {
    // Instance variables for each order
    private int orderNumber;
    private double price = 5.0; // Assume each item has a fixed price of $5
    public int quantity;
    public boolean seniorCitizen;
    public double orderAmount;

    // Static variable to keep track of the last order number for unique order numbers
    private static int lastOrderNumber = 0;

    // Constructor
    public CustomerOrder() {
        // Increment last order number to get a new unique order number
        this.orderNumber = ++lastOrderNumber;
    }

    // Method to generate the order bill
    public void generateOrderBill() {
        // Compute order amount based on price and quantity
        this.orderAmount = price * quantity;

        // Apply discount if the customer is a senior citizen
        if (seniorCitizen) {
            double discount = orderAmount * 0.10; // 10% discount
            this.orderAmount -= discount;
        }
    }

    // Getter for orderNumber to access it outside the class
    public int getOrderNumber() {
        return orderNumber;
    }
}

public class CafeOrderProcessor {
    public static void main(String[] args) {
        // Cafe name
        String cafeName = "Duke's Coffee Hut";
        System.out.println("Welcome to " + cafeName + "\n");

        // First Order
        CustomerOrder order1 = new CustomerOrder();
        order1.quantity = 2;
        order1.seniorCitizen = true;
        order1.generateOrderBill();
        printOrderDetails(order1);

        // Second Order
        CustomerOrder order2 = new CustomerOrder();
        order2.quantity = 3;
        order2.seniorCitizen = false;
        order2.generateOrderBill();
        printOrderDetails(order2);

        // Third Order
        CustomerOrder order3 = new CustomerOrder();
        order3.quantity = 1;
        order3.seniorCitizen = true;
        order3.generateOrderBill();
        printOrderDetails(order3);
    }

    // Helper method to print order details
    private static void printOrderDetails(CustomerOrder order) {
        System.out.println("Order Number: " + order.getOrderNumber());
        System.out.println("Quantity: " + order.quantity);
        System.out.println("Total Amount: $" + order.orderAmount);
        System.out.println();
    }
}
