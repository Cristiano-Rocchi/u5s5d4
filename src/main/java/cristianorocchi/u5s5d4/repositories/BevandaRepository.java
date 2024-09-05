package cristianorocchi.u5s5d4.repositories;

import cristianorocchi.u5s5d4.entities.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BevandaRepository extends JpaRepository<Bevanda,Long> {
}
