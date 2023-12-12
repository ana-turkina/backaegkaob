package ee.valiitit.backaegkaob.domain.location;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class LocationService {
    @Resource
    private LocationRepository locationRepository;

    public void setLocation(Location location) {
        locationRepository.save(location);
    }
}
