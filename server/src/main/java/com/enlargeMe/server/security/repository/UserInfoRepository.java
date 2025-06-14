package com.enlargeMe.server.security.repository;

import com.enlargeMe.server.security.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
    Optional<UserInfo> findByEmail(String email);
    Optional<UserInfo> findByActivationToken(String activationToken);
}
