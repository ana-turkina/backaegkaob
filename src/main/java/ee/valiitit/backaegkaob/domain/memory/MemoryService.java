package ee.valiitit.backaegkaob.domain.memory;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoryService {
    @Resource
    private MemoryRepository memoryRepository;

    public Memory getMemoryBy(Integer memoryId) {
        return memoryRepository.getReferenceById(memoryId);
    }

    public List<Memory> getMemoriesBy(Integer userId) {
        return memoryRepository.findMemoriesBy(userId);
    }

    public void saveMemory(Memory memory) {
        memoryRepository.save(memory);
    }
}
