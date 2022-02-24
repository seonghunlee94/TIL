SELECT * FROM course_rating.student;

DESCRIBE student;

-- 1.컬럼 삭제하기
ALTER TABLE student DROP COLUMN admission_date;

-- 2.컬럼의 데이터 타입 변경
ALTER TABLE student MODIFY major INT;
ALTER TABLE student MODIFY major VARCHAR(35);
-- 에러 - why? 정수가 아닌 값이 있다.
-- 원래 값들을 정수로 바꾼 후, 데이터 타입을 바꿔줘야 한다.
UPDATE student SET major = 10 WHERE major = '신학과';
UPDATE student SET major = 12 WHERE major = '멀티미디어학과';
UPDATE student SET major = '멀티미디어학과' WHERE major = 12;

-- UPDATE를 WHERE을 통해 안되면, 
SET SQL_SAFE_UPDATES = 0;
-- 그 후 안전을 위해  다시 1로
SET SQL_SAFE_UPDATES = 1;


