package com.spring_learning.spring_security_client.repository;

import com.spring_learning.spring_security_client.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

@Repository
@ResponseBody
public interface VerificationTokenRepository extends JpaRepository<VerificationToken, Long> {


    VerificationToken findByToken(String token);
}
