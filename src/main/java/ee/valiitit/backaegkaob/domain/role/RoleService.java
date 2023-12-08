package ee.valiitit.backaegkaob.domain.role;

import ee.valiitit.backaegkaob.domain.role.Role;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;


    public Role getRoleCustomer() {
        return roleRepository.getReferenceById(2);
    }


    public Role getRoleFriend() {
        return roleRepository.getRoleBy("friend");
    }
}
