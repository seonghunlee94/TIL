use copang_main;
SELECT 
    i.price, r.star, m.email
FROM member AS m INNER JOIN item AS i
    INNER JOIN review AS r;
    
SELECT 
MAX(price) AS max_price,
AVG(star) AS avg_star,
COUNT(DISTINCT(email)) AS distinct_email_count    
FROM 
(SELECT i.price, r.star, m.email 
FROM review AS r INNER JOIN item AS i
ON r.item_id = i.id
INNER JOIN member AS m 
ON r.mem_id = m.id) AS copang_report;
    
SELECT i.price, r.star, m.email 
FROM member AS m INNER JOIN item AS i
INNER JOIN review AS r;

