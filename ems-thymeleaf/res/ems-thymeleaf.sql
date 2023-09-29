DROP DATABASE
IF
	EXISTS `ems-thymeleaf`;
	
CREATE DATABASE
IF
	NOT EXISTS `ems-thymeleaf` CHARACTER 
	SET utf8mb4;
	
USE `ems-thymeleaf`;

DROP TABLE
IF
	EXISTS `employee`;
CREATE TABLE `employee` (
	`id` INT ( 11 ) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR ( 60 ) DEFAULT NULL COMMENT '员工姓名',
	`salary` DOUBLE ( 10, 2 ) DEFAULT NULL COMMENT '员工工资',
	`birthday` DATETIME DEFAULT NULL COMMENT '员工生日',
	`photo` VARCHAR ( 200 ) DEFAULT NULL COMMENT '头像路径',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE
IF
	EXISTS `user`;
CREATE TABLE `user` (
	`id` INT ( 11 ) UNSIGNED NOT NULL AUTO_INCREMENT,
	`username` VARCHAR ( 40 ) DEFAULT NULL COMMENT '用户名',
	`realname` VARCHAR ( 60 ) DEFAULT NULL COMMENT '真实姓名',
	`password` VARCHAR ( 40 ) DEFAULT NULL COMMENT '密码',
	`gender` TINYINT ( 1 ) UNSIGNED DEFAULT NULL COMMENT '性别',
	PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE
IF
	EXISTS `uniqlo`;
CREATE TABLE `uniqlo` (
	`id` INT ( 11 ) UNSIGNED NOT NULL AUTO_INCREMENT,
	`name` VARCHAR ( 60 ) DEFAULT NULL COMMENT '商品名称',
	`type` CHAR ( 2 ) DEFAULT NULL COMMENT '上身/下身/脚',
	`size` CHAR ( 2 ) DEFAULT NULL COMMENT '尺寸规格',
	`sex` CHAR ( 2 ) DEFAULT NULL COMMENT '适用性别',
	`photo` VARCHAR ( 200 ) DEFAULT NULL COMMENT '商品照片路径',
	`saleBegin` DATETIME DEFAULT NULL COMMENT '销售开始日',
	`saleEnd` DATETIME DEFAULT NULL COMMENT '销售终了日',
	`price` INT ( 10 ) DEFAULT NULL COMMENT '单价',
	`delete_flg` CHAR ( 1 ) NOT NULL COMMENT '削除フラグ',
	`create_time` DATETIME NULL COMMENT '登録日時',
	`create_user_id` VARCHAR ( 20 ) NULL COMMENT '登録者',
	`update_time` DATETIME NULL COMMENT '更新日時',
	`update_user_id` VARCHAR ( 20 ) NULL COMMENT '更新者',
	PRIMARY KEY ( `id` ) 
) COMMENT = '优衣库' ENGINE = INNODB DEFAULT CHARSET = utf8mb4;

DROP TABLE
IF
	EXISTS `m_code`;
CREATE TABLE `m_code` (
	`key` VARCHAR ( 20 ) COMMENT 'key',
	`code` CHAR ( 2 ) DEFAULT NULL COMMENT 'code',
	`value` VARCHAR ( 50 ) DEFAULT NULL COMMENT 'value',
	`delete_flg` CHAR ( 1 ) NOT NULL COMMENT '削除フラグ',
	`create_time` DATETIME NULL COMMENT '登録日時',
	`create_user_id` VARCHAR ( 20 ) NULL COMMENT '登録者',
	`update_time` DATETIME NULL COMMENT '更新日時',
	`update_user_id` VARCHAR ( 20 ) NULL COMMENT '更新者',
PRIMARY KEY ( `key` ) 
) COMMENT = 'm_code' ENGINE = INNODB DEFAULT CHARSET = utf8mb4;