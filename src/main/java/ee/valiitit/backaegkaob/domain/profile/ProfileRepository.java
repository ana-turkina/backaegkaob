package ee.valiitit.backaegkaob.domain.profile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    @Query("select p from Profile p where p.user.id = ?1")
    Profile getProfileBy(Integer userId);

}