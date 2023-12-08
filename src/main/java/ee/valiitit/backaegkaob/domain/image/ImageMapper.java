package ee.valiitit.backaegkaob.domain.image;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import ee.valiitit.backaegkaob.util.ImageConverter;
import org.mapstruct.*;

import java.time.Instant;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        imports = {Instant.class})
public interface ImageMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(source = "imageData", target = "file", qualifiedByName = "stringToByteArray")
    @Mapping(expression = "java(Instant.now())", target = "timestamp")
    Image toImage(ImageInfo imageInfo);

    @Named("stringToByteArray")
    static byte[] convertImageDataToByteArray(String imageData) {
        return ImageConverter.stringToByteArray(imageData);
    }


}