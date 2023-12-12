package ee.valiitit.backaegkaob.business.userprofile;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserProfilesController {
    @Resource
    private UserProfilesService userProfilesService;

    @GetMapping("/profile")
    @Operation(summary = "Tagastab kasutaja andmeid: emaili ja avatari.")
    public ProfileInfo g1(@RequestParam Integer userId) {
        return userProfilesService.getUserProfile(userId);
    }
}
