package ee.valiitit.backaegkaob.business.bucketlist;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class BucketlistDto {
    private Integer id;
    private Integer user_id;
    private String title;
    private String text;
    private LocalDateTime timestamp;
}
