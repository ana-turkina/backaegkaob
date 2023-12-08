package ee.valiitit.backaegkaob.domain.role;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;

    public Role getRoleCustomer() {
        return roleRepository.getRoleBy("customer");
    }


    public Role getRoleFriend() {
        return roleRepository.getRoleBy("friend");
    }
}
