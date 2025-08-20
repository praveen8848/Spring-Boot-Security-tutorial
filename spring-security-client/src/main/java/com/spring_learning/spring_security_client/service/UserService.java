package com.spring_learning.spring_security_client.service;

import com.spring_learning.spring_security_client.entity.User;
import com.spring_learning.spring_security_client.entity.VerificationToken;
import com.spring_learning.spring_security_client.model.UserModel;
import com.spring_learning.spring_security_client.repository.UserRepository;

import java.util.Optional;

public interface UserService {
   public  User registerUser(UserModel userModel);

   void saveVerificationTokenForUser(String token, User user);

   String validateVerificationToken(String token);

   VerificationToken generateNewVerificationToken(String oldToken);

   User findByEmail(String email);

   void createPasswordResetTokenForUser(User user, String token);

   String validatePasswordResetToken(String token);

   Optional<User> getUserByPasswordResetToken(String token);

   void changePassword(User user, String newPassword);

   boolean checkIfValidOldPassword(User user, String oldPassword);
}
