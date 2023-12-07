package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.business.funeral.FuneralDto;
import org.mapstruct.*;



@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface FuneralMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "funeralInstructions", target = "funeralInstructions")
    Funeral toFuneral(FuneralDto funeralDto);


    FuneralDto toFuneralDto(Funeral funeral);

}