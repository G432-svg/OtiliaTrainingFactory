package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.CommentController;
import lessonPackage.services.interfaces.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CommentControllerImpl implements CommentController {
    private CommentService commentService;

    @Autowired
    public CommentControllerImpl(CommentService commentService){
        this.commentService = commentService;
    }

    @Override
    public String showAllComment(Model model) {
        return null;
    }

    @Override
    @GetMapping("comments")
    public String showAllComments(Model model) {
        model.addAttribute("comments", commentService.getAllComments());
        return "chi-siamo";
    }


    @Override
    @GetMapping("/commentsbs")
    public String showShopPage(Model model) {
        model.addAttribute("comments", commentService.getAllComments());
        return "chi-siamo";
    }

    @GetMapping("/comment/{id}")
    public String showOneComment(@PathVariable Integer id, Model model) {
        model.addAttribute("comment", commentService.getOneComment(id));
        return "chi-siamo";
    }
}
