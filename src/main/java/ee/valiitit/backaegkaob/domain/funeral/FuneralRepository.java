package ee.valiitit.backaegkaob.domain.funeral;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface FuneralRepository extends JpaRepository<Funeral, Integer> {

}