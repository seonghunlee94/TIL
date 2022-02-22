SELECT * FROM item
WHERE EXISTS(SELECT * FROM review WHERE review.item_id = item.id);


SELECT * FROM item
WHERE NOT EXISTS(SELECT * FROM review WHERE review.item_id = item.id);