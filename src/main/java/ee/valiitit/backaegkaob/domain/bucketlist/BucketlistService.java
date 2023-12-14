package ee.valiitit.backaegkaob.domain.bucketlist;


import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BucketlistService {
    @Resource
    private BucketlistRepository bucketlistRepository;

    public List<Bucketlist> findAllBucketlistItemsBy(Integer userId) {
        return bucketlistRepository.findBucketlistItemsBy(userId);
    }

    public void saveBucketlistItem(Bucketlist bucketlist) {
        bucketlistRepository.save(bucketlist);
    }
}

