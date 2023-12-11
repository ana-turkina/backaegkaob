package ee.valiitit.backaegkaob.business.image;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImageInfo implements Serializable {
    @NotNull
    @Size(max = 255)
    private String title;
    @NotNull
    private String imageData;
    @NotNull
    private String status;


}