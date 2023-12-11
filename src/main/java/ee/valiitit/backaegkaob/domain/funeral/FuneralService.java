package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.domain.user.UserRepository;
import ee.valiitit.backaegkaob.infrastructure.validation.ValidationService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuneralService {
    @Resource
    private UserRepository userRepository;
    @Resource
    private FuneralRepository funeralRepository;


    public void saveFuneral(Funeral funeral) {

        funeralRepository.save(funeral);
    }

    public Funeral findBy(Integer userId) {
       Optional<Funeral> optionalFuneral = funeralRepository.findById(userId);
        return ValidationService.getExistingFuneralInstructions(optionalFuneral);
    }
}
