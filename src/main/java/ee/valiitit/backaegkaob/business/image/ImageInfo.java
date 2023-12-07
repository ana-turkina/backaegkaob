package ee.valiitit.backaegkaob.business.image;

import ee.valiitit.backaegkaob.domain.image.Image;
import ee.valiitit.backaegkaob.domain.image.UserInfo;

import java.time.Instant;

/**
 * Projection for {@link Image}
 */
public interface ImageInfo {
    Integer getId();

    String getTitle();

    byte[] getFile();

    Instant getTimestamp();

    UserInfo getUser();
}