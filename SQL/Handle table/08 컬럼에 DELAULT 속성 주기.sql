SELECT * FROM course_rating.student;

-- 컬럼의 default 값 = 기본 값
-- 컬럼의 기본 값을 설정하면, row 값을 주지 않으면 기본값으로 들어가게 된다.

DESCRIBE student;
-- NOT NULL이 설정되지 않았으면, default는 NULL로 설정되어 있다.

-- NOT NULL로 설정되어 있으면, 값을 주지 않으면 에러
-- 만약 기본 값을 설정해주면 값을 주지 않아도 에러나지 않아.

ALTER TABLE student MODIFY major INT NOT NULL DEFAULT 101;

INSERT INTO student (name, registration_number) VALUES ('hun', 20132234);