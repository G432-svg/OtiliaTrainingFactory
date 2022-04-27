package lessonPackage.controllers.interfaces;

import org.springframework.ui.Model;

public interface ShoppingCartController {
    String showAllShoppingCarts(Model model);

    String showShopPage(Model model);
}
