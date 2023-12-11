package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GalleryController {
    @Resource
    private GalleryService galleryService;

    @PostMapping("/gallery")
    public void addImage(@RequestParam Integer userId, @RequestBody ImageInfo imageInfo) {
        galleryService.addImage(userId, imageInfo);
    }

    @GetMapping("/gallery")
    public List<ImageInfo> getImages(@RequestParam Integer userId) {
        return galleryService.getImagesBy(userId);
    }
    @DeleteMapping("/gallery")
    public  void deleteImage(@RequestParam Integer userId, @RequestParam String title) {
        galleryService.deleteImageBy(userId, title);
    }

}
