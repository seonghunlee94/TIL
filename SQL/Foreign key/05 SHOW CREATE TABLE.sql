SHOW CREATE TABLE review;

CREATE TABLE `review` (
   `id` int NOT NULL AUTO_INCREMENT,
   `mem_id` int DEFAULT NULL,
   `item_id` int DEFAULT NULL,
   `star` int DEFAULT NULL,
   `comment` text,
   PRIMARY KEY (`id`),
   KEY `mem_id_idx` (`mem_id`),
   KEY `item_id_idx` (`item_id`),
   CONSTRAINT `item_id` FOREIGN KEY (`item_id`) REFERENCES `item` (`id`),
   CONSTRAINT `mem_id` FOREIGN KEY (`mem_id`) REFERENCES `member` (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci