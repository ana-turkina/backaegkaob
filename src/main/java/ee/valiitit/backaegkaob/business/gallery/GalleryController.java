package ee.valiitit.backaegkaob.business.gallery;

import ee.valiitit.backaegkaob.business.image.ImageInfo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GalleryController {
    @Resource
    private GalleryService galleryService;

    @PostMapping("/gallery")
    @Operation(summary = "Lisab uue pildi koos pealkirjga.")
    public void addImage(@RequestParam Integer userId, @RequestBody ImageInfo imageInfo) {
        galleryService.addImage(userId, imageInfo);
    }

    @GetMapping("/gallery")
    @Operation(summary = "Kuvab pildi koos pealkirjaga.")
    public List<ImageInfo> getImages(@RequestParam Integer userId) {
        return galleryService.getImagesBy(userId);
    }
    @DeleteMapping("/gallery")
    @Operation(summary = "Kustutab pildi maha.")
    public  void deleteImage(@RequestParam Integer userId, @RequestParam String title) {
        galleryService.deleteImageBy(userId, title);
    }

}
