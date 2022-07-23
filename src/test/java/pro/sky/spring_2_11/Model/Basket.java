package pro.sky.spring_2_11.Model;

import java.util.Objects;

public class Basket {

    private final String product;
    private final Integer category;

    public Basket(Integer category, String product) {
        this.product = product;
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(product, basket.product) && Objects.equals(category, basket.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(product, category);
    }
}
