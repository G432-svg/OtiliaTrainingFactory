package lessonPackage.repositories;

import lessonPackage.data.Lesson;
import lessonPackage.data.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepository extends JpaRepository<Lesson, Integer> {

    List<Lesson> findByTrainer(Trainer trainer);
}
