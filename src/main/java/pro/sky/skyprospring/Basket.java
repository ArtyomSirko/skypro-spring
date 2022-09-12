package pro.sky.skyprospring;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component

public class Basket {
    private final List<Product> basket = new ArrayList<>();

    public Basket() {
    }

    public List<Product> addProducts(List<Product> productsToAdd) {
        for (Product product : productsToAdd) {
            basket.add(product);
        }
        return productsToAdd;
    }

    public List<Product> getBasket() {
        return basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Basket)) return false;
        Basket basket1 = (Basket) o;
        return basket.equals(basket1.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(basket);
    }
}