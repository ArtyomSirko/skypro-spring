package pro.sky.skyprospring.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.skyprospring.Product;
import pro.sky.skyprospring.Service.StoreService;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/order/get")
    public List<Product> getBasketList() {
        return storeService.getBasket();
    }

    @GetMapping("/order/add")
    public List<Product> addProductBasketList(@RequestParam("id") List<Integer> id) {
        return storeService.addProductBasket(id);
    }
}

