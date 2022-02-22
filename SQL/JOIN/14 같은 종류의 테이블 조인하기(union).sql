-- 같은 종류의 테이블 조인하기

-- 기존이랑 똑같은 컬럼으로 새로운 테이블을 만들었는데 
-- 데이터가 손실 없이 옮겨져야 하는 상황이다.
-- 이 때 Join을 사용해서 해결할 수 있다. 
use copang_main;
RENAME TABLE `item-new` to item_new;
SELECT 
	old.id AS old_id, 
    old.name AS old_name, 
    new.id AS old_id, 
    new.name AS old_new 
FROM item AS old LEFT OUTER JOIN item_new AS new
ON old.id = new.id;

-- 새로운 테이블에 옮긴 데이터에 
-- 새롭게 추가된 내용을 조회할 때
SELECT 
	old.id AS old_id, 
    old.name AS old_name, 
    new.id AS old_id, 
    new.name AS old_new 
FROM item AS old RIGHT OUTER JOIN item_new AS new
ON old.id = new.id;

-- 새롭게 추가된 부분만 검색
SELECT 
	old.id AS old_id, 
    old.name AS old_name, 
    new.id AS old_id, 
    new.name AS old_new 
FROM item AS old RIGHT OUTER JOIN item_new AS new
ON old.id = new.id
WHERE old.id is null;


-- 두 테이블에 겹치는 데이터 확인해보기
SELECT 
	old.id AS old_id, 
    old.name AS old_name, 
    new.id AS old_id, 
    new.name AS old_new 
FROM item AS old INNER JOIN item_new AS new
ON old.id = new.id;

-- UNION : 두 조회 결과를 그대로 합쳐주고, 겹치는 row는 단 한 개만 보여준다.
SELECT * FROM item
UNION
SELECT * FROM item_new;