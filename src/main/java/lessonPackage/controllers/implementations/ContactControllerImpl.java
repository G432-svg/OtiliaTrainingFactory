package lessonPackage.controllers.implementations;

import lessonPackage.controllers.interfaces.ContactController;
import lessonPackage.services.interfaces.ContactService;
import lessonPackage.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ContactControllerImpl implements ContactController {

    private final ContactService contactService;

    @Autowired
    public ContactControllerImpl(ContactService contactService){
        this.contactService = contactService;
    }

    @Override
    @GetMapping("contacts")
    public String showAllContacts(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "home";
    }

    @Override
    @GetMapping("/contactsbs")
    public String showShopPage(Model model) {
        model.addAttribute("contacts", contactService.getAllContacts());
        return "home";
    }

    @GetMapping("/contact/{id}")
    public String showOneContact(@PathVariable Integer id, Model model) {
        model.addAttribute("contact", contactService.getOneContact(id));
        return "home";
    }
}
