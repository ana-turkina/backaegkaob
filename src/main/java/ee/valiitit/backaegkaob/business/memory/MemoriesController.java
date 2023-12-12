package ee.valiitit.backaegkaob.business.memory;

import ee.valiitit.backaegkaob.business.memory.dto.MemoryInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryShortInfo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemoriesController {
    @Resource
    private MemoriesService memoriesService;

    @GetMapping("/memory")
    @Operation(summary = "Tagastab mälestuse, selle pealkirja, sisu ja timestamp.")
    public MemoryInfo getMemory(@RequestParam Integer memoryId) {
        return memoriesService.getMemory(memoryId);
    }

    @GetMapping("/memories")
    @Operation(summary = "Tagastab mälestused, selle pealkirja ja timestamp.")
    public List<MemoryShortInfo> getUserMemories(@RequestParam Integer userId) {
        return memoriesService.getUserMemories(userId);
    }
}
