package ee.valiitit.backaegkaob.business.bucketlist.dto;

import lombok.Data;

@Data
public class BucketlistItemInfo {
    //siia tuleb lisada väljad infost, mida soovid kasutada FE-s
    private Integer bucketlistId;
    private String title;
    private String text;
    private String dateAdded;
}
