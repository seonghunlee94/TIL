SELECT * FROM course_rating.student;

-- 1.테이블 이름 바꾸기
RENAME TABLE student TO undergraduate;
-- 컬럼명 바꾸기랑 차이점
ALTER TABLE student RENAME COLUMN 기존_컬럼명 to 바꿀_컬럼명;

-- 2.복사본 만들기
CREATE TABLE copy_of_undergraduate AS SELECT * FROM undergraduate;
-- 기존 테이블을 바로 바꾸기 무서울 때 만들어서 먼저 작업해볼 수 있다.

-- 3. 삭제
DROP TABLE copy_of_undergraduate;