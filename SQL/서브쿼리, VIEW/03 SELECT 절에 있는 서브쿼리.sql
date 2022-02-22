-- SELECT절에 서브쿼리 써보기
-- 원래 없던 컬럼을 새로 추가해서 보겠다는 의미다!!

-- SELECT절에서 특정 컬럼의 특징을 찾아주는 서브쿼리를 자주 사용한다.

SELECT id, name, price, (SELECT MAX(price) FROM item) AS max_price FROM item;

SELECT id, name, price, (SELECT AVG(price) FROM item) AS avg_price FROM item;