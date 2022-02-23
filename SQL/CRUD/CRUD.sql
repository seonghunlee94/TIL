-- 1.데이터 베이스 만들기
CREATE DATABASE course_rating; -- CREATE DATABASE 이름
-- 같은 이름의 데이터 베이스를 만들 수 없음 


-- 2.데이터 베이스 있는지 확인하고 없을 시 만들기(있으면 에러X, 경고 정도)
CREATE DATABASE IF NOT EXISTS course_rating; 
-- course_rating 데이터 베이스가 없을 시 course_rating이름으로 DB만들어줘


-- 3. 사용할 DB 지정 
USE course_rating;
-- DBMS는 여러 개의 DB를 다루기 때문에 어떤 DB를 사용할 지 정해줘야 한다.


-- 4. DB에 테이블 추가하기
CREATE TABLE `course_rating`.`student` (
	`id` INT NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(20) NULL,
    `student_number` INT NULL,
    `major` VARCHAR(15) NULL,
    `email` VARCHAR(50) NULL,
    `phone` VARCHAR(15) NULL,
    `admission_date` DATE NULL,
	PRIMARY KEY (`id`));


-- row 추가하기
-- 모든 컬럼에 값을 넣어주는 경우, 
INSERT INTO student 
-- 생략 가능 -> (id, name, student_number, major, email, phone, admission_date)
    VALUES (1, '이성훈', 20132974, '신학과', 
    'godloveme94@naver.com', '010-7169-2013', '2013-03-02');

-- 특정 컬럼에 값만 넣어줄 경우 : 생략 불가
INSERT INTO student 
	(id, name, student_number, major, admission_date)
    VALUES (3, '훈', 20132974, '컴퓨터과', '2013-03-02');
    
    
-- 테이블에 있던 기존의 row 갱신(수정)
UPDATE student 
	SET major = '멀티미디어학과', name = '후훈' 
	WHERE id = 2; -- WHERE 필수, 없을 시 다 갱신
    
    
-- 테이블에 있던 row 삭제
DELETE FROM student WHERE id = 3; -- WHERE 필수, 없을 시 다 날라가
