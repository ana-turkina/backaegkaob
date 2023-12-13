package ee.valiitit.backaegkaob.business.memory;

import ee.valiitit.backaegkaob.business.memory.dto.MemoryInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryRequest;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryShortInfo;
import io.swagger.v3.oas.annotations.Operation;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/new-memory")
    @Operation(summary = "Uue mälestuse lisamine.")
    public void addNewMemory(@RequestParam Integer userId, @RequestBody MemoryRequest memoryRequest) {
        memoriesService.addNewMemory(userId, memoryRequest);
    }
}
