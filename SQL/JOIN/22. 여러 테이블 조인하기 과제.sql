SELECT 
    YEAR(registration_date) AS '등록 연도', COUNT(*) AS '리뷰 개수', AVG(star) AS '별점 평균값'
FROM item AS i INNER JOIN review AS r
        ON  r.item_ID = i.id
    INNER JOIN member AS m
        ON r.mem_id = m.id
WHERE i.gender = 'u'
GROUP BY YEAR(registration_date)
HAVING COUNT(*) >= 10
ORDER BY AVG(star) DESC