package pro.sky.spring_2_11.Service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring_2_11.Model.Basket;

import java.util.ArrayList;
import java.util.List;

@Service
//@Scope("prototype")
//@Scope("session")
public class BasketService {

    private final List<Basket> basketList = new ArrayList<>();


    public Basket addProduct(Integer category, String product) {
        Basket basket = new Basket(category, product);
        basketList.add(basket);
        return basket;
    }


    public List<Basket> getProducts() {
        return basketList;
    }
}
