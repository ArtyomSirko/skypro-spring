package pro.sky.skyprospring.Service;

import pro.sky.skyprospring.Product;

import java.util.List;

public interface StoreService {
    List<Product> getBasket();

    List<Product> addProductBasket(List<Integer> id);
}
