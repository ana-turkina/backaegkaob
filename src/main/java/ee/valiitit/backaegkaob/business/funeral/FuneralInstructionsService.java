package ee.valiitit.backaegkaob.business.funeral;

import ee.valiitit.backaegkaob.domain.funeral.FuneralInstructionService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FuneralInstructionsService {
    @Resource
    private FuneralInstructionService funeralInstructionService;
    public void addFuneralInstructions(Integer userId, FuneralDto funeralDto) {
        System.out.println("eü");



    }
}
