package ee.valiitit.backaegkaob.domain.user;


import ee.valiitit.backaegkaob.business.login.LoginResponseDto;

public interface UserMapper {

    LoginResponseDto toLoginResponseDto(User user);
}
