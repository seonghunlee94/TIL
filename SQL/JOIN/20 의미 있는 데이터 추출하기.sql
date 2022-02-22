SELECT * FROM copang_main.member;
-- 오답이지만, 스스로 적은 쿼리. 문제점은 많지만
SELECT 
	i.id, i.name,
    r.star,
    m.gender
FROM item AS i LEFT OUTER JOIN review AS r
	ON r.item_id = i.id
	LEFT OUTER JOIN member AS m
    ON r.mem_id = m.id
HAVING m.gender = 'f' 
ORDER BY r.star  DESC;


-- 
SELECT 
	i.id, i.name, AVG(star), COUNT(*)
FROM item AS i LEFT OUTER JOIN review AS r
		ON r.item_id = i.id
	LEFT OUTER JOIN member AS m
		ON r.mem_id = m.id
WHERE m.gender = 'f'
GROUP BY i.id, i.name
HAVING COUNT(*) >= 2
ORDER BY AVG(star) DESC,
COUNT(*) DESC;

SELECT 
	i.id, i.name, AVG(star), COUNT(*)
FROM item AS i LEFT OUTER JOIN review AS r
		ON r.item_id = i.id
	LEFT OUTER JOIN member AS m
		ON r.mem_id = m.id
WHERE m.gender = 'm'
GROUP BY i.id, i.name
HAVING COUNT(*) >= 2
ORDER BY AVG(star) DESC,
COUNT(*) DESC;