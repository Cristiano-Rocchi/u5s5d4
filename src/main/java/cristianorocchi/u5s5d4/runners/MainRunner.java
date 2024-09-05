package cristianorocchi.u5s5d4.runners;

import cristianorocchi.u5s5d4.entities.Bevanda;
import cristianorocchi.u5s5d4.entities.Pizza;
import cristianorocchi.u5s5d4.entities.Topping;
import cristianorocchi.u5s5d4.services.BevandaService;
import cristianorocchi.u5s5d4.services.PizzaService;
import cristianorocchi.u5s5d4.services.ToppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MainRunner implements CommandLineRunner {
    @Autowired
    private final BevandaService bevandaService;
    @Autowired
    private final PizzaService pizzaService;
    @Autowired
    private final ToppingService toppingService;

    public MainRunner(BevandaService bevandaService, PizzaService pizzaService, ToppingService toppingService) {
        this.bevandaService = bevandaService;
        this.pizzaService = pizzaService;
        this.toppingService = toppingService;
    }
    @Override
    public void run(String... args) {

        Bevanda bevanda = new Bevanda(1,"Sprite","0.5l",100,2);
        bevandaService.saveBevanda(bevanda);

        Topping topping = new Topping(1, "Pineapple", 50, 1.0);
        toppingService.saveTopping(topping);

        Pizza pizza = new Pizza(1, "Margherita", List.of("Pomodoro", "Mozzarella"), List.of(topping), 300, 8.0);
        pizzaService.savePizza(pizza);
    }
}
