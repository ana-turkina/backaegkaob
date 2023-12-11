package ee.valiitit.backaegkaob.domain.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.BucketlistDto;
import org.mapstruct.Mapping;

public interface BucketlistMapper {


    @Mapping(source = "title", target = "title")
    @Mapping(source = "text", target = "text")
    @Mapping(source = "timestamp", target = "timestamp")
    BucketlistDto toBucketlistsDto(Bucketlist bucketlist);

}


//String meetod (klass objekt)
//tagastatav tüüp, nimi, parameetrid mis tulevad sisse
//ühe asja teiseks
