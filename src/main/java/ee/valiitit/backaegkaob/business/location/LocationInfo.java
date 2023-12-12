package ee.valiitit.backaegkaob.business.location;

import ee.valiitit.backaegkaob.domain.location.Location;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationInfo implements Serializable {

    @NotNull
    @Size(max = 255)
    private String title;
    private BigDecimal latitude;
    private BigDecimal longtitude;
    @NotNull
    @Size(max = 1000)
    private String description;
}