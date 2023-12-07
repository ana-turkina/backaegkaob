package ee.valiitit.backaegkaob.business.bucketlist;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class BucketlistsController {
    @Resource
    private BucketlistsService bucketlistsService;

    @GetMapping ("/before/bucketlist")
    @Operation(
    summary = "Leiab süsteemist kõik kasutaja soovid.",
    description = "Tagastab soovi koos sisu (text), pealkirja (title) ja slavestusajaga (timestamp)")
    public List<Bucketlist> getBucketlistItems() {
        return bucketlistsService.getBucketlistItems();
    }

 @PostMapping("/before/bucketlist")
 public void addBucketlistItem (@RequestBody BucketlistDto bucketlistDto, @RequestParam Integer id,  Integer user_id, String title, String text, LocalDateTime timestamp) {
        bucketlistsService.addBucketlistItem(bucketlistDto);
 }
}


