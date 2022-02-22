USE copang_main;
SELECT * FROM `item-data`;

CREATE TABLE `review` (
  `id` int NOT NULL AUTO_INCREMENT,
  `mem_id` int DEFAULT NULL,
  `item_id` int DEFAULT NULL,
  `star` int DEFAULT NULL,
  `comment` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO `review` (`id`, `mem_id`, `item_id`, `star`, `comment`) VALUES 
(1,1,1,5,'착용감이 너무 좋아요, 요새 맨날 이것만 입고 다닙니다.'),
(2,1,2,2,'그럭저럭 입을만 하긴 한데 밴딩이 너무 조여요 ㅜㅜ'),
(3,1,6,5,'한 번 사보고 촉감이 너무 좋아서 10장 구매했습니다~'),
(4,1,14,4,'두툼한 느낌이 좋기는 한데 실내에서는 땀이 좀 나네요..'),
(5,2,4,3,'그냥 입을만한 정도에요.'),
(6,2,8,5,'디자인도 최고고, 착용감도 진짜 좋아요.'),(7,2,9,5,'이거 입고 요새 맨날 헬스장 다닙니다 ㅎㅎ'),(8,2,13,3,'뭔가 일단 사서 입고 있기는 한데 디자인이 이미지보다 좀더 튀네요. '),(9,2,22,4,'뭔가 스타일리쉬한 느낌이라 요새 자주 입고 다녀요. '),(10,3,4,5,'기본템으로 좋은 것 같아서 여러장 샀네요~!'),(11,3,9,5,'땀을 잘 흡수해줘서 좋아요, 가족들 전부 한장씩 사서 줬어요 ㅋㅋ'),(12,3,15,3,'자수 모양이 이쁘긴 한데 좀 올드한 느낌이네요..'),(13,4,2,1,'이거 진짜 날씬한 사람만 입을 수 있는 건가요? 남편이 고무줄이 너무 조인다고 해요.'),(14,4,8,4,'처음에는 좀 너무 큰 사이즈 느낌이었는데 오히려 지금은 잘 산 것 같아요.'),(15,4,22,5,'이거 입고 모임 나가면 어디서 샀냐고 다 물어봐요, 좋아요!!'),(16,4,26,4,'봄가을에 입으면 딱 좋을 듯요 ^^'),(17,6,1,4,'적당히 입고 다니기 좋네요'),(18,6,2,0,'절대 사지마세요.. 남친 선물로 줬는데 허리가 너무 조인다고 해요..'),(19,6,3,5,'딱 스탠다드 런닝 느낌이에요. 남동생 선물로 여러 장 샀네요!'),(20,6,6,1,'이거 왜 세탁하고 나니까 청색이 너무 옅어져버리죠? 이염돼서 다른 옷도 다 망했어요 ㅜ'),(21,6,19,4,'요새 출근할 때 이거만 입고 다닙니다, 정말 예쁘네요~'),(22,6,21,2,'디자인이 조금 애매하네요. 그래도 가끔 입기에는 괜찮네요'),(23,10,1,5,'편하게 입고 다니기에 좋네요. '),(24,10,9,4,'요즘엔 헬스장에서 주는 옷 말고 이거 입고 다녀요. 통기성이 좋네요~'),(25,10,14,5,'가을용으로는 좀 더울 것 같고 겨울에 입으면 좋을 듯 하네요!'),(26,10,19,5,'이 옷은 이제 제 favorite이 될 것 같아요~ 데이트할 때마다 입으려고 해요'),(27,10,20,3,'사진으로 볼 때는 몰랐는데 받아보니 생각보다 좀 올드한 스타일인 것 같네요 ㅜ'),(28,10,23,4,'뭔가 독특한 안감과 겉감 때문에 개성있는 분위기를 연출할 수 있네요~'),(29,10,24,5,'밴딩이 진짜 편하고 길이도 적당해서 좋아요~'),(30,10,25,5,'이거 입고 사진 찍으니까 진짜 이쁘게 나와요!!! 다른 패턴도 또 나왔으면 ㅜ'),(31,10,29,5,'뭔가 사람들이 카라 어디로 떼먹었냐고 물어봐서 웃겨요 ㅋㅋㅋ'),(32,13,1,4,'딱 기본템으로 좋네요, 제 동생도 이쁘다 해서 하나 선물해줬습니다~'),(33,13,4,3,'뭔가 괜찮긴 한데 길이가 좀 짧은 감이 있어요.. 천을 덧대야할 것 같은 느낌..'),(34,13,9,5,'속옷 대신 입고 다녀도 될 정도로 가볍고 좋아요'),(35,13,18,5,'이쁘네요! '),(36,13,20,2,'괜찮긴 한데 물이 금새 빠졌네요..'),(37,13,30,0,'이거 사지 마세요.. 포켓 하나가 단추 떨어져서 왔어요..'),(38,16,1,5,'색깔이 너무 튀지도 않고 딱 좋아요'),(39,16,2,2,'이거 밴딩이 너무 쎄요.. 조절할 수 있도록 해주세요.  '),(40,16,3,4,'괜찮네요, 친구도 이거 샀더라구요 ㅋㅋ'),(41,16,5,3,'난해한 디자인.. 난 모르겠다, 그냥 입고 다닐게요. 착용감은 괜찮아요'),(42,16,7,5,'입기 괜찮네요. 적당한 핏이에요.'),(43,16,12,4,'좋아요, 따뜻하면서 시원해요?! '),(44,16,22,5,'이런 느낌으로 또다른 디자인해서 코트 판매해주세요! 도시적인 느낌 너무 좋아여'),(45,18,1,4,'질감이 괜찮네요, 패턴 제가 따로 입혀서 입고 다니고 있어요'),(46,18,4,3,'이거 뭐야 옷이, 기장 체크하고 살걸..'),(47,19,1,5,'좋아요~! 계절별로 하나씩 이런 느낌의 옷 있으면 좋겠어요, 두께감만 다르게 해서요'),(48,19,15,2,'이거 사놓고 입지도 못할 듯.. 너무 통이 작아서..'),(49,19,20,4,'입기에 괜찮은 듯~굿!'),(50,19,28,2,'괜찮긴 한데 단추 부분이 부실한 듯..'),(51,19,30,4,'괜찮은데 세탁하니까 사이즈가 좀 준 듯?'),(52,20,4,4,'나쁘지 않은 듯~!'),(53,20,9,5,'이거 진짜 좋네요. 내구성도 좋고 땀도 잘 흡수되고~'),(54,20,21,2,'도트 크기가 너무 큰 거 아닌가요.. 여친 주려고 샀는데 반품해야겠어요.'),(55,20,27,3,'엄마 사드렸는데, 옷이 너무 힘이 없는 듯..');

-- LEFT OUTER JOIN

SELECT 
	item.id,
    item.name,
    stock.item_id,
    stock.inventory_count
FROM stock LEFT OUTER JOIN item
ON item.id = stock.item_id;


-- RIGHT OUTER JOIN
SELECT 
	item.id,
    item.name,
    stock.item_id,
    stock.inventory_count
FROM item RIGHT OUTER JOIN stock
ON item.id = stock.item_id;

-- 테이블에 alias하기, 조건은 테이블의 alias한 대로 쿼리문 내에 테이블명을 바꿔줘야 한다. 
SELECT 
	i.id,
    i.name,
    s.item_id,
    s.inventory_count
FROM item AS i RIGHT OUTER JOIN stock AS s
ON i.id = s.item_id;

