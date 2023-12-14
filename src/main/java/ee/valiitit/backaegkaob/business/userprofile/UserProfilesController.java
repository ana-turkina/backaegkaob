package ee.valiitit.backaegkaob.business.userprofile;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserProfilesController {
    @Resource
    private UserProfilesService userProfilesService;

    @GetMapping("/profile")
    @Operation(summary = "Tagastab kasutaja andmeid: emaili ja avatari.")
    public ProfileInfo getUserProfileInfo(@RequestParam Integer userId) {
        return userProfilesService.getUserProfile(userId);
    }
    @PutMapping("/profile")
    @Operation(summary = "Salvestab kasutaja")
    public void updateUserProfile(@RequestParam Integer userId, @RequestBody ProfileInfo profileInfo) {
        userProfilesService.updateUserProfile(userId, profileInfo);
    }
}
