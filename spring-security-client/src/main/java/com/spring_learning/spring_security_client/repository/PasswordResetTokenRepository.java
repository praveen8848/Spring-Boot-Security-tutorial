package com.spring_learning.spring_security_client.repository;

import com.spring_learning.spring_security_client.entity.PasswordResetToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken,Long > {
    PasswordResetToken findByToken(String token);
}
