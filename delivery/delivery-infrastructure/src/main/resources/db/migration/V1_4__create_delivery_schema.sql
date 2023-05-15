CREATE TABLE `delivery` (
    `delivery_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `order_id` int NOT NULL,
    `courier_id` int NOT NULL,
    `delivery_date` date NOT NULL,
    `delivery_status` varchar(20) NOT NULL,
    FOREIGN KEY (order_id) REFERENCES Orders (order_id),
    FOREIGN KEY (courier_id) REFERENCES Couriers (courier_id)
    );
