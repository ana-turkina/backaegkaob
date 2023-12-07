package ee.valiitit.backaegkaob.business.bucketlist;


import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BucketlistsService {
    @Resource
    private BucketlistService bucketlistService;
    @Resource
    private UserService userService;
//    @Resource
//    private mapper

   public void addBucketlistItem () {

   }

}
//@Service
//public class CitiesService {
//
//    @Resource
//    private CityService cityService;
//
//    @Resource
//    private CityMapper cityMapper;
//
//    public List<CityInfo> getCities() {
//        List<City> cities = cityService.findAllCities();
//        return cityMapper.toCityInfos(cities);
//    }
//}






//
//    public void addFuneralInstructions(FuneralDto funeralDto, Integer userId) {
//        Funeral funeral = createFuneral(funeralDto, userId);
//        funeralInstructionService.saveFuneralInstructions(funeral);
//    }
//
//    private Funeral createFuneral(FuneralDto funeralDto, Integer userId) {
//        User user = userService.getUserBy(userId);
//        Funeral funeral = funeralMapper.toFuneral(funeralDto);
//        funeral.setUser(user);
//        return funeral;
//    }