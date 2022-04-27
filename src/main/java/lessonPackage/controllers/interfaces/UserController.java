package lessonPackage.controllers.interfaces;

import lessonPackage.data.User;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface UserController {

    String gotoLoginPage(Model model, HttpSession httpSession);
    String login(User userReceived, HttpSession httpSession);
}
