package entity;

import jakarta.persistence.*;

@Entity
@Table( name = "customers")
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMERS_SEQ")
    @SequenceGenerator(name="CUSTOMERS_SEQ", sequenceName = "CUSTOMERS_SEQ", allocationSize = 1)
    @Column(name = "customer_id")
    private Long id;

    @Column(name = "customer_name")
    private String name;
    @Column(name = "customer_address")
    private String address;
    @Column(name = "customer_phone")
    private String phone;

    public Customers(){}

    public Customers(Long id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
