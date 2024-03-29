package ee.valiitit.backaegkaob.domain.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LocationRepository extends JpaRepository<Location, Integer> {

    @Query("select l from Location l where l.user.id = ?1")
    List<Location> findLocationsBy(Integer id);

}