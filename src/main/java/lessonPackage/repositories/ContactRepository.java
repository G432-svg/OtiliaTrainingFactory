package lessonPackage.repositories;

import lessonPackage.data.Contact;
import lessonPackage.data.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}
