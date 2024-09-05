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

    public Bevanda(long id, double prezzo, int calorie, String volume, String nome) {
        this.id = id;
        this.prezzo = prezzo;
        this.calorie = calorie;
        this.volume = volume;
        this.nome = nome;
    }
}
