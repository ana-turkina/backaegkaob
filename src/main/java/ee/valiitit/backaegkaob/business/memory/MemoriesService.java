package ee.valiitit.backaegkaob.business.memory;

import ee.valiitit.backaegkaob.business.memory.dto.MemoryInfo;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryRequest;
import ee.valiitit.backaegkaob.business.memory.dto.MemoryShortInfo;
import ee.valiitit.backaegkaob.domain.memory.Memory;
import ee.valiitit.backaegkaob.domain.memory.MemoryMapper;
import ee.valiitit.backaegkaob.domain.memory.MemoryService;
import ee.valiitit.backaegkaob.domain.user.User;
import ee.valiitit.backaegkaob.domain.user.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemoriesService {
    @Resource
    private MemoryService memoryService;
    @Resource
    private MemoryMapper memoryMapper;
    @Resource
    private UserService userService;

    public MemoryInfo getMemory(Integer memoryId) {
        Memory memory = memoryService.getMemoryBy(memoryId);
        return memoryMapper.toMemoryInfo(memory);
    }

    public List<MemoryShortInfo> getUserMemories(Integer userId) {
        List<Memory> memories = memoryService.getMemoriesBy(userId);
        return memoryMapper.toMemoryShortInfos(memories);
    }

    public void addNewMemory(Integer userId, MemoryRequest memoryRequest) {
        Memory memory = createMemory(userId, memoryRequest);
        memoryService.saveMemory(memory);
    }

    private Memory createMemory(Integer userId, MemoryRequest memoryRequest) {
        User user = userService.getUserBy(userId);
        Memory memory = memoryMapper.toMemory(memoryRequest);
        memory.setUser(user);
        return memory;
    }
}
