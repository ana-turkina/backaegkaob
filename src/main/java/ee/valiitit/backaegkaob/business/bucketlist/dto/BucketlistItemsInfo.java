package ee.valiitit.backaegkaob.business.bucketlist.dto;

import lombok.Data;

@Data
public class BucketlistItemsInfo {
    private Integer bucketlistItemId;
    private String bucketlistItemTitle;
    private String bucketlistItemText;
    private String bucketlistItemTimestamp;
}
