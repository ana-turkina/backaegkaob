package ee.valiitit.backaegkaob.business.funeral;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

@RestController
public class FuneralInstructionsController {
    @Resource
    private FuneralInstructionsService funeralInstructionsService;

    @PostMapping("/funeral/instructions")
    @Operation(summary = "Lisab uusi matusesoove.")
    public void addFuneralInstructions(@RequestBody FuneralDto funeralDto,  @RequestParam Integer userId) {
        funeralInstructionsService.addFuneralInstructions(funeralDto, userId);

    }
    @GetMapping("funeral/instructions")
    @Operation(summary = "Kuvab salvestatud matusesoove.")
    public FuneralDto findFuneralInstructions(@RequestParam Integer userId) {
        System.out.println("GET findFuneralInstructions called");
        return funeralInstructionsService.findFuneralInstructions(userId);
    }
    @DeleteMapping("/funeral/instructions")
    @Operation(summary = "Kustutab matusesoove maha.")
    public void deleteFuneralInstructions(@RequestParam Integer userId) {
        System.out.println("DELETE " + userId);
        funeralInstructionsService.deleteFuneralInstructions(userId);

    }

}
