# 여기에 정답을 적어주세요

ALTER TABLE 테이블명 RENAME COLUMN name to 컬럼명;
ALTER TABLE 테이블명 MODIFY 컬럼명 DOUBLE NOT NULL;
ALTER TABLE 테이블명 DROP 컬럼명;
ALTER TABLE 테이블명 ADD 컬럼명 INT NOT NULL;

-- ------
SELECT 컬럼명 FROM 테이블명;
INSERT INTO 테이블명 (컬럼명, 컬럼명) VALUES (값, 값);
UPDATE 테이블명 SET 컬럼명 = 값, 컬럼명 = 값 WHERE 조건이 되는 컬럼 = 값; 
DELETE FROM 테이블명 WHERE 조건이 되는 컬럼 = 값;

# 체점용 코드
DESCRIBE shoes;