package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.HelloController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloControllerImpl implements HelloController{

    @Override
    @GetMapping("h1")
    public String helloMethod1() {
        return "test";
    }

    @Override
    @GetMapping("h2")
    public ModelAndView helloMethod2() {
        String mars = "Mars";
        return new ModelAndView("test", "planet",mars);
    }

    @Override@GetMapping("h3")
    public String helloMethod3(Model model) {
        model.addAttribute("planet", "Mars");
        model.addAttribute("planet2", "Venus");

        return "test";
    }
}
