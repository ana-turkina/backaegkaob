package ee.valiitit.backaegkaob.domain.image;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ImageRepository extends JpaRepository<Image, Integer> {
    @Query("select i from Image i where i.user.id = ?1 and i.status = ?2")
    List<Image> findImagesBy(Integer id, String status);


    @Query("select i from Image i where i.user.id = ?1 and i.title = ?2 and i.status = ?3")
    Image getImageBy(Integer id, String title, String status);

}
