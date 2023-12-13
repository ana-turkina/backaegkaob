package ee.valiitit.backaegkaob.business.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemInfo;
import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemsInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryRequest;
import ee.valiitit.backaegkaob.domain.bucketlist.Bucketlist;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistMapper;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistService;
import ee.valiitit.backaegkaob.domain.memory.Memory;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BucketlistsService {
    @Resource
    private BucketlistService bucketlistService;
    @Resource
    private UserService userService;
    @Resource
    private BucketlistMapper bucketlistMapper;


    public List<BucketlistItemsInfo> getBucketlistItems(Integer userId) {
        List<Bucketlist> bucketlistItems = bucketlistService.findAllBucketlistItemsBy(userId);
        return bucketlistMapper.toBucketlistItemsInfos(bucketlistItems);
    }

    public void addBucketlistItem (Integer userId, BucketlistItemInfo bucketlistItemInfo) {
        Bucketlist bucketlist = createBucketlistItem(userId, bucketlistItemInfo);
        bucketlistService.saveBucketlistItem(bucketlist);
    }

    private Bucketlist createBucketlistItem(Integer userId, BucketlistItemInfo bucketlistItemInfo) {
        User user = userService.getUserBy(userId);
        Bucketlist bucketlist = bucketlistMapper.toBucketlist (bucketlistItemInfo);
                bucketlist.setUser(user);
        return bucketlist;
    }


}


//    List<BucketlistDto> bucketlistDtoList = new ArrayList<>();
//        for (Bucketlist bucketlist : bucketlists) {
//            BucketlistDto bucketlistsDto = bucketlistMapper.toBucketlistsDto(bucketlist);
//            bucketlistDtoList.add(bucketlistsDto);




