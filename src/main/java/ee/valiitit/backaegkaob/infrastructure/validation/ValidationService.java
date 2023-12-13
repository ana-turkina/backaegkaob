package ee.valiitit.backaegkaob.infrastructure.validation;

import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.infrastructure.exception.BusinessException;

import static ee.valiitit.backaegkaob.infrastructure.validation.Error.*;


import java.util.Optional;


public class ValidationService {
    public static User getValidUser(Optional<User> optionalUser) {
        if (optionalUser.isEmpty()) {
            throw new BusinessException(INCORRECT_CREDENTIALS.getMessage(), INCORRECT_CREDENTIALS.getErrorCode());
        }
        return optionalUser.get();
    }
}
