/*
 Navicat Premium Data Transfer

 Source Server         : ykd
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : rm-bp1s8wez9j4hw42oemo.mysql.rds.aliyuncs.com:3306
 Source Schema         : dizi-01

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 16/11/2019 18:58:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zhouyujun_blogger
-- ----------------------------
DROP TABLE IF EXISTS `zhouyujun_blogger`;
CREATE TABLE `zhouyujun_blogger`  (
  `blogger_id` int(11) NOT NULL AUTO_INCREMENT,
  `blogger_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `blogger_tel` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `blogger_pwd` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  `blogger_sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL,
  PRIMARY KEY (`blogger_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
