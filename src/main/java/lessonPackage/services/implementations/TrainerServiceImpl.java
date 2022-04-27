package lessonPackage.services.implementations;
import lessonPackage.data.Trainer;
import lessonPackage.repositories.TrainerRepository;
import lessonPackage.services.interfaces.TrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainerServiceImpl implements TrainerService {

    private TrainerRepository trainerRepository;

    @Autowired
    public TrainerServiceImpl(TrainerRepository trainerRepository){
        this.trainerRepository = trainerRepository;
    }

    @Override
    public List<Trainer> getAllTrainers() {
        return trainerRepository.findAll();
    }


    @Override
    public void addTrainer(Trainer trainer){
        trainerRepository.save(trainer);

    }
    public Trainer getOneTrainer(int id){
        return trainerRepository.getOne(id);
    }
}
