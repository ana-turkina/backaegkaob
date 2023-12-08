package ee.valiitit.backaegkaob.domain.bucketlist;


import jakarta.annotation.Resource;

import java.util.List;

public class BucketlistService {
    @Resource
    private BucketlistRepository bucketlistRepository;

    public List<Bucketlist> findAllBucketlistItemsBy(Integer userId) {
        List<Bucketlist> bucketlists = bucketlistRepository.findBuckelistsBy(userId);
        return bucketlists;
    }
}
