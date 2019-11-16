/*
 Navicat Premium Data Transfer

 Source Server         : waicai
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : rm-bp1s8wez9j4hw42oemo.mysql.rds.aliyuncs.com:3306
 Source Schema         : dizi-01

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 15/10/2019 19:36:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zhouyujun_bill
-- ----------------------------
DROP TABLE IF EXISTS `zhouyujun_bill`;
CREATE TABLE `zhouyujun_bill`  (
  `bill_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `bill_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '名称',
  `bill_date` date DEFAULT NULL COMMENT '日期',
  `bill_time` time(6) DEFAULT NULL COMMENT '时间',
  `bill_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '内容',
  `bill_money` double(255, 0) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '金额',
  PRIMARY KEY (`bill_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
