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
  `name` varchar(60) DEFAULT NULL COMMENT '员工姓名',
  `salary` double(10,2) DEFAULT NULL COMMENT '员工工资',
  `birthday` datetime DEFAULT NULL COMMENT '员工生日',
  `photo` varchar(200) DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Table structure for m_code
-- ----------------------------
DROP TABLE IF EXISTS `m_code`;
CREATE TABLE `m_code` (
  `key` varchar(20) NOT NULL COMMENT 'key',
  `code` char(2) DEFAULT NULL COMMENT 'code',
  `value` varchar(50) DEFAULT NULL COMMENT 'value',
  `delete_flg` char(1) NOT NULL COMMENT '削除フラグ',
  `create_time` datetime DEFAULT NULL COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT NULL COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='m_code';

-- ----------------------------
-- Table structure for t_files
-- ----------------------------
DROP TABLE IF EXISTS `t_files`;
CREATE TABLE `t_files` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT 'key',
  `old_file_name` varchar(200) DEFAULT NULL COMMENT '文件原始名称',
  `new_file_name` varchar(50) DEFAULT NULL COMMENT '文件的新名称	',
  `ext` varchar(50) DEFAULT NULL COMMENT '文件后缀',
  `path` varchar(50) DEFAULT NULL COMMENT '存储路径	',
  `size` varchar(50) DEFAULT NULL COMMENT '文件大小	',
  `type` varchar(50) DEFAULT NULL COMMENT '类型	',
  `is_img` varchar(50) DEFAULT NULL COMMENT '是否是图片	',
  `downcounts` int DEFAULT 0 COMMENT '下载次数	',
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `delete_flg` char(1) NOT NULL COMMENT '削除フラグ',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='文件上传下载';

-- ----------------------------
-- Table structure for uniqlo
-- ----------------------------
DROP TABLE IF EXISTS `uniqlo`;
CREATE TABLE `uniqlo` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL COMMENT '商品名称',
  `type` char(2) DEFAULT NULL COMMENT '上身/下身/脚',
  `size` char(2) DEFAULT NULL COMMENT '尺寸规格',
  `sex` char(2) DEFAULT NULL COMMENT '适用性别',
  `photo` varchar(200) DEFAULT NULL COMMENT '商品照片路径',
  `sale_begin` datetime DEFAULT NULL COMMENT '销售开始日',
  `sale_end` datetime DEFAULT NULL COMMENT '销售终了日',
  `price` int DEFAULT NULL COMMENT '单价',
  `delete_flg` char(1) NOT NULL COMMENT '削除フラグ',
  `create_time` datetime DEFAULT NULL COMMENT '登録日時',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '登録者',
  `update_time` datetime DEFAULT NULL COMMENT '更新日時',
  `update_user_id` varchar(20) DEFAULT NULL COMMENT '更新者',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='优衣库';

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `realname` varchar(60) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(40) DEFAULT NULL COMMENT '密码',
  `gender` tinyint unsigned DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
