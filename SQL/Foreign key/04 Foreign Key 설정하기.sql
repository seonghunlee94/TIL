

-- Foreign Key -> 참조 무결성을 지키기 위해 필요
-- 근데 개념적으로 Foreign Key에 해당한다고 해서 참조 무결성이 지켜지는 것은 아니다.
-- Foreign Key를 직접 설정해줘야 지켜진다.


-- Foreign Key 설정 : Foreign Key도 제약 사항의 일부다.

ALTER TABLE `course_rating`.`review` 
ADD CONSTRAINT `fk_review_table` -- FOREIGN KEY의 이름이자 제약 사항의 이름이다.
  FOREIGN KEY (`course_id`)
  REFERENCES `course_rating`.`course` (`id`)
  ON DELETE RESTRICT
  ON UPDATE RESTRICT;
  
  DESC review;
  
  


