package ee.valiitit.backaegkaob.domain.memory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MemoryRepository extends JpaRepository<Memory, Integer> {
    @Query("select m from Memory m where m.users.id = ?1 order by m.timestamp DESC")
    List<Memory> findMemoriesBy(Integer userId);

}