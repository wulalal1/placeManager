/*
 Navicat Premium Data Transfer

 Source Server         : mysql8.0
 Source Server Type    : MySQL
 Source Server Version : 80027
 Source Host           : localhost:3306
 Source Schema         : manager

 Target Server Type    : MySQL
 Target Server Version : 80027
 File Encoding         : 65001

 Date: 06/03/2024 10:49:17
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '姓名',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像',
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '角色标识',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '管理员' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, 'adad', '123', 'adad', 'http://localhost:9090/files/1706415920876-1702440416641-微信截图_20231114162559.png', 'ADMIN', '123423', '123131');
INSERT INTO `admin` VALUES (2, 'admin', 'admin', 'admin', 'http://localhost:9090/files/1706435281291-1697438073596-avatar.png', 'ADMIN', '123142231', '313131231231@12131');

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '标题',
  `content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci COMMENT '内容',
  `descr` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简介',
  `cover` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '封面',
  `tags` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '标签',
  `user_id` int(0) DEFAULT NULL COMMENT '发布人ID',
  `date` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发布日期',
  `read_count` int(0) DEFAULT 0 COMMENT '浏览量',
  `category_id` int(0) DEFAULT NULL COMMENT '分类ID',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '名称分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES (2, '2', '', '2', 'http://localhost:9090/files/1705309695714-1702440416641-微信截图_20231114162559.png', '[\"战绩\",\"代码人生\"]', 4, NULL, 1, 3);
INSERT INTO `blog` VALUES (4, '444', '', NULL, 'http://localhost:9090/files/1705316101173-1702437704985-微信截图_20231018172512.png', '[\"今日心得\",\"技术经验\"]', 10, NULL, 11, 1);
INSERT INTO `blog` VALUES (5, '12312', NULL, '1231', 'http://localhost:9090/files/1705316146200-1702523483497-微信截图_20231018172452.png', '[\"今日心得\",\"技术经验\"]', 10, NULL, 3, 1);
INSERT INTO `blog` VALUES (6, '天气不错', '<p><img src=\"http://localhost:9090/files/1705399422031-1702437658057-微信截图_20231114162539.png\" style=\"max-width:100%;\" contenteditable=\"false\"/><br/></p>', '哈哈哈哈哈', 'http://localhost:9090/files/1705399525680-1697438073596-avatar.png', '[\"今日心得\",\"技术经验\"]', 10, '2024-01-15', 2, 1);
INSERT INTO `blog` VALUES (7, 'wqwq', '<p>adwadasdawd<br/></p>', 'qweqweq', 'http://localhost:9090/files/1705818285939-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-21', 0, 1);
INSERT INTO `blog` VALUES (8, '12312', NULL, '1231', 'http://localhost:9090/files/1705316146200-1702523483497-微信截图_20231018172452.png', '[\"今日心得\",\"技术经验\"]', 10, NULL, 2, 1);
INSERT INTO `blog` VALUES (9, 'wqwq', '<p>adwadasdawd<br/></p>', 'qweqweq', 'http://localhost:9090/files/1705818285939-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-21', 0, 1);
INSERT INTO `blog` VALUES (10, 'wqwq', '<p>adwadasdawd<br/></p>', 'qweqweq', 'http://localhost:9090/files/1705818285939-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-21', 0, 1);
INSERT INTO `blog` VALUES (11, '天气不错', '<p><img src=\"http://localhost:9090/files/1705399422031-1702437658057-微信截图_20231114162539.png\" style=\"max-width:100%;\" contenteditable=\"false\"/><br/></p>', '哈哈哈哈哈', 'http://localhost:9090/files/1705399525680-1697438073596-avatar.png', '[\"今日心得\",\"技术经验\"]', 10, '2024-01-15', 5, 1);
INSERT INTO `blog` VALUES (12, '爱吃大米', '<p>阿文i带我i好的</p><h1 data-we-empty-p=\"\" id=\"2imoe\">大王的阿瓦达完成</h1><p><img src=\"http://localhost:9090/files/1705998851996-1702437704985-微信截图_20231018172512.png\" style=\"max-width:100%;\" contenteditable=\"false\"/><br/></p><p><br/></p><pre><code class=\"C\"><span class=\"hljs-function\">include\n<span class=\"hljs-type\">int</span> <span class=\"hljs-title\">main</span><span class=\"hljs-params\">()</span></span>{\n   <span class=\"hljs-built_in\">printf</span>(<span class=\"hljs-string\">\"hellow world\"</span>)\n}</code></pre>', '21313i阿斯回答哈哈i哦啊东海大数据等哈我的\n啊等哈我等哈的', 'http://localhost:9090/files/1705998590311-1702610909080-钱.png', '[\"技术经验\",\"今日心得\"]', 4, '2024-01-23', 56, 1);
INSERT INTO `blog` VALUES (14, '帕瓦', '<p>鮘啊大大嗷嗷啊我的阿文的阿瓦达啊我的啊打的啊的啊打的啊的啊啊的啊啊 啊打 啊打 啊啊啊打<br/></p>', '呜啦啦', 'http://localhost:9090/files/1706189272527-1702611613279-钱包.png', '[\"技术经验\",\"今日心得\"]', NULL, '2024-01-25', 0, 2);
INSERT INTO `blog` VALUES (16, '123123123', '<p>132131231<br/></p>', '123131313', 'http://localhost:9090/files/1706324177884-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (17, '123123123', '<p>132131231<br/></p>', '123131313', 'http://localhost:9090/files/1706324177884-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (18, '123123123', '<p>132131231<br/></p>', '123131313', 'http://localhost:9090/files/1706324177884-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (19, '怕哇哇骄傲我觉得急啊', '<p>觉得姐姐啊我<br/></p>', '哇哈哈哈哈', 'http://localhost:9090/files/1706324177884-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (20, '那你是撒', '<p>123123123<br/></p>', '仨孩子', 'http://localhost:9090/files/1706324577576-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (21, '难拿', '<p>1231231<br/></p>', '大大大', 'http://localhost:9090/files/1706324768486-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', NULL, '2024-01-27', 0, 1);
INSERT INTO `blog` VALUES (22, '难拿', '<p>1231231<br/></p>', '大大大', 'http://localhost:9090/files/1706324768486-1702437704985-微信截图_20231018172512.png', '[\"技术经验\"]', 10, '2024-01-27', 1, 1);
INSERT INTO `blog` VALUES (23, '帕瓦阿文灌灌灌灌', '<p>1231231<br/></p>', 'd打球真好', 'http://localhost:9090/files/1706335416687-1702611419805-钱.png', '[\"技术经验\"]', 10, '2024-01-27', 30, 1);

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分类名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '名称分类' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, '技术经验');
INSERT INTO `category` VALUES (2, '今日心得');
INSERT INTO `category` VALUES (3, '代码人生');
INSERT INTO `category` VALUES (4, '战绩');

-- ----------------------------
-- Table structure for collect
-- ----------------------------
DROP TABLE IF EXISTS `collect`;
CREATE TABLE `collect`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fid` int(0) DEFAULT NULL COMMENT '关联ID',
  `user_id` int(0) DEFAULT NULL COMMENT '点赞人ID',
  `module` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模块',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '收藏' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of collect
-- ----------------------------
INSERT INTO `collect` VALUES (33, 12, 10, '博客');
INSERT INTO `collect` VALUES (37, 4, 10, '博客');
INSERT INTO `collect` VALUES (40, 23, 10, '博客');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `content` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '内容',
  `user_id` int(0) DEFAULT NULL COMMENT '评论人',
  `pid` int(0) DEFAULT NULL COMMENT '父级ID',
  `root_id` int(0) DEFAULT NULL COMMENT '根节点ID',
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '评论时间',
  `fid` int(0) DEFAULT NULL COMMENT '关联ID',
  `module` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模块',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '评论表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES (4, '帕瓦', 13, NULL, 4, '2024-01-24 21:34:41', 12, '博客');
INSERT INTO `comment` VALUES (5, '这是回复', 10, 4, 4, '2022-22-11', 12, '博客');
INSERT INTO `comment` VALUES (6, '回复2', 13, 5, 4, '21:34:41', 12, '博客');
INSERT INTO `comment` VALUES (7, '工资最好的就是摆烂', 13, NULL, 7, '2024-01-24 23:05:50', 12, '博客');
INSERT INTO `comment` VALUES (20, 'hhhhhh ', 10, NULL, 20, '2024-01-27 13:43:09', 12, '博客');
INSERT INTO `comment` VALUES (21, 'hhhhh \n', 10, NULL, 21, '2024-01-27 13:47:50', 23, '博客');
INSERT INTO `comment` VALUES (22, '话语权', NULL, NULL, 22, '2024-01-27 14:04:59', 12, '博客');

-- ----------------------------
-- Table structure for equipment
-- ----------------------------
DROP TABLE IF EXISTS `equipment`;
CREATE TABLE `equipment`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT '序号',
  `equip_code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '器材编号',
  `equip_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '器材名称',
  `equip_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '器材类型',
  `price` decimal(10, 2) DEFAULT NULL COMMENT '单价',
  `equip_picture` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '器材图片',
  `longth` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '长度',
  `width` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '宽度',
  `high` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '高度',
  `weight` double DEFAULT NULL COMMENT '重量',
  `number` int(0) DEFAULT NULL COMMENT '数量',
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT ' 状态(借出/未借出)',
  `producer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '生产厂家',
  `purchasing_date` datetime(0) DEFAULT NULL COMMENT '购买日期',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of equipment
-- ----------------------------
INSERT INTO `equipment` VALUES (1, 'ck001234', '羽毛球拍', '0', 25.60, 'http://localhost:9090/files/1709691197814-微信截图_20240303222023.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (2, 'ck00321', '羽毛球', '1', 22.00, 'http://localhost:9090/files/1709692173581-羽毛球.jpg', '10', NULL, NULL, NULL, 10, NULL, NULL, '2024-03-06 08:00:00', NULL);
INSERT INTO `equipment` VALUES (7, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (8, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (9, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (10, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (11, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (12, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (13, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');
INSERT INTO `equipment` VALUES (15, 'ck00123', '羽毛球拍', '1', 25.60, 'http://localhost:9090/files/1709643728979-微信截图_20240303221827.png', '11', '12', '4', 60, 55, '1', '几个号', '2024-03-04 08:00:00', '524');

-- ----------------------------
-- Table structure for likes
-- ----------------------------
DROP TABLE IF EXISTS `likes`;
CREATE TABLE `likes`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `fid` int(0) DEFAULT NULL COMMENT '关联ID',
  `user_id` int(0) DEFAULT NULL COMMENT '点赞人ID',
  `module` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '模块',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 27 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '点赞' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of likes
-- ----------------------------
INSERT INTO `likes` VALUES (18, 11, 10, '博客');
INSERT INTO `likes` VALUES (19, 12, 10, '博客');
INSERT INTO `likes` VALUES (20, 4, 10, '博客');
INSERT INTO `likes` VALUES (23, 23, 10, '博客');
INSERT INTO `likes` VALUES (26, 12, 1, '博客');

-- ----------------------------
-- Table structure for notice
-- ----------------------------
DROP TABLE IF EXISTS `notice`;
CREATE TABLE `notice`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `title` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '内容',
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建时间',
  `user` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '创建人',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '公告信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of notice
-- ----------------------------
INSERT INTO `notice` VALUES (5, 'adada', '21313', '2024-01-14', 'admin');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `order_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '订单编号',
  `user_id` int(0) DEFAULT NULL COMMENT '用户ID',
  `place_id` int(0) DEFAULT NULL COMMENT '场地ID',
  `type_id` int(0) DEFAULT NULL COMMENT '场地信息ID',
  `time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预订时间',
  `in_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '使用时间',
  `out_time` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '离开时间',
  `status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '订单状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '预订信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for place
-- ----------------------------
DROP TABLE IF EXISTS `place`;
CREATE TABLE `place`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `place_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '场地编号',
  `place_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '场地名称',
  `place_long` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地长',
  `place_wide` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地宽',
  `place_nature` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地性质',
  `place_charge` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地费用',
  `start_time` datetime(0) DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime(0) DEFAULT NULL COMMENT '结束时间',
  `place_satus` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '场地状态',
  `place_owner` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地归属者',
  `place_avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地图片',
  `remarks` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '场地信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of place
-- ----------------------------
INSERT INTO `place` VALUES (10, 'CDBH681805769095684096', '场馆一', '100', '100', '0', '500', '2024-02-13 00:00:00', '2024-02-14 00:00:00', '1', '测试', 'http://localhost:9090/files/1709643999153-20111121154530F6C.jpg', '1');
INSERT INTO `place` VALUES (11, 'CDBH681840915500933120', '场馆二', '200', '800', '2', '69999', NULL, NULL, '1', '个人', 'http://localhost:9090/files/1709644007085-1631243526276707.jpg', 'ces');
INSERT INTO `place` VALUES (12, 'CDBH681853130211762176', '场馆三', '1000', '2000', '0', '2666', NULL, NULL, '1', '个人', 'http://localhost:9090/files/1709644019369-30744973179935518.jpg', 'ces');
INSERT INTO `place` VALUES (13, 'CDBH682593753650864128', '场馆四', '133', '2333', '0', '245', NULL, NULL, '1', '个人', 'http://localhost:9090/files/1709644025383-1666684130274080294.jpg', '测试');

-- ----------------------------
-- Table structure for reservation
-- ----------------------------
DROP TABLE IF EXISTS `reservation`;
CREATE TABLE `reservation`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `place_code` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '场地编号',
  `start_time` datetime(0) DEFAULT NULL COMMENT '开始时间',
  `end_time` datetime(0) DEFAULT NULL COMMENT '结束时间',
  `reservation_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约姓名',
  `reservation_p_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约人姓名',
  `reservation_p_phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约人电话',
  `reservation_status` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约状态',
  `reservation_reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约原因',
  `user_id` int(0) DEFAULT NULL COMMENT '用户表的主键',
  `reservation_qx_reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约取消原因',
  `reservation_type` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '预约类型',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of reservation
-- ----------------------------
INSERT INTO `reservation` VALUES (1, 'CDBH681853130211762176', '2024-01-25 01:00:00', '2024-01-04 00:02:00', '测试', '测试', '测试', '0', '测试', 10, NULL, '0');
INSERT INTO `reservation` VALUES (2, 'CDBH681840915500933120', '2024-02-01 00:00:00', '2024-02-10 00:00:00', '测试', '测试', '测试', '1', '测试', 11, NULL, '0');
INSERT INTO `reservation` VALUES (3, 'CDBH681805769095684096', '2024-02-07 00:00:00', '2024-02-15 05:00:00', '测试', '测试', '测试', '0', '测试测', 10, NULL, '4');
INSERT INTO `reservation` VALUES (5, 'CDBH681805769095684098', '2024-01-25 01:00:00', '2024-01-04 00:02:00', 'asd', 'aa', '13209911225', '2', NULL, 10, NULL, '1');
INSERT INTO `reservation` VALUES (6, 'CDBH681805769095684096', '2024-02-27 18:44:40', '2024-02-28 00:00:00', '张三的预约', '张三', '15100223366', '1', NULL, 10, NULL, '0');
INSERT INTO `reservation` VALUES (7, 'CDBH681853130211762176', '2024-02-26 00:00:00', '2024-02-27 00:00:00', '阿萨斯', '杀手', '514515165', '1', '暗示', 10, NULL, '1');
INSERT INTO `reservation` VALUES (8, 'CDBH681853130211762176', '2024-02-26 00:00:00', '2024-02-27 18:55:08', '朱雷专用', '朱雷', '15099338257', '1', '团建', 10, NULL, '2');
INSERT INTO `reservation` VALUES (9, 'CDBH682593753650864128', '2024-02-27 19:32:19', '2024-02-28 00:00:00', '娃哈哈', '娃哈哈', '099012345678', '0', '锻炼', 10, NULL, '0');
INSERT INTO `reservation` VALUES (10, 'CDBH681853130211762176', '2024-02-26 00:00:00', '2024-02-27 19:34:06', '嗷嗷嗷', '啊啊', '1545', '0', NULL, 10, NULL, '2');
INSERT INTO `reservation` VALUES (11, 'CDBH681853130211762176', '2024-02-28 19:37:36', '2024-02-29 00:00:00', '阿萨啊', 'AAA', '656565', '0', NULL, 10, NULL, '0');
INSERT INTO `reservation` VALUES (12, 'CDBH681805769095684096', '2024-02-29 00:00:00', '2024-03-01 00:00:00', '临时预定', '奥特曼', '165132166', '0', '团建', 10, NULL, '0');
INSERT INTO `reservation` VALUES (17, 'CDBH681805769095684096', '2024-03-02 16:10:57', '2024-03-02 20:10:53', '朱雷的预约', '朱雷雷', '1234564787', '0', '团建', 10, NULL, '0');
INSERT INTO `reservation` VALUES (18, 'CDBH681805769095684096', '2024-03-02 16:10:57', '2024-03-02 20:10:53', '李四的预约', '李四', '12345678', '0', '玩', 10, NULL, '0');
INSERT INTO `reservation` VALUES (19, 'CDBH681805769095684096', '2024-03-01 10:31:39', '2024-03-02 00:00:00', '实打实', '阿打算', '1313', '0', '阿达', 10, NULL, '0');
INSERT INTO `reservation` VALUES (20, 'CDBH681805769095684096', '2024-03-03 00:00:00', '2024-03-04 17:35:03', '布鲁斯的预定', '布鲁斯', '123456546', '0', '娱乐', 10, NULL, '0');
INSERT INTO `reservation` VALUES (21, 'CDBH681853130211762176', '2024-03-06 00:00:00', '2024-03-08 17:50:55', '李小龙的预约', '李', '1545415163', '0', '比赛', 10, NULL, '2');

-- ----------------------------
-- Table structure for type
-- ----------------------------
DROP TABLE IF EXISTS `type`;
CREATE TABLE `type`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分类名称',
  `description` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '分类描述',
  `num` int(0) DEFAULT 0 COMMENT '剩余场地',
  `place_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地ID',
  `img` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '场地图片',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 10 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '场地分类表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of type
-- ----------------------------
INSERT INTO `type` VALUES (2, '对外羽毛球馆', '训练专用场地', 2, '10', 'http://localhost:9090/files/1705924457443-1702606278820-微信截图_20231117155415.png');
INSERT INTO `type` VALUES (3, '123', '比赛专用场地', 0, '11', 'http://localhost:9090/files/1705925652421-1702437658057-微信截图_20231114162539.png');
INSERT INTO `type` VALUES (8, '21', '训练专用场地', 0, '12', 'http://localhost:9090/files/1706515367926-1702606681313-微信截图_20231117155534.png');
INSERT INTO `type` VALUES (9, '656512', '比赛专用场地', 0, '13', 'http://localhost:9090/files/1709643988428-30744973179935518.jpg');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(0) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `username` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '密码',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '姓名',
  `avatar` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '头像',
  `role` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '角色标识',
  `sex` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `phone` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '电话',
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简介',
  `birth` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '生日',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_unicode_ci COMMENT = '用户信息' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (4, 'aaaaaa', '123', '小绿', 'http://localhost:9090/files/1706002852529-1702440416641-微信截图_20231114162559.png', 'USER', '女', '1231231312313', '1243123123', '效率', NULL);
INSERT INTO `user` VALUES (8, 'aaaaaaaaaa', '123', NULL, NULL, 'USER', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (9, '呜啦啦', '123', '阿卡', NULL, 'USER', '男', '123882631', NULL, '啊阿达啊达瓦大屋顶adwadaw', '2024-01-22');
INSERT INTO `user` VALUES (10, 'cccc', '123', '小红', 'http://localhost:9090/files/1705820496567-1697438073596-avatar.png', 'USER', '男', '1231231', '1231@1231', '请问请问请问请问委屈恶趣味', '2024-01-22');
INSERT INTO `user` VALUES (11, 'acc', '123', NULL, NULL, 'USER', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (12, 'bbb', '123', NULL, NULL, 'USER', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `user` VALUES (13, 'ass', '1234', 'aaa', 'http://localhost:9090/files/1705163512237-1697438073596-avatar.png', 'USER', NULL, '123123', '131312@21312', NULL, NULL);
INSERT INTO `user` VALUES (15, '123', '123', NULL, NULL, 'USER', NULL, NULL, NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
