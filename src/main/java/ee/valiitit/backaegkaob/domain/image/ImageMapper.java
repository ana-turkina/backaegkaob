//package ee.valiitit.backaegkaob.domain.image;
//
//import ee.valiitit.backaegkaob.business.image.ImageInfo;
//import org.mapstruct.*;
//
//@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
//public interface ImageMapper {
//@Mapping(source = "id", target = "id")
//@Mapping(source = "title", target = "title")
//@Mapping(source = "imageData", target = "file")
//@Mapping(source = "timestamp", target = "timestamp")
//
//    Image toImage(ImageInfo imageInfo);
//
//    ImageInfo toDto(Image image);
//
//    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
//    Image partialUpdate(ImageInfo imageInfo, @MappingTarget Image image);
//}