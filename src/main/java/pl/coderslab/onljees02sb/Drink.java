package pl.coderslab.onljees02sb;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Drink {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Long rating;
    private Long power;



    public String toString() {
        return "Driq eqw eqw ewq n qweqw eqwe qwk(id=" + this.getId() + ", name=" + this.getName() + ")";
    }
}

