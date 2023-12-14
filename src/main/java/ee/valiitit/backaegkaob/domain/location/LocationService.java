package ee.valiitit.backaegkaob.domain.location;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    @Resource
    private LocationRepository locationRepository;

    public void setLocation(Location location) {
        locationRepository.save(location);
    }

    public List<Location> findLocationsBy(Integer userId) {
        return locationRepository.findLocationsBy(userId);

    }
}
