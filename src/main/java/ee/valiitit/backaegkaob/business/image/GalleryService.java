package ee.valiitit.backaegkaob.business.image;

import ee.valiitit.backaegkaob.domain.image.Image;
import ee.valiitit.backaegkaob.domain.image.ImageService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserRepository;
import ee.valiitit.backaegkaob.util.ImageConverter;
import jakarta.annotation.Resource;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {
    @Resource
    private ImageService imageService;
    @Resource
    private UserRepository userRepository;


    public void handleAddedImage(ImageInfo imageInfo, Integer userId) {
        User user = userRepository.findUserBy(userId);
        Image image = ImageConverter.stringToImage(imageInfo.getImageData(), userId);
        image.setUser(user);
        imageService.saveImage(image);





    }
}
