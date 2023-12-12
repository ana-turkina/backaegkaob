package ee.valiitit.backaegkaob.business.userprofile;

import ee.valiitit.backaegkaob.domain.userprofile.Profile;
import ee.valiitit.backaegkaob.domain.userprofile.ProfileMapper;
import ee.valiitit.backaegkaob.domain.userprofile.UserProfileService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserProfilesService {
    @Resource
    private UserProfileService userProfileService;
    @Resource
    private ProfileMapper profileMapper;

    public ProfileInfo getUserProfile(Integer userId) {
        Profile profile = userProfileService.getProfileBy(userId);
        return profileMapper.toProfileInfo(profile);
    }
}
