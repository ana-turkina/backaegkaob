package ee.valiitit.backaegkaob.domain.image;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Resource
    private ImageRepository imageRepository;

    public void saveImage(Image image) {
        imageRepository.save(image);
    };

    public List<Image> getImagesBy(Integer userId) {
        return imageRepository.findImagesBy(userId);

    }
}
