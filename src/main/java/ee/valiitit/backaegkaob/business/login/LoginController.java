package ee.valiitit.backaegkaob.business.login;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping("/home")
    public LoginResponseDto login(@RequestParam String username, @RequestParam String password) {
        return loginService.login(username, password);
    }
}
