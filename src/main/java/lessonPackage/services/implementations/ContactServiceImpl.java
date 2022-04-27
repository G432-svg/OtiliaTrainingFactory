package lessonPackage.services.implementations;

import lessonPackage.data.Contact;
import lessonPackage.repositories.ContactRepository;
import lessonPackage.repositories.TrainerRepository;
import lessonPackage.services.interfaces.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

@Service
public class ContactServiceImpl implements ContactService {
    private ContactRepository contactRepository;


    @Autowired
    public ContactServiceImpl(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }
    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public void addContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    public Contact getOneContact(int id) {
        return contactRepository.getOne(id);
    }
}
