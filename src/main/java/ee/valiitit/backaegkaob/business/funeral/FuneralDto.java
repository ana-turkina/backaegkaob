package ee.valiitit.backaegkaob.business.funeral;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuneralDto implements Serializable {
    String funeralInstructions;
    String testament;
    String menüü;
    String hauaplats;
    String matusetüüp;
    String skulptuur;


}