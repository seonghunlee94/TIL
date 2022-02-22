-- 서브쿼리 : SQL문 안에 '부품'처럼 들어가는 SELECT문
-- sub(하위의, 일부분의) query(데이터베이스에 보내는 요청)
-- 즉 서브쿼리는 sql문에서 또다른 일부가 되는 sql문 
-- 괄호 안에 넣어줘야 한다.
use copang_main;

 SELECT i.id, i.name, AVG(star) AS avg_star
 FROM item AS i LEFT OUTER JOIN review AS r
 ON r.item_id = i.id
 GROUP BY i.id, i.name
 HAVING avg_star < (SELECT AVG(star) FROM review)
 ORDER BY avg_star DESC;