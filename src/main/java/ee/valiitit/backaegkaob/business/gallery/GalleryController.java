package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
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
    public void addImage(@RequestParam Integer userId, @RequestBody ImageInfo imageInfo) {
        galleryService.addImage(userId, imageInfo);
    }
}
