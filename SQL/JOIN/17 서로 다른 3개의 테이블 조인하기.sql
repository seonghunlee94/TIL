-- 더 많은 테이블들을 조인할수록 
-- 더 의미 있고, 다양한 사실들을 발견할 수 있다.

-- reiew, member, item_new 세 테이블을 조인할 것이다.  
 SELECT
	i.name, i.id,
    r.item_id, r.star, r.comment, r.mem_id,
    m.id, m.email
 FROM item AS i LEFT OUTER JOIN review AS r
	ON r.item_id = i.id
	LEFT OUTER JOIN member AS m
    ON r.mem_id = m.id;



