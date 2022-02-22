-- where 절 서브쿼리
-- 

use copang_main;
SELECT 
	id, 
    name, 
    price, 
    (SELECT AVG(price) FROM item) AS avg_price 
FROM item
WHERE price > (SELECT AVG(price) FROM item);

SELECT 
	id, 
    name, 
    price 
FROM item
WHERE price = (SELECT MAX(price) FROM item);

SELECT id, name, MAX(price)
From item;

use copang_main;
-- Question
-- 코팡의 상품 중에서 리뷰가 최소 3개 이상 달린 상품들의 정보만 보고 싶으면 어떻게 해야할까요?


-- 시도(서브쿼리) - 모르겠음 ㅋㅋ
SELECT 
	i.id,
    i.name,
    r.star
FROM item AS i LEFT OUTER JOIN review AS r
	ON i.id = r.item_id
WHERE star > (SELECT id FROM item FROM item AS i LEFT OUTER JOIN review AS r
	ON i.id = r.item_id GROUP BY star);
    
    
-- join
SELECT 
	i.id,
    i.name,
    r.star,
    count(*)
FROM item AS i LEFT OUTER JOIN review AS r
	ON i.id = r.item_id
GROUP BY i.id
HAViNG count(*) > 2;  


-- 영상 참고(서브쿼리) 
-- 서브쿼리에서 row가 여러 개인 컬럼을 리턴받을 수도 있다.
SELECT * FROM item
WHERE id in (SELECT item_id FROM review GROUP BY item_id HAVING COUNT(*) >= 3);
-- in이 있을 때 뒤에 있는 값들 중 조건이 하나라도 만족한다면 조건을 만족한다.

-- IN
-- ANY(SOME)
-- ALL