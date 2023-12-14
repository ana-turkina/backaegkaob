package ee.valiitit.backaegkaob.business.location;

import ee.valiitit.backaegkaob.domain.location.Location;
import ee.valiitit.backaegkaob.domain.location.LocationMapper;
import ee.valiitit.backaegkaob.domain.location.LocationService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationsService {
    @Resource
    private LocationMapper locationMapper;
    @Resource
    private UserRepository userRepository;
    @Resource
    private LocationService locationService;

    public void addLocation(LocationInfo locationInfo, Integer userId) {
        User user = userRepository.findUserBy(userId);
        Location location = locationMapper.toLocation(locationInfo);
        location.setUser(user);
        locationService.setLocation(location);
    }

    public List<LocationInfo> findLocations(Integer userId) {
        List<Location> locations = locationService.findLocationsBy(userId);
        List<LocationInfo> locationInfos = locationMapper.toLocationInfos(locations);
        return locationInfos;
    }
}
