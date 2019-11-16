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

 Date: 15/10/2019 19:34:57
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zhouyujun_user
-- ----------------------------
DROP TABLE IF EXISTS `zhouyujun_user`;
CREATE TABLE `zhouyujun_user`  (
  `user_id` int(255) NOT NULL COMMENT '编号',
  `user_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '电话',
  `user_email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '邮箱',
  `user_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '昵称',
  `user_pwd` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '密码',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
