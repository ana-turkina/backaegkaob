package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.Status;
import ee.valiitit.backaegkaob.infrastructure.validation.ValidationService;
import jakarta.annotation.Resource;
import org.mapstruct.control.MappingControl;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;
//TODO return user after validation
    public User findActiveUserBy(String email, String password) {
        Optional<User> optionalUser = userRepository.findUserBy(email, password, Status.ACTIVE);
        return ValidationService.getValidUser(optionalUser);
    }

    public User getUserBy(Integer userId) {
        return userRepository.findUserBy(userId);
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
