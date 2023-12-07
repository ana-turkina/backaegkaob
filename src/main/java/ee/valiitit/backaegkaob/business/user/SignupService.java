package ee.valiitit.backaegkaob.business.user;

import ee.valiitit.backaegkaob.business.user.dto.UserRequest;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Resource
    private UserService userService;


    public void addNewUser(@Valid UserRequest userRequest) {

        // eeltöö. Leia andmebaasist role objekt (customer)


        User user = new User();
        // pane see ussreile kylge
        userService.saveUser(user);



    }
}
