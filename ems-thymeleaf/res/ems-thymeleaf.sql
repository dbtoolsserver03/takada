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
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'NO',
  `name` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '名前',
  `salary` double(10,2) DEFAULT NULL COMMENT '給料',
  `birthday` datetime DEFAULT NULL COMMENT '年月日',
  `photo` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT 'アイコン',
  `sex` char(2) DEFAULT NULL COMMENT '性別',
  `foreign_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '外語',
  `job_role` char(2) DEFAULT NULL COMMENT '職位',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4  COMMENT='社員テーブル';


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='マスタコード';

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ;

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 ;


-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `student_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `student_name` varchar(255) DEFAULT NULL COMMENT '学生の名前',
  `student_pwd` varchar(255) DEFAULT NULL COMMENT '学生の暗証番号',
  `birthdate` datetime DEFAULT NULL COMMENT '学生の誕生日',
  `email` varchar(255) DEFAULT NULL COMMENT '学生のメールアドレス',
  PRIMARY KEY (`student_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='学生テーブル';

CREATE TABLE `t_company` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'NO',
  `name` varchar(60)  DEFAULT NULL COMMENT '会社名前',
  `type` char(2)  DEFAULT NULL COMMENT '会社類型　00:株式会社　01:合同会社',
  `peopleNum` int DEFAULT NULL COMMENT '会社人数',
  `beginDay` datetime DEFAULT NULL COMMENT '会社設立年月日',
  `photo` varchar(200)  DEFAULT NULL COMMENT 'アイコン',
  PRIMARY KEY (`id`) 
) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8mb4  COMMENT='会社テーブル';


