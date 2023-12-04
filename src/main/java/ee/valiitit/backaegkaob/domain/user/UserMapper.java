package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.login.LoginResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    LoginResponseDto toLoginResponseDto(User user);
}
