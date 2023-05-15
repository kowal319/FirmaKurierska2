package entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DELIVERY_SEQ")
    @SequenceGenerator(name = "DELIVERY_SEQ", sequenceName = "DELIVERY_SEQ", allocationSize = 1)
    @Column(name = "delivery_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders orderId;

    @ManyToOne
    @JoinColumn(name = "courier_id")
    private Couriers courierId;

    @Column(name = "delivery_date")
    private LocalDate deliveryDate;
    @Column(name = "delivery_status")
    private String deliveryStatus;

    public Delivery() {
    }

    public Delivery(Long id, Orders orderId, Couriers courierId, LocalDate deliveryDate, String deliveryStatus) {
        this.id = id;
        this.orderId = orderId;
        this.courierId = courierId;
        this.deliveryDate = deliveryDate;
        this.deliveryStatus = deliveryStatus;
    }

    public Long getDeliveryId() {
        return id;
    }

    public void setDeliveryId(Long deliveryId) {
        this.id = id;
    }

    public Orders getOrderId() {
        return orderId;
    }

    public void setOrderId(Orders orderId) {
        this.orderId = orderId;
    }

    public Couriers getCourierId() {
        return courierId;
    }

    public void setCourierId(Couriers courierId) {
        this.courierId = courierId;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(String deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    @Override
    public String toString() {
        return "Delivery{" +
                "deliveryId=" + id +
                ", orderId=" + orderId +
                ", courierId=" + courierId +
                ", deliveryDate=" + deliveryDate +
                ", deliveryStatus='" + deliveryStatus + '\'' +
                '}';
    }
}


