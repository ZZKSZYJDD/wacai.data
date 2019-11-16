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

 Date: 16/11/2019 18:58:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for zhouyujun_blogs
-- ----------------------------
DROP TABLE IF EXISTS `zhouyujun_blogs`;
CREATE TABLE `zhouyujun_blogs`  (
  `blogs_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `blogs_title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '标题',
  `blogs_txt` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci COMMENT '内容',
  `blogs_author` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '作者',
  `blogs_date` datetime(0) DEFAULT NULL COMMENT '日期',
  `blogs_view` int(255) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '浏览量',
  `blogs_comment` int(255) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '评论量',
  `blogs_collection` int(255) UNSIGNED ZEROFILL DEFAULT NULL COMMENT '收藏量',
  PRIMARY KEY (`blogs_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 31 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
