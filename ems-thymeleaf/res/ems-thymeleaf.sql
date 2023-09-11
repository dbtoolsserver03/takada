drop database IF EXISTS `ems-thymeleaf`;
create database IF NOT EXISTS `ems-thymeleaf` character set utf8mb4;
use `ems-thymeleaf`;
-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL COMMENT '员工姓名',
  `salary` double(10,2) DEFAULT NULL COMMENT '员工工资',
  `birthday` datetime DEFAULT NULL COMMENT '员工生日',
  `photo` varchar(200) DEFAULT NULL COMMENT '头像路径',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(40) DEFAULT NULL COMMENT '用户名',
  `realname` varchar(60) DEFAULT NULL COMMENT '真实姓名',
  `password` varchar(40) DEFAULT NULL COMMENT '密码',
  `gender` tinyint(1) unsigned DEFAULT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

