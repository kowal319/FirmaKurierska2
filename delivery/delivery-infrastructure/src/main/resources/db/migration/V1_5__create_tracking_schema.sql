CREATE TABLE `tracking` (
    `tracking_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `delivery_id` int NOT NULL,
    `location` varchar(100) NOT NULL,
    `status` varchar(20) NOT NULL,
    `update_date` datetime NOT NULL,
    FOREIGN KEY (delivery_id) REFERENCES delivery (delivery_id)
    );