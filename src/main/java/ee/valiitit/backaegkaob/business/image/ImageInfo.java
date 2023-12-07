package ee.valiitit.backaegkaob.business.image;

import ee.valiitit.backaegkaob.domain.image.Image;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Value;

import java.io.Serializable;
import java.time.Instant;

/**
 * DTO for {@link Image}
 */
@Value
public class ImageInfo implements Serializable {
    Integer id;
    @NotNull
    @Size(max = 255)
    String title;
    @NotNull
    String imageData;
    @NotNull
    Instant timestamp;
}