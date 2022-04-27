package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.LessonController;
import lessonPackage.data.Lesson;
import lessonPackage.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class LessonControllerImpl implements LessonController {


    private LessonService lessonService;

    @Autowired
    public LessonControllerImpl(LessonService lessonService){
        this.lessonService = lessonService;
    }
    @Override
    @GetMapping("lessons")
    public String showAllLessons(Model model) {
        model.addAttribute("lessons", lessonService.getAllLessons());
        return "shoppage";
    }

    @Override
    @GetMapping("/lessonsbs")
    public String showShopPage(Model model) {
        model.addAttribute("lessons", lessonService.getAllLessons());
        return "shoppage";
    }
    @GetMapping("/lesson/{id}")
    public String showOneLesson(@PathVariable Integer id, Model model) {
        model.addAttribute("lesson", lessonService.getOneLesson(id));
        return "shoppage";
    }


}
