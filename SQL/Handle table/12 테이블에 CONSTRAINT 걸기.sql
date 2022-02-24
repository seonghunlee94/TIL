SELECT * FROM course_rating.student;

-- CONSTRAINT 제약 사항
-- 테이블에 이상한 데이터가 추가되는 것을 막아야 한다.
ALTER TABLE 테이블명
	ADD CONSTRAINT 제약 사항의 이름 CHECK (제약 사항 내용);


ALTER TABLE student
	ADD CONSTRAINT st_rule CHECK (registration_number < 30000000);

INSERT INTO student (name, registration_number) VALUES ('이', 34983728);

-- 제약 사항 삭제
ALTER TABLE student DROP CONSTRAINT st_rule;


-- 두 개 이상 조건이 달린 제약 사항 만들기
ALTER TABLE student ADD CONSTRAINT st_rule CHECK (email LIKE '%@%' AND gender IN ('m', 'f'));


INSERT INTO student (name, registration_number, email, gender) 
	VALUES ('김', 20132948, '^^ 장난쳐야지@', 'm') ;
    
UPDATE student SET email = 'god@naver.com' WHERE name = '김';


-- 제약 사항 조회하는 쿼리
select * from information_schema.table_constraints;
select * from information_schema.table_constraints WHERE table_name = 'student';


DESC student;