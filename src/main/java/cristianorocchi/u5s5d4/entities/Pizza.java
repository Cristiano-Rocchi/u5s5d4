package cristianorocchi.u5s5d4.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Pizza")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Pizza {
    @Id
    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private List<String> ingredientiBase;
    @OneToMany(mappedBy = "pizza", cascade = CascadeType.ALL)
    private List<Topping> toppings;
    private int calorie;
    private double prezzo;

    public Pizza(long id, String nome, List<String> ingredientiBase, List<Topping> toppings, int calorie, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.ingredientiBase = ingredientiBase;
        this.toppings = toppings;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}
