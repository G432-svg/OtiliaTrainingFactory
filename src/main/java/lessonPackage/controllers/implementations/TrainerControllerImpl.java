package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.TrainerController;
import lessonPackage.services.interfaces.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TrainerControllerImpl implements TrainerController {

    @Autowired
    private TrainerService trainerService;

    @Override
    @GetMapping("trainers")
    public String showAllTrainers(Model model) {
        model.addAttribute("trainers", trainerService.getAllTrainers());
        return "ProductList";
    }

    @Override
    public String showShopPage(Model model) {
        return null;
    }
}
