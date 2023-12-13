package ee.valiitit.backaegkaob.domain.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.BucketlistDto;
import org.mapstruct.Mapping;

public interface BucketlistMapper {


    @Mapping(source = "id", target = "bucketlistItemId")
    @Mapping(source = "title", target = "bucketlistItemTitle")
    @Mapping(source = "text", target = "bucketlistItemText")
    @Mapping(source = "timestamp", target = "bucketlistItemTimestamp")



    @Mapping(source = "title", target = "title")
    @Mapping(source = "text", target = "text")
    @Mapping(source = "timestamp", target = "timestamp")
    BucketlistDto toBucketlistsDto(Bucketlist bucketlist);

//    @Mapping(source = "title", target = "title")
//    @Mapping(source = "text", target = "text")
//    @Mapping(source = "timestamp", target = "timestamp");
    //Bucketlists toBucketlistDto();


}


//String meetod (klass objekt)
//tagastatav tüüp, nimi, parameetrid mis tulevad sisse
//ühe asja teiseks
