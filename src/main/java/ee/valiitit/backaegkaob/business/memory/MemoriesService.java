package ee.valiitit.backaegkaob.business.memory;

import ee.valiitit.backaegkaob.business.memory.dto.MemoryInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryShortInfo;
import ee.valiitit.backaegkaob.domain.memory.Memory;
import ee.valiitit.backaegkaob.domain.memory.MemoryMapper;
import ee.valiitit.backaegkaob.domain.memory.MemoryService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoriesService {
    @Resource
    private MemoryService memoryService;
    @Resource
    private MemoryMapper memoryMapper;

    public MemoryInfo getMemory(Integer memoryId) {
        Memory memory = memoryService.getMemoryBy(memoryId);
        return memoryMapper.toMemoryInfo(memory);
    }

    public List<MemoryShortInfo> getUserMemories(Integer userId) {
        List<Memory> memories = memoryService.getMemoriesBy(userId);
        return memoryMapper.toMemoryShortInfos(memories);
    }
}
