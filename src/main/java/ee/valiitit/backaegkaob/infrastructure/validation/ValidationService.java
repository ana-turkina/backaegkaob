package ee.valiitit.backaegkaob.infrastructure.validation;
import ee.valiitit.backaegkaob.domain.user.User;
import java.util.Optional;

//TODO tegele erroriga

public class ValidationService {
    public static User getValidUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) {
            throw new RuntimeException();
        }
        return optionalUser.get();
    }
}
