package ee.valiitit.backaegkaob.business.bucketlist;


import ee.valiitit.backaegkaob.business.funeral.FuneralDto;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistMapper;
import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class BucketlistsService {
    @Resource
    private BucketlistService bucketlistService;
    @Resource
    private UserService userService;
  @Resource
  private BucketlistMapper bucketlistMapper;

public List<Bucketlist> ??? = bucketlistService.findAllBucketlistItems();
return bucketlistMapper.to  (items)
   public void addBucketlistItem (BucketlistDto bucketlistDto) {
bucketlistService.saveBucketlistItem ();
   }
}



//
//    public List<CityInfo> getCities() {
//        List<City> cities = cityService.findAllCities();
//        return cityMapper.toCityInfos(cities);
//    }
//}





