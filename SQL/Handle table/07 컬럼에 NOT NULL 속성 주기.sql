SELECT * FROM course_rating.student;
DESCRIBE student;

ALTER TABLE student MODIFY name VARCHAR(35) NOT NULL;
ALTER TABLE student MODIFY registration_number INT NOT NULL;
ALTER TABLE student MODIFY major INT NOT NULL;

-- ----------
INSERT INTO student (registration_number, email, phone) VALUES (20132222, 'god@n', '010-2222-1111');