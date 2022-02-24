SELECT * FROM course_rating.student;

DESCRIBE student;

-- UNIQUE (고유한) - 컬럼에 같은 값이 추가 되는 것을 막을 수 있다.

ALTER TABLE student MODIFY registration_number INT NOT NULL UNIQUE;

UPDATE student SET registration_number = 20132944 WHERE id = 2;

-- UNIQUE 효과 : 같은 컬럼의 row들끼리 같은 값을 가질 수 없다. 

