package lessonPackage.services.interfaces;

import lessonPackage.data.Trainer;

import java.util.List;

public interface TrainerService {

    List<Trainer> getAllTrainers();
    void addTrainer(Trainer trainer);
    Trainer getOneTrainer(int id);
}
