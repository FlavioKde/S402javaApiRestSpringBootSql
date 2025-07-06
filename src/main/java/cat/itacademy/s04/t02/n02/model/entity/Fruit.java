package cat.itacademy.s04.t02.n02.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "fruits")
public class Fruit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(name = "quantity_kilos")
    private int quantityKilos;

    public Fruit() {
    }

    public long getId() {
        return id;
    }



    public String getName() {
        return name;
    }




    @Override
    public String toString() {
        return "Fruit{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityKilos=" + quantityKilos +
                '}';
    }
}
