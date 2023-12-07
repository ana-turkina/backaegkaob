package ee.valiitit.backaegkaob.business.funeral;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuneralInstructionsController {
    @Resource
    private FuneralInstructionsService funeralInstructionsService;

    @PostMapping("/funeral/instructions")
    public void handleAddedImage(@RequestBody FuneralDto funeralDto,  @RequestParam Integer userId) {
        funeralInstructionsService.addFuneralInstructions(funeralDto, userId);
    }

}
