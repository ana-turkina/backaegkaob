package ee.valiitit.backaegkaob.domain.image;

/**
 * Projection for {@link ee.valiitit.backaegkaob.domain.user.User}
 */
public interface UserInfo {
    Integer getId();

    String getEmail();

    String getPassword();

    String getStatus();
}