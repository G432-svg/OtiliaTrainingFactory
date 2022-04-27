package lessonPackage.services.implementations;

import lessonPackage.data.ShoppingCart;
import lessonPackage.repositories.ShoppingCartRepository;
import lessonPackage.services.interfaces.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private ShoppingCartRepository shoppingCartRepository;

    @Autowired
    private ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository){
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public List<ShoppingCart> getAllShoppingCarts() {
        return shoppingCartRepository.findAll();
    }

    @Override
    public void addShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public ShoppingCart getOneShoppingCart(int id) {
        return shoppingCartRepository.getOne(id);
    }
}
