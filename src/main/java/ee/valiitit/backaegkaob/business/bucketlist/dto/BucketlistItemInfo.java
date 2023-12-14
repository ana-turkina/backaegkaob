package ee.valiitit.backaegkaob.business.bucketlist.dto;

import lombok.Data;

@Data
public class BucketlistItemInfo {
    //siia tuleb lisada väljad infost, mida soovid kasutada FE-s
    private String bucketlistItemTitle;
    private String bucketlistItemText;
    private String bucketlistItemTimestamp;
}



