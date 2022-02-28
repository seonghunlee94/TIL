
-- On Delete와 똑같은 정책들이 On Update에서 보인다. 
-- 그 의미도 똑같다.

USE course_rating;
SELECT * FROM course_rating.review;
SELECT * FROM course_rating.course;

-- restrict
UPDATE course SET id=100 WHERE id=1;
-- 에러, foreign key 제약 사항으로 인해 부모 테이블 pk를 바꿔줄 수 없다.

-- cascade
UPDATE course SET id=100 WHERE id=1;
-- 부모 테이블 pk 컬럼 값이 바뀌고, 자식 테이블 fk 값은 부모 pk 값을 따라 바뀐다.


-- set null
UPDATE course SET id=200 WHERE id=100;
-- 부모 테이블의 pk 컬럼 값은 잘 바뀌었고 
-- 자식 테이블의 fk 컬럼은 부모 테이블 pk 컬럼이 바뀌었기 때문에 null로 바뀐다.