package lessonPackage.services.interfaces;

import lessonPackage.data.Lesson;
import lessonPackage.data.Trainer;

import java.util.List;

public interface LessonService {

    List<Lesson> getAllLessons();
    void addLesson(Lesson lesson);
    Lesson getOneLesson(int id);


}
