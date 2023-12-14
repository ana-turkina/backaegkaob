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
        System.out.println("findBy called");
        Optional<Funeral> optionalFuneral = funeralRepository.findByUserId(userId);
        System.out.println("optionalFuneral isEmpty = " + optionalFuneral.isEmpty());
        return ValidationService.getExistingFuneralInstructions(optionalFuneral);
    }

    public void deleteBy(Integer funeralId) {
        funeralRepository.deleteById(funeralId);
    }
}
