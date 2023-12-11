package ee.valiitit.backaegkaob.business.funeral;

import ee.valiitit.backaegkaob.domain.funeral.Funeral;
import ee.valiitit.backaegkaob.domain.funeral.FuneralService;
import ee.valiitit.backaegkaob.domain.funeral.FuneralMapper;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FuneralInstructionsService {
    @Resource
    private FuneralService funeralService;
    @Resource
    private UserService userService;
    @Resource
    private FuneralMapper funeralMapper;

    public void addFuneralInstructions(FuneralDto funeralDto, Integer userId) {
        Funeral funeral = createFuneral(funeralDto, userId);
        funeralService.saveFuneral(funeral);
    }

    private Funeral createFuneral(FuneralDto funeralDto, Integer userId) {
        User user = userService.getUserBy(userId);
        Funeral funeral = funeralMapper.toFuneral(funeralDto);
        funeral.setUser(user);
        return funeral;

    }


    public FuneralDto findFuneralInstructions(Integer userId) {
       Funeral funeral = funeralService.findBy(userId);
        return funeralMapper.toFuneralDto(funeral);
    }
}
