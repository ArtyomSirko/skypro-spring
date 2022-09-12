package pro.sky.skyprospring.Service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.skyprospring.Basket;
import pro.sky.skyprospring.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@SessionScope

public class StoreServiceImpl implements StoreService {
    private final Basket basket = new Basket();
    private Map<Integer, Product> allProductsInShop = new HashMap<>();

    public StoreServiceImpl() {
        int counter = 0;
        allProductsInShop.put(counter, new Product("sugar", counter++));
        allProductsInShop.put(counter, new Product("milk", counter++));
        allProductsInShop.put(counter, new Product("apple", counter++));
        allProductsInShop.put(counter, new Product("vodka", counter++));
        allProductsInShop.put(counter, new Product("juice", counter++));
        allProductsInShop.put(counter, new Product("lemon", counter++));
        allProductsInShop.put(counter, new Product("chocolate", counter++));
        allProductsInShop.put(counter, new Product("toy", counter++));
    }

    @Override
    public List<Product> getBasket() {
        return basket.getBasket();
    }

    @Override
    public List<Product> addProductBasket(List<Integer> id) {
        List<Product> productsId = new ArrayList<>();
        for (int i = 0; i < id.size(); i++) {
            productsId.add(new Product(allProductsInShop.get(id.get(i)).getName(), allProductsInShop.get(id.get(i)).getId()));
        }
        return basket.addProducts(productsId);
    }
}
