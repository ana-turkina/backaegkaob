package ee.valiitit.backaegkaob.business.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemInfo;
import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemsInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryRequest;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;


@RestController
public class BucketlistsController {
    @Resource
    private BucketlistsService bucketlistsService;

    @GetMapping("/before/bucketlist")
    @Operation(
            summary = "Leiab süsteemist kõik kasutaja soovid.",
            description = "Tagastab soovi koos sisu (text), pealkirja (title) ja slavestusajaga (timestamp)")
    public List<BucketlistItemsInfo> getBucketlistItems(@RequestParam Integer userId) {
        return bucketlistsService.getBucketlistItems(userId);
    }


    @PostMapping("/before/bucketlist/items")
    @Operation(summary = "Lisab uue soovi nimekirja")
    public void addBucketlistItem(@RequestBody BucketlistItemInfo bucketlistItemInfo, @RequestParam Integer userId) {
        bucketlistsService.addBucketlistItem(userId, bucketlistItemInfo);
    }
}
