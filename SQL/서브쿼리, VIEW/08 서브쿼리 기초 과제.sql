-- (1) '2018년 12월 31일' 이전에 코팡 사이트에 등록된 상품들에 관한 리뷰들만 추려보겠습니다.
-- (2) 그리고 이때 review 테이블의 모든 컬럼들을 조회하세요.


SELECT * FROM review
WHERE item_id in (SELECT id FROM item WHERE registration_date > '2018-12-31');

SELECT id, registration_date FROM item WHERE registration_date > '2018-12-31';

SELECT id, registration_date FROM item WHERE registration_date < '2018-12-31';

SELECT * FROM review
WHERE item_id in (SELECT id FROM item WHERE registration_date < '2018-12-31');