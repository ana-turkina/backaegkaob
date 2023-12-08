package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import ee.valiitit.backaegkaob.domain.image.Image;
import ee.valiitit.backaegkaob.domain.image.ImageMapper;
import ee.valiitit.backaegkaob.domain.image.ImageService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserRepository;
import ee.valiitit.backaegkaob.util.ImageConverter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class GalleryService {

    @Resource
    private ImageService imageService;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ImageMapper imageMapper;


    public void addImage(Integer userId, ImageInfo imageInfo) {
        User user = userRepository.findUserBy(userId);
        Image image = imageMapper.toImage(imageInfo);
        image.setUser(user);
        imageService.saveImage(image);
    }
}
