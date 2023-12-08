package ee.valiitit.backaegkaob.business.user;

import ee.valiitit.backaegkaob.business.user.dto.UserRequest;
import ee.valiitit.backaegkaob.domain.role.Role;
import ee.valiitit.backaegkaob.domain.role.RoleMapper;
import ee.valiitit.backaegkaob.domain.role.RoleService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserMapper;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class SignupService {

    @Resource
    private UserService userService;

    @Resource
    private RoleService roleService;

    @Resource
    private UserMapper userMapper;


    public void addNewUser(UserRequest userRequest) {

        // eeltöö. Leia andmebaasist role objekt (customer)

        getRoleCustomer


        User user = new User();
        // pane see ussreile kylge
        userService.saveUser(user);



    }
}
