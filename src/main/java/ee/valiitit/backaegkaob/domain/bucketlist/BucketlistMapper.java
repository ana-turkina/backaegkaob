package ee.valiitit.backaegkaob.domain.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.BucketlistDto;
import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemInfo;
import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemsInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryRequest;
import ee.valiitit.backaegkaob.domain.memory.Memory;
import ee.valiitit.backaegkaob.util.ByteConverter;
import ee.valiitit.backaegkaob.util.InstantConverter;
import org.mapstruct.*;

import java.time.Instant;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BucketlistMapper {


    @Mapping(source = "id", target = "bucketlistItemId")
    @Mapping(source = "title", target = "bucketlistItemTitle")
    @Mapping(source = "text", target = "bucketlistItemText", qualifiedByName = "bytesToString")
    @Mapping(source = "timestamp", target = "bucketlistItemTimestamp", qualifiedByName = "instantToString")
    BucketlistItemsInfo toBucketlistItemsInfo(Bucketlist bucketlist);

    List<BucketlistItemsInfo> toBucketlistItemsInfos(List<Bucketlist> bucketlistItems);



//    @Mapping(source = "title", target = "title")
//    @Mapping(source = "text", target = "text")
//    @Mapping(source = "timestamp", target = "timestamp")
//    BucketlistDto toBucketlistsDto(Bucketlist bucketlist);

    @Mapping(source = "bucketlistItemTitle", target = "title")
    @Mapping(source = "bucketlistItemText", target = "text", qualifiedByName = "stringToBytes")
    @Mapping(expression = "java(Instant.now())", target = "timestamp")
    Bucketlist toBucketlist(BucketlistItemInfo bucketlistItemInfo);



    @Named("bytesToString")
    static String bytesToString(byte[] bytes) {
        return ByteConverter.byteArrayToString(bytes);
    }
    @Named("instantToString")
    static String instantToString(Instant instant) {
        return InstantConverter.instantToString(instant);
    }
    @Named("stringToBytes")
    static byte[] stringToBytes(String text) {
        return ByteConverter.stringToByteArray(text);
    }

}

//    @Mapping(source = "title", target = "title")
//    @Mapping(source = "text", target = "text")
//    @Mapping(source = "timestamp", target = "timestamp");
//Bucketlists toBucketlistDto();


//String meetod (klass objekt)
//tagastatav tüüp, nimi, parameetrid mis tulevad sisse
//ühe asja teiseks
