package cristianorocchi.u5s5d4.services;



import cristianorocchi.u5s5d4.entities.Bevanda;
import cristianorocchi.u5s5d4.repositories.BevandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BevandaService {

    @Autowired
    private BevandaRepository bevandaRepository;

    public List<Bevanda> getAllBevande() {
        return bevandaRepository.findAll();
    }

    public Bevanda saveBevanda(Bevanda bevanda) {
        return bevandaRepository.save(bevanda);
    }


}
