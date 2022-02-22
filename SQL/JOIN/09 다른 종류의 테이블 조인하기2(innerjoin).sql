-- INNER JOIN
-- 각 row에 겹치는 데이터만 합치는 죠인
-- 기준이 되는 테이블이 따로 없다!!!
-- 기준 컬럼의 값이 일치하는 row들만 연결될 뿐
-- 서로 연관 있는 데이터를 조회할 때
use copang_main;

-- inner -> 교집합 느낌 
SELECT
	item.id,
    stock.item_id
FROM item INNER JOIN stock
ON item.id = stock.item_id;



-- item -> id, name
-- stock -> item_id, inventory_count
-- item.id 와 item_id가 일치하는 경우 
-- inner 죠인으로 교집합 구하기

SELECT 
	item.id,
	item.name,
    stock.item_id,
    stock.inventory_count
FROM item INNER JOIN stock 
ON item.id = stock.item_id;

-- alias 해주기
SELECT 
	i.id,
	i.name,
    s.item_id,
    s.inventory_count
FROM item AS i INNER JOIN stock AS s
ON i.id = s.item_id;
