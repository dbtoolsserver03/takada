DROP DATABASE
IF
	EXISTS `ems-thymeleaf`;
	
CREATE DATABASE
IF
	NOT EXISTS `ems-thymeleaf` CHARACTER 
	SET utf8mb4;
	
USE `ems-thymeleaf`;


-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `salary` double(10, 2) NULL DEFAULT NULL,
  `birthday` datetime NULL DEFAULT NULL,
  `photo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'zhang31', 121333.00, '2001-01-01 00:00:00', '20231004145419720.jpeg');
INSERT INTO `employee` VALUES (2, 'aaa', 111.20, '1991-01-01 00:00:00', '20231011214017155.jpeg');

-- ----------------------------
-- Table structure for m_code
-- ----------------------------
DROP TABLE IF EXISTS `m_code`;
CREATE TABLE `m_code`  (
  `m_key` varchar(20)  NOT NULL COMMENT 'キー',
  `m_code` char(2)  NOT NULL COMMENT 'コード',
  `m_value` varchar(50)  NULL DEFAULT NULL COMMENT '内容',
  `m_order` int NULL DEFAULT NULL COMMENT '並び順',
  `m_display1` varchar(60)  NULL DEFAULT NULL COMMENT '表示１',
  `m_display2` varchar(60)  NULL DEFAULT NULL COMMENT '表示２',
  `m_display3` varchar(60)  NULL DEFAULT NULL COMMENT '表示３',
  `m_display4` varchar(60)  NULL DEFAULT NULL COMMENT '表示４',
  `m_display5` varchar(60)  NULL DEFAULT NULL COMMENT '表示５',
  `m_display6` varchar(60)  NULL DEFAULT NULL COMMENT '表示６',
  `m_display7` varchar(60)  NULL DEFAULT NULL COMMENT '表示７',
  `m_display8` varchar(60)  NULL DEFAULT NULL COMMENT '表示８',
  `m_display9` varchar(60)  NULL DEFAULT NULL COMMENT '表示９',
  `delete_flg` char(1) NOT NULL COMMENT '削除フラグ',
  `create_time` datetime DEFAULT NULL COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT NULL COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`m_key`, `m_code`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci COMMENT = 'マスタコード';

-- ----------------------------
-- Records of m_code
-- ----------------------------
INSERT INTO `m_code` VALUES ('uniqlo_sex', '', ' ', 0, NULL, 'ALL', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_sex', '00', '女', 2, '00:女', '女', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_sex', '01', '男', 1, '01:男', '男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_size', '', ' ', 0, NULL, 'ALL', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_size', '01', 'S', 1, '01:S', 'S', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_size', '02', 'M', 2, '02:M', 'M', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_size', '03', 'L', 3, '03:L', 'L', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_type', '', ' ', 0, NULL, 'ALL', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_type', '01', '上身', 1, '01:上身', '上身', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_type', '02', '下身', 2, '02:下身', '下身', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` VALUES ('uniqlo_type', '03', '脚部', 3, '03:脚部', '脚部', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_files
-- ----------------------------
DROP TABLE IF EXISTS `t_files`;
CREATE TABLE `t_files`  (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'key',
  `old_file_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `new_file_name` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `ext` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `path` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `size` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `is_img` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `downcounts` int NULL DEFAULT 0,
  `username` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `delete_flg` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT '0',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT CURRENT_TIMESTAMP,
  `update_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of t_files
-- ----------------------------
INSERT INTO `t_files` VALUES (1, '20210624223336247.jpeg', '20231004180451794a3d25cb4-72e1-475c-b8a5-1e0a2472de08.jpeg', 'jpeg', '2023-10-04', '85209', 'image/jpeg', 'Y', 3, 'admin', '0', '2023-10-04 18:04:51', 'admin', '2023-10-04 18:17:27', 'admin');
INSERT INTO `t_files` VALUES (2, '20210624223217286.jpeg', '20231009223608229c68d2bf5-25c9-4ea4-ab34-1a317ca2f246.jpeg', 'jpeg', '2023-10-09', '56465', 'image/jpeg', 'Y', 0, 'admin', '0', '2023-10-09 22:36:08', 'admin', '2023-10-09 22:36:08', 'admin');

-- ----------------------------
-- Table structure for uniqlo
-- ----------------------------
DROP TABLE IF EXISTS `uniqlo`;
CREATE TABLE `uniqlo`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `type` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '//',
  `size` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sex` char(2) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `photo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `sale_begin` datetime NULL DEFAULT NULL,
  `sale_end` datetime NULL DEFAULT NULL,
  `price` int NULL DEFAULT NULL,
  `lblob` longblob NULL,
  `delete_flg` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  `create_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `update_time` datetime NULL DEFAULT NULL,
  `update_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 49 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

-- ----------------------------
-- Records of uniqlo
-- ----------------------------
INSERT INTO `uniqlo` VALUES (1, '绵袜子', '01', '03', '01', 'qXKDBhq1jv', '2000-06-17 04:50:02', '2009-09-04 20:24:24', 87, NULL, 'h', '2014-11-19 15:47:15', 'zshen07', '2016-08-13 14:09:59', '2021-10-18');
INSERT INTO `uniqlo` VALUES (2, '春天衬衫', '02', '02', '00', 'qXKDBhq1jv', '2010-04-17 04:50:02', '2009-09-04 20:24:24', 87, NULL, 'h', '2014-11-19 15:47:15', 'zshen07', '2016-08-13 14:09:59', '2021-10-18');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `realname` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `gender` tinyint UNSIGNED NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 0 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = DYNAMIC;

DROP TABLE IF EXISTS `books`;
CREATE TABLE `books` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `book_name` varchar(60) DEFAULT NULL COMMENT '书名',
  `author_name` varchar(60) DEFAULT NULL COMMENT '作者',
  `price` double(10,2) DEFAULT NULL COMMENT '价格',
  `publication_day` datetime DEFAULT NULL COMMENT '出版日',
  `photo` varchar(200) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='书';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', 'tom', '202cb962ac59075b964b07152d234b70', 1);
INSERT INTO `user` VALUES (2, 'z3', 'tom', '202cb962ac59075b964b07152d234b70', 1);


DROP TABLE IF EXISTS `carInfo`;
CREATE TABLE `carInfo` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `carType` varchar(60) DEFAULT NULL COMMENT '车型',
  `photo` varchar(40) DEFAULT NULL COMMENT '图片',
  `odometer` tinyint unsigned DEFAULT NULL COMMENT '里程',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='汽车信息';


DROP TABLE IF EXISTS `snacks`;
CREATE TABLE `snacks` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL COMMENT '商品名称',
  `salary` double(10,2) DEFAULT NULL COMMENT '商品价格',
  `pof` datetime DEFAULT NULL COMMENT '赏味期限',
  `photo` varchar(200) DEFAULT NULL COMMENT '商品图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='おやつ';

DROP TABLE IF EXISTS `oshi`;
CREATE TABLE `oshi` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(40) DEFAULT NULL COMMENT '名前',
  `age` varchar(60) DEFAULT NULL COMMENT '年齢',
  `kamiiro` varchar(40) DEFAULT NULL COMMENT '髪色',

  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='人の情報';

DROP TABLE IF EXISTS `salesrecords`;

CREATE TABLE `salesrecords` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `product_name` varchar(40) DEFAULT NULL COMMENT '商品名',
  `price` varchar(60) DEFAULT NULL COMMENT '价格',
  `sales_date` datetime DEFAULT NULL COMMENT '售出日期',
 `picture` varchar(200) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='销售记录';

DROP TABLE IF EXISTS `mytruck`;
CREATE TABLE `mytruck` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `car_name` varchar(60) DEFAULT NULL COMMENT '公司名',
  `price` double(10,2) DEFAULT NULL COMMENT '价格',
  `product_day` datetime DEFAULT NULL COMMENT '生产日',
  `photo` varchar(200) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='卡车';

DROP TABLE IF EXISTS `food`;
CREATE TABLE `food` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `food_name` varchar(60) DEFAULT NULL COMMENT '食物名',
  `price` double(10,2) DEFAULT NULL COMMENT '价格',
  `product_day` datetime DEFAULT NULL COMMENT '生产日期',
  `photo` varchar(200) DEFAULT NULL COMMENT '图片路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='食品';


DROP TABLE IF EXISTS `snacks`;
CREATE TABLE `snacks` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL COMMENT '商品名称',
  `salary` double(10,2) DEFAULT NULL COMMENT '商品价格',
  `pof` datetime DEFAULT NULL COMMENT '赏味期限',
  `photo` varchar(200) DEFAULT NULL COMMENT '商品图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci  COMMENT='snacks';
