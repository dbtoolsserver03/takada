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
CREATE TABLE `employee` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `salary` double(10,2) DEFAULT NULL,
  `birthday` datetime DEFAULT NULL,
  `photo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `sex` char(2) DEFAULT NULL,
  `foreign_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `job_role` char(2) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of employee
-- ----------------------------
BEGIN;
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (8, 's', 53.00, '1991-01-01 00:00:00', '20240209094603121.jpg', '02', '01,02', '04');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (9, 'cuishuangjia', 999.00, '1991-01-01 00:00:00', '20240209094620205.gif', '01', '01,02,03', '01');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (10, 'zhang31', 12.00, '1991-01-01 00:00:00', NULL, '00', '01,02', '05');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (11, 'a01dd', 2.00, '1991-01-01 00:00:00', '20240213160806482.jpg', '02', '01,03', '02');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (12, 'tanaka02', 53.00, '1991-01-01 00:00:00', NULL, '01', '02,03', '01');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (13, 'wang5', 120.00, '1991-01-01 00:00:00', NULL, '01', '01,03', '04');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (14, 'tanaka111', 53.00, '1991-01-01 00:00:00', NULL, '02', NULL, '02');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (15, 'aaaa', 53.00, '1991-01-01 00:00:00', NULL, '01', '02', '02');
INSERT INTO `employee` (`id`, `name`, `salary`, `birthday`, `photo`, `sex`, `foreign_type`, `job_role`) VALUES (16, 'wang5aaaa', 121333.99, '1991-01-01 00:00:00', NULL, '02', '01,02', '');
COMMIT;

-- ----------------------------
-- Table structure for m_code
-- ----------------------------
DROP TABLE IF EXISTS `m_code`;
CREATE TABLE `m_code` (
  `m_key` varchar(20) NOT NULL COMMENT 'キー',
  `m_code` char(2) NOT NULL COMMENT 'コード',
  `m_value` varchar(50) DEFAULT NULL COMMENT '内容',
  `m_order` int DEFAULT NULL COMMENT '並び順',
  `m_display1` varchar(60) DEFAULT NULL COMMENT '表示１',
  `m_display2` varchar(60) DEFAULT NULL COMMENT '表示２',
  `m_display3` varchar(60) DEFAULT NULL COMMENT '表示３',
  `m_display4` varchar(60) DEFAULT NULL COMMENT '表示４',
  `m_display5` varchar(60) DEFAULT NULL COMMENT '表示５',
  `m_display6` varchar(60) DEFAULT NULL COMMENT '表示６',
  `m_display7` varchar(60) DEFAULT NULL COMMENT '表示７',
  `m_display8` varchar(60) DEFAULT NULL COMMENT '表示８',
  `m_display9` varchar(60) DEFAULT NULL COMMENT '表示９',
  `delete_flg` char(1) NOT NULL COMMENT '削除フラグ',
  `create_time` datetime DEFAULT NULL COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT NULL COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`m_key`,`m_code`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='マスタコード';

-- ----------------------------
-- Records of m_code
-- ----------------------------
BEGIN;
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('foreign_type', '01', 'en', 1, 'en', '1:en', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('foreign_type', '02', 'zh', 2, 'zh', '2:zh', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('foreign_type', '03', 'jp', 3, 'jp', '3:jp', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '01', 'pg', 1, 'PG', '1:pg', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '02', 'se', 2, 'SE', '2:se', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '03', 'bse', 3, 'BSE', '3:bse', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '04', 'spl', 4, 'SPL', '4:spl', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '05', 'pl', 5, 'PL', '5:pl', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '06', 'pmo', 6, 'PMO', '6:pmo', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('job_role', '07', 'pm', 7, 'PM', '7:pm', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('sex', '01', '男', 1, '男', '01:男', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
INSERT INTO `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES ('sex', '02', '女', 2, '女', '00:女', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '0', NULL, NULL, NULL, NULL);
COMMIT;

-- ----------------------------
-- Table structure for t_files
-- ----------------------------
DROP TABLE IF EXISTS `t_files`;
CREATE TABLE `t_files` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'key',
  `old_file_name` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `new_file_name` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `ext` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `path` varchar(300) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `size` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `type` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `is_img` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `downcounts` int DEFAULT '0',
  `username` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `delete_flg` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT '0',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `create_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_user_id` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of t_files
-- ----------------------------
BEGIN;
INSERT INTO `t_files` (`id`, `old_file_name`, `new_file_name`, `ext`, `path`, `size`, `type`, `is_img`, `downcounts`, `username`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES (1, '20210624223336247.jpeg', '20231004180451794a3d25cb4-72e1-475c-b8a5-1e0a2472de08.jpeg', 'jpeg', '2023-10-04', '85209', 'image/jpeg', 'Y', 3, 'admin', '0', '2023-10-04 18:04:51', 'admin', '2023-10-04 18:17:27', 'admin');
INSERT INTO `t_files` (`id`, `old_file_name`, `new_file_name`, `ext`, `path`, `size`, `type`, `is_img`, `downcounts`, `username`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) VALUES (2, '20210624223217286.jpeg', '20231009223608229c68d2bf5-25c9-4ea4-ab34-1a317ca2f246.jpeg', 'jpeg', '2023-10-09', '56465', 'image/jpeg', 'Y', 0, 'admin', '0', '2023-10-09 22:36:08', 'admin', '2023-10-09 22:36:08', 'admin');
COMMIT;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `realname` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `gender` tinyint unsigned DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` (`id`, `username`, `realname`, `password`, `gender`) VALUES (1, 'admin', 'tom', '202cb962ac59075b964b07152d234b70', 1);
INSERT INTO `user` (`id`, `username`, `realname`, `password`, `gender`) VALUES (2, 'z3', 'tom', '202cb962ac59075b964b07152d234b70', 1);
COMMIT;
