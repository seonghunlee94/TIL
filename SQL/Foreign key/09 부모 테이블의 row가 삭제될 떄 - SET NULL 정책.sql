-- SET NULL

-- 부모 테이블의 row가 삭제되었을 때 자식 테이블의 FK들을 NULL로 바꿔주는 정책이다.

-- SET NULL은 부모 테이블의 컬럼 유무와 상관 없이 자식 테이블의 컬럼이 의미가 있을 경우 사용한다.


DELETE FROM course WHERE id=2;


SELECT * FROM course_rating.review;
SELECT * FROM course_rating.course;