package ee.valiitit.backaegkaob.business.login;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @Resource
    private LoginService loginService;

    @GetMapping("/login")
    @Operation(summary = "Logib kasutaja sisse.")
    public LoginResponseDto login(@RequestParam String email, @RequestParam String password) {
        return loginService.login(email, password);
    }


}
