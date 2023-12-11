package ee.valiitit.backaegkaob.business.funeral;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuneralInstructionsController {
    @Resource
    private FuneralInstructionsService funeralInstructionsService;

    @PostMapping("/funeral/instructions")
    public void addFuneralInstructions(@RequestBody FuneralDto funeralDto,  @RequestParam Integer userId) {
        funeralInstructionsService.addFuneralInstructions(funeralDto, userId);

    }
    @GetMapping("funeral/instructions")
    public FuneralDto findFuneralInstructions(@RequestParam Integer userId) {
        return funeralInstructionsService.findFuneralInstructions(userId);
    }

}
