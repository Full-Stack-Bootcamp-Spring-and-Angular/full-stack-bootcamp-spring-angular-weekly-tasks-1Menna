package Entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="products")
public class Product {
    @Id
    @Column(name="product_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int product_id;

    @Column(name="name")
    String name;

    @Column(name="description")
    String description;

    @Column(name="price")
    double price;

    @Column(name="stock_quantity")
    int stock_quantity;

    @Column(name="manufacturer")
    String manufacturer;


    @Temporal(TemporalType.DATE)
    @Column(name="production_date")
    Date production_date;

    public Product() {

    }

    public Product(String name, String description, double price, int stock_quantity, String manufacturer, Date production_date) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock_quantity = stock_quantity;
        this.manufacturer = manufacturer;
        this.production_date = production_date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product_id=" + product_id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", stock_quantity=" + stock_quantity +
                ", manufacturer='" + manufacturer + '\'' +
                ", production_date=" + production_date +
                '}';
    }
}
