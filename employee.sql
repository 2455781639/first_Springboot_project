/*
 Navicat Premium Data Transfer

 Source Server         : MySQL
 Source Server Type    : MySQL
 Source Server Version : 80023
 Source Host           : localhost:3306
 Source Schema         : mybatis

 Target Server Type    : MySQL
 Target Server Version : 80023
 File Encoding         : 65001

 Date: 13/05/2022 22:27:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `lastName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` int NULL DEFAULT NULL,
  `department` int NULL DEFAULT NULL,
  `birth` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `部门`(`department`) USING BTREE,
  CONSTRAINT `部门` FOREIGN KEY (`department`) REFERENCES `department` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 93 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES (1, 'Chris', '2455781639@qq.com', 1, 105, '2001-10-28 16:00:00');
INSERT INTO `employee` VALUES (73, 'Cris', '2458@qq.com', 0, 102, '2022-05-05 00:00:00');
INSERT INTO `employee` VALUES (74, 'Cris', '2458@qq.com', 0, 102, '2022-05-05 00:00:00');
INSERT INTO `employee` VALUES (75, 'Cris', '2458@qq.com', 0, 102, '2022-05-05 00:00:00');
INSERT INTO `employee` VALUES (76, 'Cris', '2458@qq.com', 0, 102, '2022-05-05 11:05:09');
INSERT INTO `employee` VALUES (80, 'Chris', '2455781639@qq.com', 1, 103, '2001-10-28 16:00:00');
INSERT INTO `employee` VALUES (85, 'Chris', '2455781639@qq.com', 1, 103, '2001-10-28 16:00:00');
INSERT INTO `employee` VALUES (90, 'Chris', 'zwz2455781639@gmail.com', 0, 104, '2001-10-28 16:00:00');
INSERT INTO `employee` VALUES (91, 'C', 'zwz2455781639@gmail.com', 0, 101, '2001-10-28 16:00:00');
INSERT INTO `employee` VALUES (92, 'Chris', '25781639@qq.com', 0, 106, '2001-10-28 16:00:00');

SET FOREIGN_KEY_CHECKS = 1;
