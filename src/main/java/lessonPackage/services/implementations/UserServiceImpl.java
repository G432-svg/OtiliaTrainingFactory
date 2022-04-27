package lessonPackage.services.implementations;

import lessonPackage.data.User;
import lessonPackage.repositories.UserRepository;
import lessonPackage.services.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void createUser(User user) {
        //if you want, you can try to encrypt passwords on this level
        userRepository.save(user);

    }

    @Override
    public User getUserByNameAndPassWord(String userName, String passWord) {
        return userRepository.findByUserNameAndPassWord(userName,passWord);

    }
}
