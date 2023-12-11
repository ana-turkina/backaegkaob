package ee.valiitit.backaegkaob.domain.image;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import ee.valiitit.backaegkaob.util.ImageConverter;
import org.mapstruct.*;
import ee.valiitit.backaegkaob.business.Status;

import java.time.Instant;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        imports = {Instant.class, Status.class})
public interface ImageMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(source = "imageData", target = "file", qualifiedByName = "stringToByteArray")
    @Mapping(expression = "java(Instant.now())", target = "timestamp")
    @Mapping(expression = "java(Status.ACTIVE)", target = "status")

    Image toImage(ImageInfo imageInfo);

    @Named("stringToByteArray")
    static byte[] convertImageDataToByteArray(String imageData) {
        return ImageConverter.stringToByteArray(imageData);
    }

    @Mapping(source = "title", target = "title")
    @Mapping(source = "file", target = "imageData", qualifiedByName = "byteArrayToString")
    @Mapping(source = "status", target = "status")
    ImageInfo toImageInfo(Image image);

    @Named("byteArrayToString")
    static String ByteArrayToString(byte[] bytes) {
        return ImageConverter.byteArrayToString(bytes);
    }

    List<ImageInfo> toImageInfos(List<Image> images);
}