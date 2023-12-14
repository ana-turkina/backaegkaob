package ee.valiitit.backaegkaob.domain.bucketlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BucketlistRepository extends JpaRepository<Bucketlist, Integer> {
    @Query("select b from Bucketlist b where b.user.id = ?1 order by b.timestamp")
    List<Bucketlist> findBucketlistItemsBy(Integer userId);

}