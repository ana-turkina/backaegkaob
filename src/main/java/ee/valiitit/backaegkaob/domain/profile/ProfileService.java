package ee.valiitit.backaegkaob.domain.profile;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    @Resource
    private ProfileRepository profileRepository;

    public Profile getProfileBy(Integer userId) {
        return profileRepository.getProfileBy(userId);

    }

    public void saveProfile(Profile profile) {
        profileRepository.save(profile);
    }
}
