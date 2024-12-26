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
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC COMMENT='社員テーブル';


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
delete from `m_code`;
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','01','東',1,'東',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','02','南',2,'南',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','03','西',3,'西',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','04','北',4,'北',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','05','東北',5,'東北',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','06','東南',6,'東南',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','07','西南',7,'西南',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_direction','08','西北',8,'西北',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_madori','01','1LDK',1,'1LDK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_madori','02','2LDK',2,'2LDK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_madori','03','3LDK',3,'3LDK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_madori','04','4LDK',4,'4LDK',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_madori','05','5LDK以上',5,'5LDK以上',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_point','01','温水洗浄便座',1,'温水洗浄便座',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_point','02','事務所利用可',2,'事務所利用可',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_point','03','東京ガス',3,'東京ガス',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_type','01','アパート',1,'アパート',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_type','02','マンション',2,'マンション','monnsyonn',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_type','03','タワーマンション',3,'タワーマンション',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('buken_type','04','一戸建て',4,'一戸建て',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('DENSYA_TYPE','01','JR',1,'JR',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('DENSYA_TYPE','02','東京メトロ',2,'東京メトロ',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('DENSYA_TYPE','03','西武鉄道',3,'西武鉄道',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('foreign_type','01','en',1,'en','1:en',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('foreign_type','02','zh',2,'zh','2:zh',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('foreign_type','03','jp',3,'jp','3:jp',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('foreign_type','04','france',4,'france','4:france',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','01','pg',1,'PG','1:pg',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','02','se',2,'SE','2:se',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','03','bse',3,'BSE','3:bse',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','04','spl',4,'SPL','4:spl',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','05','pl',5,'PL','5:pl',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','06','pmo',6,'PMO','6:pmo',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('job_role','07','pm',7,'PM','7:pm',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('sex','01',NULL,1,'man','01:man',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
insert into `m_code` (`m_key`, `m_code`, `m_value`, `m_order`, `m_display1`, `m_display2`, `m_display3`, `m_display4`, `m_display5`, `m_display6`, `m_display7`, `m_display8`, `m_display9`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('sex','02',NULL,2,'women','00:women',NULL,NULL,NULL,NULL,NULL,NULL,NULL,'0',NULL,NULL,NULL,NULL);
delete from `m_densya`;
insert into `m_densya` (`densya_type`, `densya_no`, `densya_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',1,'山手線','0','2024/12/08 15:29:21',NULL,'2024/12/08 15:29:21',NULL);
insert into `m_densya` (`densya_type`, `densya_no`, `densya_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',2,'埼京線','0','2024/12/08 15:29:21',NULL,'2024/12/08 15:29:21',NULL);
insert into `m_densya` (`densya_type`, `densya_no`, `densya_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',3,'京浜東北線','0','2024/12/08 15:29:21',NULL,'2024/12/08 15:29:21',NULL);
insert into `m_densya` (`densya_type`, `densya_no`, `densya_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('02',1,'銀座線','0','2024/12/08 15:32:09',NULL,'2024/12/08 15:32:09',NULL);
delete from `m_densya_eki`;
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',1,1,'東京','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',1,2,'神田','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',1,3,'秋葉原','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',2,1,'池袋','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',2,2,'板橋','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',2,3,'十条','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('01',2,4,'赤羽','0','2024/12/08 15:29:34',NULL,'2024/12/08 15:29:34',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('02',1,1,'渋谷','0','2024/12/08 15:33:06',NULL,'2024/12/08 15:33:06',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('02',1,2,'表参道','0','2024/12/08 15:33:06',NULL,'2024/12/08 15:33:06',NULL);
insert into `m_densya_eki` (`densya_type`, `densya_no`, `eki_no`, `eki_name`, `delete_flg`, `create_time`, `create_user_id`, `update_time`, `update_user_id`) values ('02',1,3,'外苑前','0','2024/12/08 15:33:06',NULL,'2024/12/08 15:33:06',NULL);

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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;


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
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='学生テーブル';

DROP TABLE IF EXISTS `t_buken`;

CREATE TABLE `t_buken` (
  `buken_id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'NO',
  `location` varchar(100) DEFAULT NULL COMMENT '所在地',
  `densya_type` char(2)  COMMENT '電車種別',
  `densya_no` int unsigned  COMMENT '電車番号',
  `eki_no` int unsigned  COMMENT '駅番号',
  `near_station_time` int unsigned DEFAULT NULL COMMENT '最寄り駅まで徒歩何分',
  `buken_year` int unsigned DEFAULT NULL COMMENT '築年数',
  `madori` char(2) DEFAULT NULL COMMENT '間取り',
  `area` int unsigned DEFAULT NULL COMMENT '面積',
  `direction` char(2) DEFAULT NULL COMMENT '向き',
  `buken_condition` varchar(100) DEFAULT NULL COMMENT '限定条件',
  `money_rent` int unsigned DEFAULT NULL COMMENT '賃料',
  `money_deposit` int unsigned DEFAULT NULL COMMENT '敷金',
  `money_gift` int unsigned DEFAULT NULL COMMENT '礼金',
  `money_management` int unsigned DEFAULT NULL COMMENT '管理費/共益費',
  `buken_type` char(2) DEFAULT NULL COMMENT '建物種別',
  `device` varchar(100) DEFAULT NULL COMMENT '設備',
  `delete_flg` char(1) NOT NULL DEFAULT '0' COMMENT '削除フラグ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`buken_id`)
) ENGINE=InnoDB  COMMENT='賃貸不動産テーブル';

DROP TABLE IF EXISTS `t_buken_icon`;

CREATE TABLE `t_buken_icon` (
  `buken_id` int unsigned NOT NULL COMMENT '物件番号',
  `sub_id` int unsigned NOT NULL COMMENT '枝番',
  `url` varchar(1000) DEFAULT NULL COMMENT 'アイコン',
  `delete_flg` char(1) NOT NULL DEFAULT '0' COMMENT '削除フラグ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`buken_id`,`sub_id`)
) ENGINE=InnoDB  COMMENT='物件アイコンテーブル';

DROP TABLE IF EXISTS `t_company`;

CREATE TABLE `t_company` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(255) DEFAULT NULL COMMENT '名前',
  `type` char(1) DEFAULT NULL COMMENT '1:合同会社 2:株式会社',
  `create_date` date DEFAULT NULL COMMENT '創立日',
  `icon` varchar(1000) DEFAULT NULL COMMENT '画像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  COMMENT='会社テーブル';


DROP TABLE IF EXISTS `m_densya`;
CREATE TABLE `m_densya` (
`densya_type` char(2) COMMENT '電車種別',
`densya_no`int unsigned COMMENT '電車番号',
`densya_name` varchar(50) DEFAULT NULL COMMENT '電車の名前',
  `delete_flg` char(1) NOT NULL DEFAULT '0' COMMENT '削除フラグ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
 PRIMARY KEY (`densya_type`,`densya_no`)
) COMMENT='電車テーブル';



DROP TABLE IF EXISTS `m_densya_eki`;
CREATE TABLE `m_densya_eki` (
`densya_type` char(2) COMMENT '電車種別',
`densya_no`int unsigned COMMENT '電車番号',
`eki_no`int unsigned COMMENT '駅番号',
`eki_name` varchar(50) DEFAULT NULL COMMENT '駅の名前',
  `delete_flg` char(1) NOT NULL DEFAULT '0' COMMENT '削除フラグ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
 PRIMARY KEY (`densya_type`,`densya_no`,`eki_no`)
) COMMENT='電車駅テーブル';
