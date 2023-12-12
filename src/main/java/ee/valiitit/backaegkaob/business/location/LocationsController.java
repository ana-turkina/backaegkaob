package ee.valiitit.backaegkaob.business.location;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationsController {
    @Resource
    private LocationsService locationsService;

    @PostMapping("/map")
    public void addLocation(@RequestBody LocationInfo locationInfo, @RequestParam Integer userId) {
        locationsService.addLocation(locationInfo, userId);

    }


}
