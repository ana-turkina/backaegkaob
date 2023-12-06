package ee.valiitit.backaegkaob.business.funeral;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FuneralInstructionsController {
    @Resource
    private FuneralInstructionsService funeralInstructionsService;

    @PostMapping("/funeral/instructions")
    public void addFuneralInstructions(@RequestParam Integer userId,  @RequestBody FuneralDto funeralDto) {
        funeralInstructionsService.addFuneralInstructions(userId, funeralDto);
    }
}
