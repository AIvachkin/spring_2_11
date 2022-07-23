package pro.sky.spring_2_11.Service;

import org.springframework.stereotype.Service;
import pro.sky.spring_2_11.Model.Basket;

import java.util.ArrayList;
import java.util.List;

@Service
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
