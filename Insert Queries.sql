INSERT INTO user_details (username, password_hash, email, full_name, bio, avatar_url, created_at)
VALUES ('rishabhtiwari', 'password@123', 'onlinestuff.rishabh@gmail.com', 'Rishabh Tiwari', 'Passionate about technology and learning new things.', 'https://example.com/avatar.jpg', CURRENT_TIMESTAMP);


INSERT INTO Experience (user_id, title, company, location, start_date, end_date, description, currently_working)
VALUES (1, 'Software Engineer', 'Mindgate Solutions LTD.', 'Chennai',TO_DATE('01-04-2024', 'DD-MM-YYYY'), NULL, 'Developed web applications using React and Node.js', 'true');

-- You can adjust the values as per your specific data.

INSERT INTO Education (user_id, institution, degree, field_of_study, start_date, end_date, description, created_at, updated_at)
VALUES (1, 'Dr. MGR University', 'Bachelor of Technology', 'Computer Science Engineering',TO_DATE('01-09-2019', 'DD-MM-YYYY') , TO_DATE('01-05-2023', 'DD-MM-YYYY'), 'Graduated with honors', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Adjust the values based on your educational background.
INSERT INTO Project (user_id, title, description, start_date, end_date, url, created_at, updated_at)
VALUES (1, 'E-commerce Website', 'Built a fully functional e-commerce platform using Django', TO_DATE('12-03-2021', 'DD-MM-YYYY'), NULL, 'https://example.com/ecommerce', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Customize the values according to your project details.
INSERT INTO Skill (user_id, name, proficiency, created_at, updated_at)
VALUES (1, 'Python', 'advanced', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Add more skills or adjust proficiency levels as needed.
INSERT INTO Certification (user_id, name, authority, license_number, start_date, end_date, url, created_at, updated_at)
VALUES (1, 'Oracle Certified Associate', 'Oracle Corporation', 'OCAP-123456', TO_DATE('01-05-2021','DD-MM-YYYY'), NULL, 'https://example.com/certificates/oca', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Insert certifications you have obtained with relevant details.
INSERT INTO Publication (user_id, title, authors, journal, publication_date, url, created_at, updated_at)
VALUES (1, 'Advanced Machine Learning Techniques', 'Rishabh Tiwari, John Doe', 'Journal of Artificial Intelligence', TO_DATE( '15-07-2022','DD-MM-YYYY'), 'https://example.com/publications/advanced-ml', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Insert your publications with accurate details.
INSERT INTO Reference (user_id, name, position, company, contact_info, created_at, updated_at)
VALUES (1, 'Jane Smith', 'Senior Manager', 'XYZ Corporation', 'jane.smith@example.com', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Add references or recommendations you have received.

INSERT INTO Contact (user_id, type, value, created_at, updated_at)
VALUES (1, 'email', 'rishabh@example.com', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Include various types of contact information like phone numbers or social media handles.

INSERT INTO SocialMedia (user_id, platform, url, created_at, updated_at)
VALUES (1, 'LinkedIn', 'https://linkedin.com/rishabhtiwari', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

-- Insert your social media profiles to enhance networking.


