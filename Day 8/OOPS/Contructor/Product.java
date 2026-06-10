package Day 8.OOPS.Contructor;

public public class Product {
    String name;// class attributes
    int price;// instance variables -> current objects

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    Product(Product otherproduct) {
        this.name = otherproduct.name;
        this.price = otherproduct.price;
    }

} {
    
}
