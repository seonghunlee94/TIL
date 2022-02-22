use copang_main;

-- 서브쿼리 안에 서브쿼를 쓰는 것 가능
-- 서브쿼리를 중첩한다.라고 말한다.
-- 코드가 길어져 가독성이 나빠진다. 10, 16, 17번 다시 점검하기!!

-- join
SELECT 
	i.id, i.name,
    AVG(star) AS avg_star,
    COUNT(*) AS count_star
FROM item AS i LEFT OUTER JOIN review AS r ON r.item_id = i.id
	LEFT OUTER JOIN member AS m ON r.mem_id = m.id
WHERE m.gender = 'f'
GROUP BY i.id, i.name
HAVING COUNT(*) >= 2
ORDER BY AVG(star) DESC, COUNT(*) DESC;

-- join -> 서브쿼리 중복으로 바꿔서 구현해보기
    
SELECT i.id, i.name, AVG(star) AS avg_star, COUNT(*) AS count_star
FROM item AS i LEFT OUTER JOIN review AS r ON r.item_id = i.id
	LEFT OUTER JOIN member AS m ON r.mem_id = m.id
WHERE m.gender ='f'
GROUP BY i.id, i.name
HAVING COUNT(*) >= 2 AND avg_star =
(
	SELECT MAX(avg_star) FROM (
		SELECT i.id, i.name, AVG(star) AS avg_star, COUNT(*) AS count_star
        FROM item AS i LEFT OUTER JOIN review AS r on r.item_id = i.id
			LEFT OUTER JOIN member AS m ON r.mem_id = m.id
		WHERE m.gender = 'f'
        GROUP BY i.id, i.name
        HAVING COUNT(*) >= 2
        ORDER BY AVG(star) DESC, COUNT(*) DESC
	) AS final
)
ORDER BY AVG(star) DESC, COUNT(*) DESC;   

-- view 기능으로 코드가 길어지고 가독성이 나빠지는 단점을 보완할 수 있음
-- view : 조인 등의 작업을 해서 만든 '결과 테이블'이 가상으로 저장된 형태
-- 데이터 분석에 엄청 유용한 기능이다. 
-- 또한 보안상에도 장점이 있다.

SELECT * FROM three_tables_joined;

SELECT * FROM three_tables_joined
WHERE avg_star = (SELECT MAX(avg_star) FROM three_tables_joined)
AND count_star = (SELECT MAX(count_star) FROM three_tables_joined);


