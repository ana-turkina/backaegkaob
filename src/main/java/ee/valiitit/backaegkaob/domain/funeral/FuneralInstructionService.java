package ee.valiitit.backaegkaob.domain.funeral;

import ee.valiitit.backaegkaob.business.funeral.FuneralDto;
import ee.valiitit.backaegkaob.domain.user.UserRepository;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FuneralInstructionService {
    @Resource
    private UserRepository userRepository;
    private final FuneralRepository funeralRepository;

    public FuneralInstructionService(FuneralRepository funeralRepository) {
        this.funeralRepository = funeralRepository;
    }

    public void saveFuneralInstructions(Funeral funeral) {
        funeralRepository.save(funeral);


    }
}
