package ee.valiitit.backaegkaob.business.bucketlist;

import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemsInfo;
import ee.valiitit.backaegkaob.domain.bucketlist.Bucketlist;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistMapper;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistService;
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



//        List<BucketlistDto> bucketlistDtoList = new ArrayList<>();
//        for (Bucketlist bucketlist : bucketlists) {
//            BucketlistDto bucketlistsDto = bucketlistMapper.toBucketlistsDto(bucketlist);
//            bucketlistDtoList.add(bucketlistsDto);

        }

    }

    public void addBucketlistItem(BucketlistDto bucketlistDto) {
        bucketlistService.saveBucketlistItem(bucketlist);

//     dto entityks
        // bucketlistMapper? - bucketlistDto
//
//        private Bucketlist oBucketlist(BucketlistDto bucketlistDto) {
//            Bucketlist bucketlist = new Bucketlist();
//            // Set properties based on BucketlistDto
//            bucketlist.setId(bucketlistDto.getId());
//            bucketlist.setUser_id(bucketlistDto.getUser_id());
//            bucketlist.setTitle(bucketlistDto.getTitle());
//            bucketlist.setText(bucketlistDto.getText());
//            bucketlist.setTimestamp(bucketlistDto.getTimestamp());
//            // Set other properties as needed
//
//            return bucketlist;
//    }
}

    
    



