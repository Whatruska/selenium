package entities;

import java.util.Objects;

public class Order {
    private String name;
    private String seller;
    private String number;
    private String price;

    public Order(String name, String seller, String number, String price) {
        this.name = name;
        this.seller = seller;
        this.number = number;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getSeller() {
        return seller;
    }

    public String getNumber() {
        return number;
    }

    public String getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(name, order.name) && Objects.equals(seller, order.seller) && Objects.equals(number, order.number) && Objects.equals(price, order.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seller, number, price);
    }
}
