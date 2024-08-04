# API Documentation

## Overview

This document provides detailed information about the controllers in the application. Each controller manages specific types of requests related to user data, including certifications, contacts, education, experience, projects, social media, and user details.

## Table of Contents

1. [Certificate Controller](#certificate-controller)
2. [Contact Controller](#contact-controller)
3. [Education Controller](#education-controller)
4. [Experience Controller](#experience-controller)
5. [Project Skill Controller](#project-skill-controller)
6. [Social Media Controller](#social-media-controller)
7. [User Details Controller](#user-details-controller)

## Certificate Controller

### Class: `CertificateCntrl`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `CertificationSvcInterface`

### Endpoints

#### GET /certificate/all/{userId}

- **Description:** Retrieves all certifications associated with a specific user.
- **Path Variable:**
  - `userId` (int): The ID of the user.
- **Responses:**
  - **200 OK:** Successfully retrieves the list of certifications.
  - **404 Not Found:** No certifications found for the given user ID.
  - **500 Internal Server Error:** An error occurred on the server.

## Contact Controller

### Class: `ContactCntrl`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `ContactSvcInterface`

### Endpoints

#### GET /contact/all/{userId}

- **Description:** Retrieves all contacts for a specific user.
- **Path Variable:**
  - `userId` (int): The ID of the user.
- **Responses:**
  - **200 OK:** Successfully retrieves the list of contacts.
  - **404 Not Found:** No contacts found for the given user ID.
  - **500 Internal Server Error:** An error occurred on the server.

## Education Controller

### Class: `EducationCntrl`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `EducationSvcInterface`

### Endpoints

#### GET /edu/all/{userId}

- **Description:** Retrieves all education records for a specific user.
- **Path Variable:**
  - `userId` (int): The ID of the user.
- **Responses:**
  - **200 OK:** Successfully retrieves the list of education records.
  - **404 Not Found:** No education records found for the given user ID.
  - **500 Internal Server Error:** An error occurred on the server.

## Experience Controller

### Class: `ExperienceCntrl`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `ExperienceSvcInterface`

### Endpoints

#### GET /exp/all/{companyName}

- **Description:** Retrieves all experience records related to a specific company.
- **Path Variable:**
  - `companyName` (String): The name of the company.
- **Responses:**
  - **200 OK:** Successfully retrieves the list of experience records.
  - **404 Not Found:** No experience records found for the given company name.
  - **500 Internal Server Error:** An error occurred on the server.

## Project Skill Controller

### Class: `ProjectSkillController`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `ProjectSkillSvcInterface`

### Endpoints

#### GET /getProjects/getDetails/{projectId}

- **Description:** Retrieves details of a specific project.
- **Path Variable:**
  - `projectId` (int): The ID of the project.
- **Responses:**
  - **200 OK:** Successfully retrieves the project details.
  - **404 Not Found:** No project details found for the given project ID.
  - **500 Internal Server Error:** An error occurred on the server.

## Social Media Controller

### Class: `SocialMediaCntrl`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `SocialMediaSvcInterface`

### Endpoints

#### GET /socialmedia/platform/{platformName}

- **Description:** Retrieves social media data for a specific platform.
- **Path Variable:**
  - `platformName` (String): The name of the social media platform.
- **Responses:**
  - **200 OK:** Successfully retrieves the social media data for the platform.
  - **404 Not Found:** No data found for the given platform.
  - **500 Internal Server Error:** An error occurred on the server.

#### GET /socialmedia/all/{userId}

- **Description:** Retrieves all social media records for a specific user.
- **Path Variable:**
  - `userId` (int): The ID of the user.
- **Responses:**
  - **200 OK:** Successfully retrieves the list of social media records.
  - **404 Not Found:** No social media records found for the given user ID.
  - **500 Internal Server Error:** An error occurred on the server.

## User Details Controller

### Class: `UserDetailsController`

- **Package:** `com.rishabh.main.controller`
- **Service Interface:** `UserDetailsSvcInterface`

### Endpoints

#### GET /user-details/getUser/{userId}

- **Description:** Retrieves details of a specific user.
- **Path Variable:**
  - `userId` (int): The ID of the user.
- **Responses:**
  - **200 OK:** Successfully retrieves the user details.
  - **404 Not Found:** No user found for the given user ID.
  - **500 Internal Server Error:** An error occurred on the server.

## Usage

1. **Start the Spring Boot application.**
2. **Access the endpoints using a REST client such as Postman, or via `curl`.** For example:
   ```sh
   curl -X GET http://localhost:8080/certificate/all/123
   ```
3. **Ensure that the corresponding service interfaces are correctly implemented and configured.**

## Error Handling

- **Validation Errors:** Ensure that path variables provided in requests are valid and conform to expected formats.
- **Service Errors:** Any issues within the service layer will result in appropriate error messages with a `500` status code.

## Notes

- The response format and error messages may vary based on the implementation details of each service interface and error handling in the application.
- Comprehensive exception handling and logging should be implemented to provide clear and meaningful error responses.

## List of Controllers
Certainly! Here's a simple tabular list of fully qualified URLs for all the controllers with `userId` set to `1`:

| **Controller**                | **Description**                            | **Fully Qualified URL**                           |
|-------------------------------|--------------------------------------------|---------------------------------------------------|
| **Certificate Controller**    | Get All Certifications for a User          | `http://localhost:8080/certificate/all/1`         |
| **Contact Controller**        | Get All Contacts for a User                | `http://localhost:8080/contact/all/1`             |
| **Education Controller**      | Get All Education Records for a User       | `http://localhost:8080/edu/all/1`                 |
| **Experience Controller**     | Get All Experience Records by Company      | `http://localhost:8080/exp/all/TechCorp`          |
| **Project Skill Controller**  | Get Project Details                       | `http://localhost:8080/getProjects/getDetails/1` |
| **Social Media Controller**   | Get Social Media Data by Platform          | `http://localhost:8080/socialmedia/platform/Twitter` |
| **Social Media Controller**   | Get All Social Media Records for a User    | `http://localhost:8080/socialmedia/all/1`         |
| **User Details Controller**   | Get User Details                           | `http://localhost:8080/user-details/getUser/1`    |

This table lists each controller, a brief description of the endpoint, and the fully qualified URL with `userId` set to `1` where applicable. For endpoints that don't use `userId`, such as the Experience Controller or Social Media by Platform, example values are provided.
---

This README provides a structured and detailed overview of all the controllers in your application. Adjust or expand the documentation as necessary to match any additional specifics or requirements.
