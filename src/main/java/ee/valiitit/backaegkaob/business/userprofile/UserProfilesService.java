package ee.valiitit.backaegkaob.business.userprofile;

import ee.valiitit.backaegkaob.domain.profile.Profile;
import ee.valiitit.backaegkaob.domain.profile.ProfileMapper;
import ee.valiitit.backaegkaob.domain.profile.ProfileService;
import ee.valiitit.backaegkaob.util.ImageConverter;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class UserProfilesService {
    @Resource
    private ProfileService profileService;
    @Resource
    private ProfileMapper profileMapper;

    public ProfileInfo getUserProfile(Integer userId) {
        Profile profile = profileService.getProfileBy(userId);
        return profileMapper.toProfileInfo(profile);
    }

    public void updateUserProfile(Integer userId, ProfileInfo profileInfo) {
        Profile profile = profileService.getProfileBy(userId);
        profile.setEmail(profileInfo.getUserEmail());
        byte[] imageAsBytes = ImageConverter.stringToByteArray(profileInfo.getUserAvatar());
        profile.setAvatar(imageAsBytes);
        profileService.saveProfile(profile);
    }
}
