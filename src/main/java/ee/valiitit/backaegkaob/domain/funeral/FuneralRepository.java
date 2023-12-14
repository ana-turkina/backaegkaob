package ee.valiitit.backaegkaob.domain.funeral;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface FuneralRepository extends JpaRepository<Funeral, Integer> {
    @Query("select f from Funeral f where f.user.id = ?1")
    Optional<Funeral> findByUserId(Integer id);

}