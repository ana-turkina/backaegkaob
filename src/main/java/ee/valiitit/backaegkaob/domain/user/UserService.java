package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    public User findActiveUserBy(String email, String password) {
        return userRepository.findUserBy(email, password, Status.ACTIVE);
    }

    public User getUserBy(Integer userId) {
        return userRepository.findUserBy(userId);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
