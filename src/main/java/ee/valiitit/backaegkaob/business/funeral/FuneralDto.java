package ee.valiitit.backaegkaob.business.funeral;

import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import jakarta.validation.constraints.NotNull;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Funeral}
 */
@Value
public class FuneralDto implements Serializable {
    Integer id;
    @NotNull
    String funeralInstructions;
    Integer userId;
    Integer userRoleId;
    String userRoleName;
    String userEmail;
    String userPassword;
    String userStatus;
}