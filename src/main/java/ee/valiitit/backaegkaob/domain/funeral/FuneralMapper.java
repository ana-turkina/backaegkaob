package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.business.funeral.FuneralDto;
import org.mapstruct.*;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface FuneralMapper {
    @Mapping(source = "funeralInstructions", target = "funeralInstructions")
    @Mapping(source = "menüü", target = "menüü")
    @Mapping(source = "skulptuur", target = "skulptuur")
    @Mapping(source = "matusetüüp", target = "matusetüüp")
    @Mapping(source = "hauaplats", target = "hauaplats")
    @Mapping(source = "testament", target = "testament")
    Funeral toFuneral(FuneralDto funeralDto);

    @Mapping(source = "testament", target = "testament")
    @Mapping(source = "funeralInstructions", target = "funeralInstructions")
    @Mapping(source = "hauaplats", target = "hauaplats")
    @Mapping(source = "menüü", target = "menüü")
    @Mapping(source = "matusetüüp", target = "matusetüüp")
    @Mapping(source = "skulptuur", target = "skulptuur")
    FuneralDto toFuneralDto(Funeral funeral);
}