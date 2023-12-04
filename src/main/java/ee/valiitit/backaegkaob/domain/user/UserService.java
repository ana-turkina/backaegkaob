package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Resource
    private UserRepository userRepository;

    public User findActiveUserBy(String username, String password) {
        return userRepository.findUserBy(username, password, Status.ACTIVE);
    }
}
