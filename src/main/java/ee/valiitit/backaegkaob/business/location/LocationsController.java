package ee.valiitit.backaegkaob.business.location;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationsController {
    @Resource
    private LocationsService locationsService;

    @PostMapping("/map")
    public void addLocation(@RequestBody LocationInfo locationInfo, @RequestParam Integer userId) {
        locationsService.addLocation(locationInfo, userId);
    }

    @GetMapping("/map")
    public List<LocationInfo> findLocations(@RequestParam Integer userId) {
        List<LocationInfo> locationInfos = locationsService.findLocations(userId);
        return locationInfos;
    }
}
