package cristianorocchi.u5s5d4.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "Bevanda")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Bevanda {
    @Setter(AccessLevel.NONE)
    private long id;
    private String nome;
    private String volume;
    private int calorie;
    private double prezzo;

    public Bevanda(long id, String nome, String volume, int calorie, double prezzo) {
        this.id = id;
        this.nome = nome;
        this.volume = volume;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }
}
