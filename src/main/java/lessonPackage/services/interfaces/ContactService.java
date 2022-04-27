package lessonPackage.services.interfaces;

import lessonPackage.data.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAllContacts();
    void addContact(Contact contact);
    Contact getOneContact(int id);
}
