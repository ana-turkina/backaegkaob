package ee.valiitit.backaegkaob.domain.userprofile;

import ee.valiitit.backaegkaob.business.userprofile.ProfileInfo;
import ee.valiitit.backaegkaob.util.ImageConverter;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProfileMapper {
    @Mapping(source = "email", target = "userEmail")
    @Mapping(source = "avatar", target = "userAvatar", qualifiedByName = "byteArrayToString")
    ProfileInfo toProfileInfo(Profile profile);

    @Named("byteArrayToString")
    static String byteArrayToString(byte[] bytes) {
        return ImageConverter.byteArrayToString(bytes);
    }
}