package ee.valiitit.backaegkaob.domain.location;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface LocationRepository extends JpaRepository<Location, Integer> {
}