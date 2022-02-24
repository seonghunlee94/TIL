SELECT * FROM course_rating.student;
use course_rating;
DESCRIBE student;

-- 시간이 흐르면, 데이터 내용이 점점 달라질 수 있다.
-- 컬럼 구조 바꾸기

-- 1.컬럼 추가하기
ALTER TABLE student ADD gender CHAR(1) NULL;

-- 2.컬럼의 이름 바꾸기
ALTER TABLE student RENAME COLUMN student_number TO registration_number;


