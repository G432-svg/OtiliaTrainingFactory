package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.ShoppingCartController;
import lessonPackage.services.interfaces.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingCartControllerImpl implements ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @Override
    @GetMapping("shoppingCart")
    public String showAllShoppingCarts(Model model) {
        model.addAttribute("shoppingCart", shoppingCartService.getAllShoppingCarts());
        return "checkout";
    }

    @Override
    public String showShopPage(Model model) {
        return null;
    }
}
