-- 부모 테이블인 course 테이블의 입장에서 참조 무결성 생각해보기 

-- RESTRICT 정책 : 제한하다, 못하게 하다

use course_rating;

DELETE FROM course WHERE id=5;


0	14	09:47:28	DELETE FROM course WHERE id=5	Error Code: 1451. 
Cannot delete or update a parent row: 
a foreign key constraint fails (`course_rating`.`review`, CONSTRAINT `fk_review_table` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT)	0.016 sec