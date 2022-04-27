package lessonPackage.services.implementations;

import lessonPackage.data.Lesson;
import lessonPackage.data.Trainer;
import lessonPackage.repositories.LessonRepository;
import lessonPackage.services.interfaces.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LessonServiceImpl implements LessonService{

    private LessonRepository lessonRepository;

    @Autowired
    public LessonServiceImpl(LessonRepository lessonRepository){
        this.lessonRepository = lessonRepository;
    }
    @Override
    public List<Lesson> getAllLessons(){
        return lessonRepository.findAll();
    }

    @Override
    public void addLesson(Lesson lesson){
        lessonRepository.save(lesson);

    }
    public Lesson getOneLesson(int id){
        return lessonRepository.getOne(id);
    }


}
