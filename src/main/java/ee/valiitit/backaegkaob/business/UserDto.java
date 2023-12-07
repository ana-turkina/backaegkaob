package ee.valiitit.backaegkaob.business;

import ee.valiitit.backaegkaob.domain.user.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link User}
 */
@Value
public class UserDto implements Serializable {
    Integer id;
    Integer roleId;
    String roleName;
    @NotNull
    @Size(max = 255)
    String email;
    @NotNull
    @Size(max = 255)
    String password;
    @NotNull
    String status;
}