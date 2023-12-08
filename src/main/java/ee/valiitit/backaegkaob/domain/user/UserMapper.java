package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.login.LoginResponseDto;
import ee.valiitit.backaegkaob.business.user.dto.RelatedUserRequest;
import ee.valiitit.backaegkaob.business.user.dto.UserRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(source = "id", target = "userId")
    @Mapping(source = "role.name", target = "roleName")
    LoginResponseDto toLoginResponseDto(User user);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(constant = "A", target = "status")
    User toUser(UserRequest userRequest);

    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(constant = "A", target = "status")
    User toUser(RelatedUserRequest relatedUserRequest);
}
