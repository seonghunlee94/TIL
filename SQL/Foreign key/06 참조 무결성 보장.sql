USE course_rating;

-- FK인 course_id에 값을 넣을 때, PK에서 없는 값을 넣으려 하면
-- 에러가 난다. 
INSERT INTO review (course_id, star, comment)
	VALUES (10, 5, '정말 좋은 수업이에요!');


SELECT * FROM course_rating.course;

DESC review;