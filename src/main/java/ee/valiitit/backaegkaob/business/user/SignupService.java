package ee.valiitit.backaegkaob.business.user;

import ee.valiitit.backaegkaob.business.user.dto.RelatedUserRequest;
import ee.valiitit.backaegkaob.business.user.dto.UserRequest;
import ee.valiitit.backaegkaob.domain.role.Role;
import ee.valiitit.backaegkaob.domain.role.RoleService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserMapper;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
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
        Role role = roleService.getRoleCustomer();
        User user = userMapper.toUser(userRequest);
        user.setRole(role);
        userService.saveUser(user);
    }

    public void addNewRelatedUser(RelatedUserRequest request) {
        Role role = roleService.getRoleFriend();
        User user = userMapper.toUser(request);
        user.setRole(role);
        userService.saveUser(user);

    }
}
