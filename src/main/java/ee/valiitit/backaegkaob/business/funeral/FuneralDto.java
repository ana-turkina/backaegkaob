package ee.valiitit.backaegkaob.business.funeral;

import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.Value;

import java.io.Serializable;


@Data
public class FuneralDto implements Serializable {
    Integer id;
    String funeralInstructions;
    @NotNull
    Integer userId;
}