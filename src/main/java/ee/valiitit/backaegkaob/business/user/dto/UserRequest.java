package ee.valiitit.backaegkaob.business.user.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link ee.valiitit.backaegkaob.domain.user.User}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest implements Serializable {

    @NotNull
    @Size(max = 255)
    private String email;

    @NotNull
    @Size(max = 255)
    private String password;
}