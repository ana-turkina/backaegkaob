package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.Status;
import ee.valiitit.backaegkaob.business.image.ImageInfo;
import ee.valiitit.backaegkaob.domain.image.Image;
import ee.valiitit.backaegkaob.domain.image.ImageMapper;
import ee.valiitit.backaegkaob.domain.image.ImageService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GalleryService {

    @Resource
    private ImageService imageService;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ImageMapper imageMapper;

//TODO kontrolli, et väljad oleks täidetud.
    public void addImage(Integer userId, ImageInfo imageInfo) {
        User user = userRepository.findUserBy(userId);
        Image image = imageMapper.toImage(imageInfo);
        image.setUser(user);
        imageService.saveImage(image);
    }

    public List<ImageInfo> getImagesBy(Integer userId) {
        List<Image> images = imageService.getImagesBy(userId);
        List<ImageInfo> imageInfoList = imageMapper.toImageInfos(images);
        return imageInfoList;
    }

    public void deleteImageBy(Integer userId, String title) {
        Image image = imageService.getImageBy(userId, title);
        if (image != null) {
            image.setStatus(Status.DELETED);
            imageService.saveImage(image);
        }
    }
}
