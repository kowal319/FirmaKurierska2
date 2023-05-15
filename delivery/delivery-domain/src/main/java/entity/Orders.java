package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORDERS_SEQ")
    @SequenceGenerator(name = "ORDERS_SEQ", sequenceName = "ORDERS_SEQ", allocationSize = 1)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customers customerId;

    @Column(name = "order_date")
    private LocalDate orderDate;

    @Column(name = "total_amount")
    private double totalAmount;

    public Orders() {
    }

    public Orders(Long id, Customers customerId, LocalDate orderDate, double totalAmount) {
        this.id = id;
        this.customerId = customerId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customers getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customers customerId) {
        this.customerId = customerId;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", orderDate=" + orderDate +
                ", totalAmount=" + totalAmount +
                '}';
    }
}

