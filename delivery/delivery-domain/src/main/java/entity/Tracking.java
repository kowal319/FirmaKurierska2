package entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "tracking")
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRACKING_SEQ")
    @SequenceGenerator(name = "TRACKING_SEQ", sequenceName = "TRACKING_SEQ", allocationSize = 1)
    @Column(name = "tracking_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "delivery_id")
    private Delivery deliveryId;

    @Column(name = "location")
    private String location;

    @Column(name = "status")
    private String status;

    @Column(name = "update_date")
    private LocalDateTime updateDate;

    public Tracking() {
    }

    public Tracking(Long id, Delivery deliveryId, String location, String status, LocalDateTime updateDate) {
        this.id = id;
        this.deliveryId = deliveryId;
        this.location = location;
        this.status = status;
        this.updateDate = updateDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Delivery getDeliveryId() {
        return deliveryId;
    }

    public void setDeliveryId(Delivery deliveryId) {
        this.deliveryId = deliveryId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Tracking{" +
                "id=" + id +
                ", deliveryId=" + deliveryId +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                ", updateDate=" + updateDate +
                '}';
    }
}

