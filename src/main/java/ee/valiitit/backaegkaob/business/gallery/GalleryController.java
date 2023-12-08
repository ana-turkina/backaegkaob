package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class GalleryController {
    @Resource
    private GalleryService galleryService;

    @PostMapping("/gallery")
    public void addImage(@RequestParam Integer userId, @RequestBody ImageInfo imageInfo) {
        galleryService.addImage(userId, imageInfo);
    }

    @GetMapping("/gallery")
    public void getImages(@RequestParam Integer userId) {
        galleryService.getImagesBy(userId);
    }
}
