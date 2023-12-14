package ee.valiitit.backaegkaob.business.user;


import ee.valiitit.backaegkaob.business.user.dto.UserRequest;
import ee.valiitit.backaegkaob.business.user.dto.RelatedUserRequest;
import ee.valiitit.backaegkaob.infrastructure.error.ApiError;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
public class SignupController {

    @Resource
    private SignupService signupService;

    @PostMapping("/user")
    @Operation(summary = "Lisab uue kasutaja.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Sellise emailiga kasutaja on juba süsteemis olemas",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addNewUser(@RequestBody @Valid UserRequest request) {
        signupService.addNewUser(request);
    }

    @PostMapping("/user/related")
    @Operation(summary = "Lisab uue 'friend' kasutaja.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "403", description = "Sellise emailiga kasutaja on juba süsteemis olemas",
                    content = @Content(schema = @Schema(implementation = ApiError.class)))})
    public void addNewRelatedUser(@RequestBody @Valid RelatedUserRequest request) {
        signupService.addNewRelatedUser(request);
    }

    @DeleteMapping("/user")
    @Operation(summary = "Deaktiveerib kasutaja konto.")
    public void deleteUser(@RequestParam Integer userId) {
        signupService.deleteUser(userId);
    }
}
