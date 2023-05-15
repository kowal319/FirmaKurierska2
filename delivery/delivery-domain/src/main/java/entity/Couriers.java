package entity;


import jakarta.persistence.*;

@Entity
@Table( name = "couriers")
public class Couriers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "COURIERS_SEQ")
    @SequenceGenerator(name="COURIERS_SEQ", sequenceName = "COURIERS_SEQ", allocationSize = 1)
    @Column(name = "courier_id")
    private Long id;

    @Column(name = "courier_name")
    private String name;

    @Column(name = "courier_vehicle")
    private String vehicle;

    public Couriers(){
    }

    public Couriers(Long id, String name, String vehicle) {
        this.id = id;
        this.name = name;
        this.vehicle = vehicle;
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

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public String toString() {
        return "Couriers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vehicle='" + vehicle + '\'' +
                '}';
    }
}
