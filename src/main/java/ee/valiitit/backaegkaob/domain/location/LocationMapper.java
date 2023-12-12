package ee.valiitit.backaegkaob.domain.location;

import ee.valiitit.backaegkaob.business.Status;
import ee.valiitit.backaegkaob.business.location.LocationInfo;
import org.mapstruct.*;

import java.time.Instant;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        imports = {Instant.class, Status.class})

public interface LocationMapper {

    @Mapping(source = "title", target = "title")
    @Mapping(expression = "java(Instant.now())", target = "timestamp")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "latitude", target = "latitude")
    @Mapping(source = "longtitude", target = "longtitude")
    Location toLocation(LocationInfo locationInfo);

    LocationInfo toLocationInfo(Location location);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Location partialUpdate(LocationInfo locationInfo, @MappingTarget Location location);
}