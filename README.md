User Authentication & Authorization System

This project is a Spring Boot based Authentication and Authorization System that implements User Registration,
Email Verification, Password Management, and OAuth2 Authorization/Client Flows.

It covers everything from basic registration to advanced Spring Security and OAuth2.0 implementation.

🚀 Features

✅ User Registration with API

✅ Email Verification with Token

✅ Token Management (Save, Verify, Expire)

✅ Resend Verification Email

✅ Reset & Change Password

✅ Spring Security Integration

✅ OAuth 2.0 Concepts & Flows

✅ Authorization Server Implementation

✅ OAuth Client Implementation

🛠️ Tech Stack

Java

Spring Boot

Spring Security

Spring Authorization Server

MySQL / PostgreSQL (or any SQL DB)

Maven

Java Mail Sender


🔑 How It Works

User registers → Verification email with token is sent.

User verifies email → Account is activated.

Password Reset & Change → Secure flow using tokens.

OAuth2.0 Implementation → Secure resource access using Authorization Server & Client.

📖 Learning Outcomes

Deep understanding of Spring Security

Implementation of token-based authentication

Email event-driven workflows in Spring Boot

OAuth 2.0 and its real-world flows (Authorization Code, Client Credentials, etc.)

📡 API Endpoints
🔐 Authentication & Registration
Method	Endpoint	Description	Request Body
POST	/api/register	Register a new user	{ "email": "user@example.com", "password": "123456" }
GET	/api/verify?token={token}	Verify email using token	-
POST	/api/resend-verification	Resend verification email	{ "email": "user@example.com" }


🔑 Password Management
Method	Endpoint	Description	Request Body
POST	/api/reset-password	Request reset password link	{ "email": "user@example.com" }
POST	/api/save-password	Save new password after reset	{ "token": "resetToken", "newPassword": "newPass123" }
POST	/api/change-password	Change password for logged-in user	{ "oldPassword": "123456", "newPassword": "newPass123" }


🔒 OAuth 2.0
Method	Endpoint	Description
POST	/oauth2/token	Get access token
GET	/oauth2/authorize	Authorization endpoint
