package cristianorocchi.u5s5d4.repositories;



import cristianorocchi.u5s5d4.entities.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    List<Pizza> findByNome(String nome);


    List<Pizza> findByCalorieGreaterThanEqual(int calorie);
}
