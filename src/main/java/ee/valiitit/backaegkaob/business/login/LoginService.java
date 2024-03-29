package ee.valiitit.backaegkaob.business.login;

import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserMapper;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;


@Service

class LoginService {
    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    public LoginResponseDto login(String email, String password) {
        User user = userService.findActiveUserBy(email, password);
        return userMapper.toLoginResponseDto(user);
    }


}
