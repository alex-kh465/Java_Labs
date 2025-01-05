import java.util.*;

class Customer {
    private int id;
    private String name;
    private String email;
    private int loyaltyPoints;

    public Customer(int id, String name, String email, int loyaltyPoints) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    @Override
    public String toString() {
        return "Customer ID: " + id + ", Name: " + name + ", Email: " + email + ", Loyalty Points: " + loyaltyPoints;
    }
}

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}


class Order {
    private int orderId;
    private int customerId;
    private List<Product> products;
    private Date deliveryDate;

    public Order(int orderId, int customerId, List<Product> products, Date deliveryDate) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.products = products;
        this.deliveryDate = deliveryDate;
    }

    public int getOrderId() {
        return orderId;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer ID: " + customerId + ", Delivery Date: " + deliveryDate + ", Products: " + products;
    }
}
class OrderDeliveryDateComparator implements Comparator<Order> {
    @Override
    public int compare(Order o1, Order o2) {
        return o1.getDeliveryDate().compareTo(o2.getDeliveryDate());
    }
}

class CustomerLoyaltyComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer c1, Customer c2) {
        return Integer.compare(c1.getLoyaltyPoints(), c2.getLoyaltyPoints());
    }
}
class ProductPriceComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        return Double.compare(p1.getPrice(), p2.getPrice());
    }
}


public class AmazonApplication {
    public static void main(String[] args) {
        // Creating ArrayLists to manage customers, products, and orders
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();

        // HashMaps to store customers and products by their unique ID
        HashMap<Integer, Customer> customerMap = new HashMap<>();
        HashMap<Integer, Product> productMap = new HashMap<>();

        // Adding some customers
        customers.add(new Customer(1, "Alice", "alice@example.com", 150));
        customers.add(new Customer(2, "Bob", "bob@example.com", 200));
        customerMap.put(1, customers.get(0));
        customerMap.put(2, customers.get(1));

        // Adding some products
        products.add(new Product(101, "Laptop", 1200.00));
        products.add(new Product(102, "Smartphone", 800.00));
        productMap.put(101, products.get(0));
        productMap.put(102, products.get(1));

        // Creating orders
        List<Product> order1Products = new ArrayList<>();
        order1Products.add(products.get(0));
        orders.add(new Order(1001, 1, order1Products, new Date()));

        // Sorting Products by Price using TreeSet and Comparator
        TreeSet<Product> sortedProducts = new TreeSet<>(new ProductPriceComparator());
        sortedProducts.addAll(products);
        System.out.println("Sorted Products by Price: " + sortedProducts);

        // Sorting Customers by Loyalty Points using TreeSet and Comparator
        TreeSet<Customer> sortedCustomers = new TreeSet<>(new CustomerLoyaltyComparator());
        sortedCustomers.addAll(customers);
        System.out.println("Sorted Customers by Loyalty Points: " + sortedCustomers);

        // Sorting Orders by Delivery Date using TreeSet and Comparator
        TreeSet<Order> sortedOrders = new TreeSet<>(new OrderDeliveryDateComparator());
        sortedOrders.addAll(orders);
        System.out.println("Sorted Orders by Delivery Date: " + sortedOrders);
    }
}
