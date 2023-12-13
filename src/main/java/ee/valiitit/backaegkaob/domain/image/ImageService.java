package ee.valiitit.backaegkaob.domain.image;

import ee.valiitit.backaegkaob.business.Status;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Resource
    private ImageRepository imageRepository;

    public void saveImage(Image image) {
        imageRepository.save(image);
    }

    public List<Image> getImagesBy(Integer userId) {
        return imageRepository.findImagesBy(userId, Status.ACTIVE);
    }

    public Image getImageBy(Integer userId) {
        return imageRepository.getReferenceById(userId);
    }
    public Image getImageBy(Integer userId, String title) {
      return imageRepository.getImageBy(userId, title);
    };
}
