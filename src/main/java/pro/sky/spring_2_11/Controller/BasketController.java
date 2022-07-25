package pro.sky.spring_2_11.Controller;


import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring_2_11.Model.Basket;
import pro.sky.spring_2_11.Service.BasketService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class BasketController {

    public final BasketService basketService;


    public BasketController(BasketService basketService) {
        this.basketService = basketService;

    }

    @GetMapping("/add")
    public Basket addProduct(@RequestParam("category") Integer category,
                             @RequestParam("product") String product) {
        return basketService.addProduct(category, product);
    }


//    Добавление сразу любого числа товаров в корзину
//@GetMapping("/add")
//public String addProduct(@RequestParam(value = "category") Integer [] ids) {
//        for (int i=0; i<ids.length; i++){
//            BasketService.add(ids[i]);
//        }
//
//    return "Товары добавлены";
//}


    @GetMapping("/get")
    public List<Basket> getProduct() {
        return basketService.getProducts();

    }


}
