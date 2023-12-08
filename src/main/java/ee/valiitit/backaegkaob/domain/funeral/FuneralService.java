package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.domain.user.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FuneralService {
    @Resource
    private UserRepository userRepository;
    @Resource
    private FuneralRepository funeralRepository;


    public void saveFuneral(Funeral funeral) {

        funeralRepository.save(funeral);
    }
}
