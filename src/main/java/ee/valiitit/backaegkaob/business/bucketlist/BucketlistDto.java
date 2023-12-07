package ee.valiitit.backaegkaob.business.bucketlist;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BucketlistDto {
    Integer id;
    String title;
    String text;
    LocalDateTime timestamp;
}
