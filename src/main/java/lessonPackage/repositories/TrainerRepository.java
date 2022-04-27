package lessonPackage.repositories;

import lessonPackage.data.Trainer;
import lessonPackage.data.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainerRepository extends JpaRepository<Trainer,Integer> {
    Trainer findByName(String Name);

}

