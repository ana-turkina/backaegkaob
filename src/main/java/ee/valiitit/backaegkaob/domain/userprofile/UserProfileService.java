package ee.valiitit.backaegkaob.domain.userprofile;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserProfileService {
    @Resource
    private ProfileRepository profileRepository;

    public Profile getProfileBy(Integer userId) {
        return profileRepository.getProfileBy(userId);

    }
}
