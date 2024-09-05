package cristianorocchi.u5s5d4.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Topping")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Topping {
    @Id
    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private int calorie;
    private double prezzo;
    @ManyToOne
    @JoinColumn(name = "pizza_id")
    private Pizza pizza;

    public Topping(long id, String nome, int calorie, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}
