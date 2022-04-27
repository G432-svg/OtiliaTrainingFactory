package lessonPackage.controllers.interfaces;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public interface CommentController {
    String showAllComment(Model model);

    @GetMapping("comments")
    String showAllComments(Model model);

    String showShopPage(Model model);
}
