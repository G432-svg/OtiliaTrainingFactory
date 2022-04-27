package lessonPackage.services.interfaces;

import lessonPackage.data.Trainer;
import lessonPackage.data.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();
    void createUser(User user);
    User getUserByNameAndPassWord(String userName, String passWord);
}
