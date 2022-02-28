SELECT * FROM course_rating.copy_of_undergraduate;
DESC copy_of_undergraduate;

use course_rating;


CREATE TABLE course_rating.course (
    id INT NOT NULL AUTO_iNCREMENT,
    title VARCHAR(30) NULL,
    semester VARCHAR(6) NULL,
    maximum INT NULL,
    profesoor VARCHAR(10) NULL,
    PRIMARY KEY(id)
);

SELECT * FROM course;
DESC course; 


CREATE TABLE course_rating.review (
	id INT NOT NULL AUTO_INCREMENT,
    course_id INT NULL,
    star INT NULL,
    comment VARCHAR(500) NULL,
    PRIMARY KEY(id)
);

SELECT * FROM review;

INSERT INTO course (