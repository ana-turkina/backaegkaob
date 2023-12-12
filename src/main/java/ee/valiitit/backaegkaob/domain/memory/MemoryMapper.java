package ee.valiitit.backaegkaob.domain.memory;

import ee.valiitit.backaegkaob.business.memory.dto.MemoryInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryShortInfo;
import ee.valiitit.backaegkaob.util.ByteConverter;
import ee.valiitit.backaegkaob.util.InstantConverter;
import org.mapstruct.*;

import java.time.Instant;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface MemoryMapper {

    @Mapping(source = "title", target = "memoryTitle")
    @Mapping(source = "text", target = "memoryText", qualifiedByName = "bytesToString")
    @Mapping(source = "timestamp", target = "memoryTimestamp", qualifiedByName = "instantToString")
    MemoryInfo toMemoryInfo(Memory memory);


    @Mapping(source = "id", target = "memoryId")
    @Mapping(source = "title", target = "memoryTitle")
    @Mapping(source = "timestamp", target = "memoryTimestamp", qualifiedByName = "instantToString")
    MemoryShortInfo toMemoryShortInfo(Memory memory);

    List<MemoryShortInfo> toMemoryShortInfos(List<Memory> memories);

    @Named("bytesToString")
    static String bytesToString(byte[] bytes) {
        return ByteConverter.byteArrayToString(bytes);
    }

    @Named("instantToString")
    static String instantToString(Instant instant) {
        return InstantConverter.instantToString(instant);
    }

}