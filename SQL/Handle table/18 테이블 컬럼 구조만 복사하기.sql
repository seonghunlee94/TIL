SELECT * FROM course_rating.undergraduate;

-- 컬럼 구조만 복사
CREATE TABLE copy_of_undergraduate LIKE undergraduate;

-- 컬럼 내용 복사 (두 테이블의 컬럼 구조가 같아야 한다)
INSERT INTO copy_of_undergraduate 
	SELECT * FROM undergraduate WHERE major = 101;

DELETE FROM copy_of_undergraduate ;
SELECT * FROM copy_of_undergraduate;