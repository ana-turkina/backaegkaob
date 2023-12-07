package ee.valiitit.backaegkaob.business.funeral;

import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import ee.valiitit.backaegkaob.domain.funeral.FuneralInstructionService;
import ee.valiitit.backaegkaob.domain.funeral.FuneralMapper;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class FuneralInstructionsService {
    @Resource
    private FuneralInstructionService funeralInstructionService;
    @Resource
    private UserService userService;
    @Resource
    private FuneralMapper funeralMapper;

    public void addFuneralInstructions(FuneralDto funeralDto, Integer userId) {
        Funeral funeral = createFuneral(funeralDto, userId);
        funeralInstructionService.saveFuneralInstructions(funeral);
    }

    private Funeral createFuneral(FuneralDto funeralDto, Integer userId) {
        User user = userService.getUserBy(userId);
        Funeral funeral = funeralMapper.toFuneral(funeralDto);
        funeral.setUser(user);
        return funeral;

    }


}
