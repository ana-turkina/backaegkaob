package ee.valiitit.backaegkaob.business.image;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GalleryController {
    @Resource
    private GalleryService galleryService;

    @PostMapping("/gallery")
    public void addImageToDataBase(@RequestBody ImageInfo imageInfo, @RequestParam Integer userId) {
        galleryService.addImageToDataBase(imageInfo, userId);
    }
}
