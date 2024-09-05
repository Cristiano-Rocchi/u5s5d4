package cristianorocchi.u5s5d4.services;

import cristianorocchi.u5s5d4.entities.Pizza;
import cristianorocchi.u5s5d4.repositories.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public List<Pizza> getAllPizze() {
        return pizzaRepository.findAll();
    }

    public Pizza savePizza(Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    
}
