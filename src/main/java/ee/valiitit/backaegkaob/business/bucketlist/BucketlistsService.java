package ee.valiitit.backaegkaob.business.bucketlist;


import ee.valiitit.backaegkaob.business.bucketlist.dto.BucketlistItemInfo;
import ee.valiitit.backaegkaob.business.funeral.FuneralDto;
import ee.valiitit.backaegkaob.domain.bucketlist.Bucketlist;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistMapper;
import ee.valiitit.backaegkaob.domain.bucketlist.BucketlistService;
import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
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


    public void getBucketlistItems(Integer userId) {
        List<Bucketlist> bucketlists = bucketlistService.findAllBucketlistItemsBy(userId);



        List<BucketlistDto> bucketlistDtoList = new ArrayList<>();
        for (Bucketlist bucketlist : bucketlists) {
            BucketlistDto bucketlistsDto = bucketlistMapper.toBucketlistsDto(bucketlist);
            bucketlistDtoList.add(bucketlistsDto);

        }


    }

    public void addBucketlistItem(BucketlistDto bucketlistDto) {
        bucketlistService.saveBucketlistItem();
    }

    }



