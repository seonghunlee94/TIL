-- CASCADE : '폭포수처럼 떨어지다', '연쇄 작용을 일으키다'
-- 부모 테이블에서도 자식 테이블에서도 잘 삭제된다.
-- CASCADE는 부모 테이블의 컬럼이 존재할 때만 자식 테이블의 컬럼이 의미 있는 경우에 사용한다. 

DELETE FROM course WHERE id=5;
SELECT * FROM course_rating.course;
SELECT * FROM course_rating.review;
