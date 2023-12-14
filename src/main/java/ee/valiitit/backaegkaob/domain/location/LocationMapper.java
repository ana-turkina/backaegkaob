package ee.valiitit.backaegkaob.domain.location;

import ee.valiitit.backaegkaob.business.Status;
import ee.valiitit.backaegkaob.business.image.ImageInfo;
import ee.valiitit.backaegkaob.business.location.LocationInfo;
import ee.valiitit.backaegkaob.domain.image.Image;
import org.mapstruct.*;

import java.time.Instant;
import java.util.List;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        imports = {Instant.class, Status.class})

public interface LocationMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(expression = "java(Instant.now())", target = "timestamp")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longtitude", target = "longtitude")
    Location toLocation(LocationInfo locationInfo);


    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longtitude", target = "longtitude")

    LocationInfo toLocationInfo(Location location);

    List<LocationInfo> toLocationInfos(List<Location> locations);


}