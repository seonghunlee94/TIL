-- 
use copang_main;
SELECT 
	SUBSTRING(address, 1,2) AS region,
    COUNT(*) AS review_count
FROM review AS r LEFT OUTER JOIN member AS m
ON r.mem_id = m.id
GROUP BY SUBSTRING(address, 1,2)
HAVING region IS NOT NULL
	AND region != '안드';
    
SELECT 
	SUBSTRING(address, 1,2) AS region,
    COUNT(*) AS review_count
FROM review AS r LEFT OUTER JOIN member AS m
ON r.mem_id = m.id
GROUP BY SUBSTRING(address, 1,2);

SELECT 
	*
FROM review AS r LEFT OUTER JOIN member AS m
ON r.mem_id = m.id;

--  ------------------------------------------
SELECT 
	SUBSTRING(address, 1,2) AS region,
    COUNT(*) AS review_count
FROM review AS r LEFT OUTER JOIN member AS m
ON r.mem_id = m.id
GROUP BY SUBSTRING(address, 1,2)
HAVING region IS NOT NULL
	AND region != '안드';
    
    
 -- 모든 derived table은 자신의 알리어스를 가져야 한다. 
 -- 그러면 derived table은 무엇일까? derived('파생시키다' '도출해내다')
 -- 서브쿼리로 탄생한 테이블을 derived table이라고 부른다.
 -- sql문 안에서만 유효한 테이블이라고 생각하면 된다. 
    
    
 SELECT 
	AVG(review_count),
	MAX(review_count),
    Min(review_count)
FROM
    (SELECT 
	SUBSTRING(address, 1,2) AS region,
    COUNT(*) AS review_count
FROM review AS r LEFT OUTER JOIN member AS m
ON r.mem_id = m.id
GROUP BY SUBSTRING(address, 1,2)
HAVING region IS NOT NULL
	AND region != '안드') AS review_count_summary;