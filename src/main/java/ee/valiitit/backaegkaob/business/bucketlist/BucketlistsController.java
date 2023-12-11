package ee.valiitit.backaegkaob.business.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    public void getBucketlistItems(@RequestParam Integer userId) {
        bucketlistsService.getBucketlistItems(userId);


    }

 @PostMapping("/before/bucketlist")
 public void addBucketlistItem (@RequestBody BucketlistDto bucketlistDto, @RequestParam Integer id,  Integer user_id, String title, String text, LocalDateTime timestamp) {
        bucketlistsService.addBucketlistItem(bucketlistDto);
 }
}

//    @PostMapping("/location")
//    @Operation(summary = "Lisab uue pangaautomaadi asukoha andmed.", description = "Kui imageData on tühi string, siis pilti ei lisata.")
//    @ApiResponses(value = {
//            @ApiResponse(responseCode = "200", description = "OK"),
//            @ApiResponse(responseCode = "403", description = "Sellise nimega pangaautomaadi asukoht on juba olemas.", content = @Content(schema = @Schema(implementation = ApiError.class)))})
//    public void addAtmLocation(@RequestBody LocationInfo locationInfo) {
//        locationsService.addAtmLocation(locationInfo);
//    }
