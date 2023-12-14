package ee.valiitit.backaegkaob.business.location;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationsController {
    @Resource
    private LocationsService locationsService;

    @PostMapping("/map")
    @Operation(summary = "Lisab uue koha kaardi peale.")
    public void addLocation(@RequestBody LocationInfo locationInfo, @RequestParam Integer userId) {
        locationsService.addLocation(locationInfo, userId);
    }

    @GetMapping("/map")
    @Operation(summary = "Kuvab salvestatud koha kaardil.")
    public List<LocationInfo> findLocations(@RequestParam Integer userId) {
        List<LocationInfo> locationInfos = locationsService.findLocations(userId);
        return locationInfos;
    }
}
