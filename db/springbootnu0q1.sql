-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: springbootnu0q1
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `baominghuodong`
--

DROP TABLE IF EXISTS `baominghuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baominghuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) DEFAULT NULL COMMENT '活动名称',
  `huodongshijian` datetime DEFAULT NULL COMMENT '活动时间',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `huodongneirong` longtext COMMENT '活动内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `zhiyuanzheshouji` varchar(200) DEFAULT NULL COMMENT 'Volunteer phonenumber',
  `baomingshijian` datetime DEFAULT NULL COMMENT '报名时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514642553 DEFAULT CHARSET=utf8 COMMENT='报名活动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baominghuodong`
--

LOCK TABLES `baominghuodong` WRITE;
/*!40000 ALTER TABLE `baominghuodong` DISABLE KEYS */;
INSERT INTO `baominghuodong` VALUES (81,'2021-04-27 09:03:07','活动名称1','2021-04-27 17:03:07','活动地点1','活动内容1','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian1.jpg','志愿者账号1','志愿者姓名1','Volunteer phonenumber1','2021-04-27 17:03:07','是',''),(82,'2021-04-27 09:03:07','活动名称2','2021-04-27 17:03:07','活动地点2','活动内容2','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian2.jpg','志愿者账号2','志愿者姓名2','Volunteer phonenumber2','2021-04-27 17:03:07','是',''),(83,'2021-04-27 09:03:07','活动名称3','2021-04-27 17:03:07','活动地点3','活动内容3','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian3.jpg','志愿者账号3','志愿者姓名3','Volunteer phonenumber3','2021-04-27 17:03:07','是',''),(84,'2021-04-27 09:03:07','活动名称4','2021-04-27 17:03:07','活动地点4','活动内容4','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian4.jpg','志愿者账号4','志愿者姓名4','Volunteer phonenumber4','2021-04-27 17:03:07','是',''),(85,'2021-04-27 09:03:07','活动名称5','2021-04-27 17:03:07','活动地点5','活动内容5','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian5.jpg','志愿者账号5','志愿者姓名5','Volunteer phonenumber5','2021-04-27 17:03:07','是',''),(86,'2021-04-27 09:03:07','活动名称6','2021-04-27 17:03:07','活动地点6','活动内容6','http://localhost:8080/springbootnu0q1/upload/baominghuodong_tupian6.jpg','志愿者账号6','志愿者姓名6','Volunteer phonenumber6','2021-04-27 17:03:07','是',''),(1619514642552,'2021-04-27 09:10:42','活动名称6','2021-04-27 17:03:07','活动地点6','活动内容6','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian6.jpg','123',NULL,NULL,NULL,'否',NULL);
/*!40000 ALTER TABLE `baominghuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/springbootnu0q1/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/springbootnu0q1/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/springbootnu0q1/upload/picture3.jpg'),(6,'homepage',NULL);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussliulangdongwuxinxi`
--

DROP TABLE IF EXISTS `discussliulangdongwuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussliulangdongwuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=137 DEFAULT CHARSET=utf8 COMMENT='流浪动物信息评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussliulangdongwuxinxi`
--

LOCK TABLES `discussliulangdongwuxinxi` WRITE;
/*!40000 ALTER TABLE `discussliulangdongwuxinxi` DISABLE KEYS */;
INSERT INTO `discussliulangdongwuxinxi` VALUES (131,'2021-04-27 09:03:07',1,1,'用户名1','评论内容1','回复内容1'),(132,'2021-04-27 09:03:07',2,2,'用户名2','评论内容2','回复内容2'),(133,'2021-04-27 09:03:07',3,3,'用户名3','评论内容3','回复内容3'),(134,'2021-04-27 09:03:07',4,4,'用户名4','评论内容4','回复内容4'),(135,'2021-04-27 09:03:07',5,5,'用户名5','评论内容5','回复内容5'),(136,'2021-04-27 09:03:07',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discussliulangdongwuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discusszhiyuantuanduihuodong`
--

DROP TABLE IF EXISTS `discusszhiyuantuanduihuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discusszhiyuantuanduihuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `nickname` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '评论内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8 COMMENT='志愿团队活动评论表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discusszhiyuantuanduihuodong`
--

LOCK TABLES `discusszhiyuantuanduihuodong` WRITE;
/*!40000 ALTER TABLE `discusszhiyuantuanduihuodong` DISABLE KEYS */;
INSERT INTO `discusszhiyuantuanduihuodong` VALUES (141,'2021-04-27 09:03:07',1,1,'用户名1','评论内容1','回复内容1'),(142,'2021-04-27 09:03:07',2,2,'用户名2','评论内容2','回复内容2'),(143,'2021-04-27 09:03:07',3,3,'用户名3','评论内容3','回复内容3'),(144,'2021-04-27 09:03:07',4,4,'用户名4','评论内容4','回复内容4'),(145,'2021-04-27 09:03:07',5,5,'用户名5','评论内容5','回复内容5'),(146,'2021-04-27 09:03:07',6,6,'用户名6','评论内容6','回复内容6');
/*!40000 ALTER TABLE `discusszhiyuantuanduihuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dongwuleixing`
--

DROP TABLE IF EXISTS `dongwuleixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dongwuleixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dongwuleixing` varchar(200) DEFAULT NULL COMMENT '动物类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=107 DEFAULT CHARSET=utf8 COMMENT='动物类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dongwuleixing`
--

LOCK TABLES `dongwuleixing` WRITE;
/*!40000 ALTER TABLE `dongwuleixing` DISABLE KEYS */;
INSERT INTO `dongwuleixing` VALUES (101,'2021-04-27 09:03:07','动物类型1'),(102,'2021-04-27 09:03:07','动物类型2'),(103,'2021-04-27 09:03:07','动物类型3'),(104,'2021-04-27 09:03:07','动物类型4'),(105,'2021-04-27 09:03:07','动物类型5'),(106,'2021-04-27 09:03:07','动物类型6');
/*!40000 ALTER TABLE `dongwuleixing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `huiyuan`
--

DROP TABLE IF EXISTS `huiyuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `huiyuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yonghuzhanghao` (`yonghuzhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514470064 DEFAULT CHARSET=utf8 COMMENT='会员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `huiyuan`
--

LOCK TABLES `huiyuan` WRITE;
/*!40000 ALTER TABLE `huiyuan` DISABLE KEYS */;
INSERT INTO `huiyuan` VALUES (11,'2021-04-27 09:03:07','会员1','123456','用户姓名1','男','13823888881','440300199101010001','773890001@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang1.jpg'),(12,'2021-04-27 09:03:07','会员2','123456','用户姓名2','男','13823888882','440300199202020002','773890002@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang2.jpg'),(13,'2021-04-27 09:03:07','会员3','123456','用户姓名3','男','13823888883','440300199303030003','773890003@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang3.jpg'),(14,'2021-04-27 09:03:07','会员4','123456','用户姓名4','男','13823888884','440300199404040004','773890004@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang4.jpg'),(15,'2021-04-27 09:03:07','会员5','123456','用户姓名5','男','13823888885','440300199505050005','773890005@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang5.jpg'),(16,'2021-04-27 09:03:07','会员6','123456','用户姓名6','男','13823888886','440300199606060006','773890006@qq.com','http://localhost:8080/springbootnu0q1/upload/huiyuan_touxiang6.jpg'),(1619514470063,'2021-04-27 09:07:50','123','1',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `huiyuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lingyangxinxi`
--

DROP TABLE IF EXISTS `lingyangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `lingyangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dongwuleixing` varchar(200) DEFAULT NULL COMMENT '动物类型',
  `dongwutezheng` varchar(200) DEFAULT NULL COMMENT '动物特征',
  `dongwuxiangqing` varchar(200) DEFAULT NULL COMMENT '动物详情',
  `jiuzhushijian` varchar(200) DEFAULT NULL COMMENT '救助时间',
  `jiuzhudidian` varchar(200) DEFAULT NULL COMMENT 'Rescue location',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `lingyangshijian` datetime DEFAULT NULL COMMENT '领养时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514564838 DEFAULT CHARSET=utf8 COMMENT='领养信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lingyangxinxi`
--

LOCK TABLES `lingyangxinxi` WRITE;
/*!40000 ALTER TABLE `lingyangxinxi` DISABLE KEYS */;
INSERT INTO `lingyangxinxi` VALUES (41,'2021-04-27 09:03:07','动物类型1','动物特征1','动物详情1','救助时间1','Rescue location1','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian1.jpg','用户账号1','用户姓名1','联系方式1','2021-04-27 17:03:07','是',''),(42,'2021-04-27 09:03:07','动物类型2','动物特征2','动物详情2','救助时间2','Rescue location2','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian2.jpg','用户账号2','用户姓名2','联系方式2','2021-04-27 17:03:07','是',''),(43,'2021-04-27 09:03:07','动物类型3','动物特征3','动物详情3','救助时间3','Rescue location3','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian3.jpg','用户账号3','用户姓名3','联系方式3','2021-04-27 17:03:07','是',''),(44,'2021-04-27 09:03:07','动物类型4','动物特征4','动物详情4','救助时间4','Rescue location4','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian4.jpg','用户账号4','用户姓名4','联系方式4','2021-04-27 17:03:07','是',''),(45,'2021-04-27 09:03:07','动物类型5','动物特征5','动物详情5','救助时间5','Rescue location5','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian5.jpg','用户账号5','用户姓名5','联系方式5','2021-04-27 17:03:07','是',''),(46,'2021-04-27 09:03:07','动物类型6','动物特征6','动物详情6','救助时间6','Rescue location6','http://localhost:8080/springbootnu0q1/upload/lingyangxinxi_tupian6.jpg','用户账号6','用户姓名6','联系方式6','2021-04-27 17:03:07','是',''),(1619514564837,'2021-04-27 09:09:23','动物类型6','动物特征6','动物详情6','2021-04-27 17:03:07','Rescue location6','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian6.jpg','123',NULL,NULL,'2021-04-27 00:00:00','否',NULL);
/*!40000 ALTER TABLE `lingyangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `liulangdongwuxinxi`
--

DROP TABLE IF EXISTS `liulangdongwuxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `liulangdongwuxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dongwuleixing` varchar(200) DEFAULT NULL COMMENT '动物类型',
  `dongwutezheng` longtext COMMENT '动物特征',
  `dongwuxiangqing` longtext COMMENT '动物详情',
  `jiuzhushijian` datetime DEFAULT NULL COMMENT '救助时间',
  `jiuzhudidian` varchar(200) DEFAULT NULL COMMENT 'Rescue location',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shifouyijinglingyang` varchar(200) DEFAULT NULL COMMENT '是否已经领养',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8 COMMENT='流浪动物信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `liulangdongwuxinxi`
--

LOCK TABLES `liulangdongwuxinxi` WRITE;
/*!40000 ALTER TABLE `liulangdongwuxinxi` DISABLE KEYS */;
INSERT INTO `liulangdongwuxinxi` VALUES (31,'2021-04-27 09:03:07','动物类型1','动物特征1','动物详情1','2021-04-27 17:03:07','Rescue location1','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian1.jpg','否'),(32,'2021-04-27 09:03:07','动物类型2','动物特征2','动物详情2','2021-04-27 17:03:07','Rescue location2','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian2.jpg','否'),(33,'2021-04-27 09:03:07','动物类型3','动物特征3','动物详情3','2021-04-27 17:03:07','Rescue location3','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian3.jpg','否'),(34,'2021-04-27 09:03:07','动物类型4','动物特征4','动物详情4','2021-04-27 17:03:07','Rescue location4','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian4.jpg','否'),(35,'2021-04-27 09:03:07','动物类型5','动物特征5','动物详情5','2021-04-27 17:03:07','Rescue location5','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian5.jpg','否'),(36,'2021-04-27 09:03:07','动物类型6','动物特征6','动物详情6','2021-04-27 17:03:07','Rescue location6','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian6.jpg','否');
/*!40000 ALTER TABLE `liulangdongwuxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `introduction` longtext COMMENT '简介',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=127 DEFAULT CHARSET=utf8 COMMENT='流浪动物公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (121,'2021-04-27 09:03:07','标题1','简介1','http://localhost:8080/springbootnu0q1/upload/news_picture1.jpg','内容1'),(122,'2021-04-27 09:03:07','标题2','简介2','http://localhost:8080/springbootnu0q1/upload/news_picture2.jpg','内容2'),(123,'2021-04-27 09:03:07','标题3','简介3','http://localhost:8080/springbootnu0q1/upload/news_picture3.jpg','内容3'),(124,'2021-04-27 09:03:07','标题4','简介4','http://localhost:8080/springbootnu0q1/upload/news_picture4.jpg','内容4'),(125,'2021-04-27 09:03:07','标题5','简介5','http://localhost:8080/springbootnu0q1/upload/news_picture5.jpg','内容5'),(126,'2021-04-27 09:03:07','标题6','简介6','http://localhost:8080/springbootnu0q1/upload/news_picture6.jpg','内容6');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaobaominghuodong`
--

DROP TABLE IF EXISTS `quxiaobaominghuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaobaominghuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) DEFAULT NULL COMMENT '活动名称',
  `huodongshijian` datetime DEFAULT NULL COMMENT '活动时间',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `huodongneirong` longtext COMMENT '活动内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `zhiyuanzhezhanghao` varchar(200) DEFAULT NULL COMMENT '志愿者账号',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `zhiyuanzheshouji` varchar(200) DEFAULT NULL COMMENT 'Volunteer phonenumber',
  `baomingshijian` datetime DEFAULT NULL COMMENT '报名时间',
  `quxiaobaomingshijian` datetime DEFAULT NULL COMMENT '取消报名时间',
  `quxiaoyuanyin` longtext COMMENT '取消原因',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514649736 DEFAULT CHARSET=utf8 COMMENT='取消报名活动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaobaominghuodong`
--

LOCK TABLES `quxiaobaominghuodong` WRITE;
/*!40000 ALTER TABLE `quxiaobaominghuodong` DISABLE KEYS */;
INSERT INTO `quxiaobaominghuodong` VALUES (91,'2021-04-27 09:03:07','活动名称1','2021-04-27 17:03:07','活动地点1','活动内容1','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian1.jpg','志愿者账号1','志愿者姓名1','Volunteer phonenumber1','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因1','是',''),(92,'2021-04-27 09:03:07','活动名称2','2021-04-27 17:03:07','活动地点2','活动内容2','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian2.jpg','志愿者账号2','志愿者姓名2','Volunteer phonenumber2','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因2','是',''),(93,'2021-04-27 09:03:07','活动名称3','2021-04-27 17:03:07','活动地点3','活动内容3','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian3.jpg','志愿者账号3','志愿者姓名3','Volunteer phonenumber3','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因3','是',''),(94,'2021-04-27 09:03:07','活动名称4','2021-04-27 17:03:07','活动地点4','活动内容4','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian4.jpg','志愿者账号4','志愿者姓名4','Volunteer phonenumber4','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因4','是',''),(95,'2021-04-27 09:03:07','活动名称5','2021-04-27 17:03:07','活动地点5','活动内容5','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian5.jpg','志愿者账号5','志愿者姓名5','Volunteer phonenumber5','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因5','是',''),(96,'2021-04-27 09:03:07','活动名称6','2021-04-27 17:03:07','活动地点6','活动内容6','http://localhost:8080/springbootnu0q1/upload/quxiaobaominghuodong_tupian6.jpg','志愿者账号6','志愿者姓名6','Volunteer phonenumber6','2021-04-27 17:03:07','2021-04-27 17:03:07','取消原因6','是',''),(1619514649735,'2021-04-27 09:10:49','活动名称6','2021-04-27 17:03:07','活动地点6','活动内容6','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian6.jpg','123',NULL,NULL,NULL,NULL,NULL,'否',NULL);
/*!40000 ALTER TABLE `quxiaobaominghuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaolingyangxinxi`
--

DROP TABLE IF EXISTS `quxiaolingyangxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaolingyangxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `dongwuleixing` varchar(200) DEFAULT NULL COMMENT '动物类型',
  `dongwutezheng` varchar(200) DEFAULT NULL COMMENT '动物特征',
  `dongwuxiangqing` varchar(200) DEFAULT NULL COMMENT '动物详情',
  `jiuzhushijian` varchar(200) DEFAULT NULL COMMENT '救助时间',
  `jiuzhudidian` varchar(200) DEFAULT NULL COMMENT 'Rescue location',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yonghuzhanghao` varchar(200) DEFAULT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `lingyangshijian` varchar(200) DEFAULT NULL COMMENT '领养时间',
  `quxiaolingyangshijian` datetime DEFAULT NULL COMMENT '取消领养时间',
  `quxiaoyuanyin` longtext COMMENT '取消原因',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514585899 DEFAULT CHARSET=utf8 COMMENT='取消领养信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaolingyangxinxi`
--

LOCK TABLES `quxiaolingyangxinxi` WRITE;
/*!40000 ALTER TABLE `quxiaolingyangxinxi` DISABLE KEYS */;
INSERT INTO `quxiaolingyangxinxi` VALUES (51,'2021-04-27 09:03:07','动物类型1','动物特征1','动物详情1','救助时间1','Rescue location1','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian1.jpg','用户账号1','用户姓名1','联系方式1','领养时间1','2021-04-27 17:03:07','取消原因1','是',''),(52,'2021-04-27 09:03:07','动物类型2','动物特征2','动物详情2','救助时间2','Rescue location2','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian2.jpg','用户账号2','用户姓名2','联系方式2','领养时间2','2021-04-27 17:03:07','取消原因2','是',''),(53,'2021-04-27 09:03:07','动物类型3','动物特征3','动物详情3','救助时间3','Rescue location3','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian3.jpg','用户账号3','用户姓名3','联系方式3','领养时间3','2021-04-27 17:03:07','取消原因3','是',''),(54,'2021-04-27 09:03:07','动物类型4','动物特征4','动物详情4','救助时间4','Rescue location4','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian4.jpg','用户账号4','用户姓名4','联系方式4','领养时间4','2021-04-27 17:03:07','取消原因4','是',''),(55,'2021-04-27 09:03:07','动物类型5','动物特征5','动物详情5','救助时间5','Rescue location5','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian5.jpg','用户账号5','用户姓名5','联系方式5','领养时间5','2021-04-27 17:03:07','取消原因5','是',''),(56,'2021-04-27 09:03:07','动物类型6','动物特征6','动物详情6','救助时间6','Rescue location6','http://localhost:8080/springbootnu0q1/upload/quxiaolingyangxinxi_tupian6.jpg','用户账号6','用户姓名6','联系方式6','领养时间6','2021-04-27 17:03:07','取消原因6','是',''),(1619514585898,'2021-04-27 09:09:45','动物类型6','动物特征6','动物详情6','2021-04-27 17:03:07','Rescue location6','http://localhost:8080/springbootnu0q1/upload/liulangdongwuxinxi_tupian6.jpg','123',NULL,NULL,'2021-04-27 00:00:00','2021-04-27 17:09:45',NULL,'否',NULL);
/*!40000 ALTER TABLE `quxiaolingyangxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '收藏id',
  `tablename` varchar(200) DEFAULT NULL COMMENT '表名',
  `name` varchar(200) NOT NULL COMMENT '收藏名称',
  `picture` varchar(200) NOT NULL COMMENT '收藏图片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','ivbquhjkckec4gyhh9s8jr25kbr7bjro','2021-04-27 09:07:22','2021-04-27 10:10:56'),(2,1619514470063,'123','huiyuan','会员','3j1ekum7l1rdrdpgrg73h9b6cnfybcwn','2021-04-27 09:07:58','2021-04-27 10:09:04'),(3,1619514614586,'123','zhiyuanzhe','志愿者','t1e104leq71gn9hhhskp0kjmhlhn6f5x','2021-04-27 09:10:35','2021-04-27 10:10:35');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2021-04-27 09:03:07');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuantuanduihuodong`
--

DROP TABLE IF EXISTS `zhiyuantuanduihuodong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuantuanduihuodong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `huodongmingcheng` varchar(200) DEFAULT NULL COMMENT '活动名称',
  `huodongshijian` datetime DEFAULT NULL COMMENT '活动时间',
  `huodongdidian` varchar(200) DEFAULT NULL COMMENT '活动地点',
  `huodongneirong` longtext COMMENT '活动内容',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicktime` datetime DEFAULT NULL COMMENT '最近点击时间',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8 COMMENT='志愿团队活动';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuantuanduihuodong`
--

LOCK TABLES `zhiyuantuanduihuodong` WRITE;
/*!40000 ALTER TABLE `zhiyuantuanduihuodong` DISABLE KEYS */;
INSERT INTO `zhiyuantuanduihuodong` VALUES (61,'2021-04-27 09:03:07','活动名称1','2021-04-27 17:03:07','活动地点1','活动内容1','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian1.jpg',1,1,'2021-04-27 17:03:07',1),(62,'2021-04-27 09:03:07','活动名称2','2021-04-27 17:03:07','活动地点2','活动内容2','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian2.jpg',2,2,'2021-04-27 17:03:07',2),(63,'2021-04-27 09:03:07','活动名称3','2021-04-27 17:03:07','活动地点3','活动内容3','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian3.jpg',3,3,'2021-04-27 17:03:07',3),(64,'2021-04-27 09:03:07','活动名称4','2021-04-27 17:03:07','活动地点4','活动内容4','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian4.jpg',4,4,'2021-04-27 17:03:07',4),(65,'2021-04-27 09:03:07','活动名称5','2021-04-27 17:03:07','活动地点5','活动内容5','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian5.jpg',5,5,'2021-04-27 17:03:07',5),(66,'2021-04-27 09:03:07','活动名称6','2021-04-27 17:03:07','活动地点6','活动内容6','http://localhost:8080/springbootnu0q1/upload/zhiyuantuanduihuodong_tupian6.jpg',6,6,'2021-04-27 17:03:07',6);
/*!40000 ALTER TABLE `zhiyuantuanduihuodong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzhe`
--

DROP TABLE IF EXISTS `zhiyuanzhe`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzhe` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhiyuanzhezhanghao` varchar(200) NOT NULL COMMENT '志愿者账号',
  `mima` varchar(200) NOT NULL COMMENT '密码',
  `zhiyuanzhexingming` varchar(200) DEFAULT NULL COMMENT '志愿者姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `zhiyuanzheshouji` varchar(200) DEFAULT NULL COMMENT 'Volunteer phonenumber',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `touxiang` varchar(200) DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhiyuanzhezhanghao` (`zhiyuanzhezhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514614587 DEFAULT CHARSET=utf8 COMMENT='志愿者';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzhe`
--

LOCK TABLES `zhiyuanzhe` WRITE;
/*!40000 ALTER TABLE `zhiyuanzhe` DISABLE KEYS */;
INSERT INTO `zhiyuanzhe` VALUES (21,'2021-04-27 09:03:07','志愿者1','123456','志愿者姓名1','男','13823888881','440300199101010001','773890001@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang1.jpg'),(22,'2021-04-27 09:03:07','志愿者2','123456','志愿者姓名2','男','13823888882','440300199202020002','773890002@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang2.jpg'),(23,'2021-04-27 09:03:07','志愿者3','123456','志愿者姓名3','男','13823888883','440300199303030003','773890003@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang3.jpg'),(24,'2021-04-27 09:03:07','志愿者4','123456','志愿者姓名4','男','13823888884','440300199404040004','773890004@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang4.jpg'),(25,'2021-04-27 09:03:07','志愿者5','123456','志愿者姓名5','男','13823888885','440300199505050005','773890005@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang5.jpg'),(26,'2021-04-27 09:03:07','志愿者6','123456','志愿者姓名6','男','13823888886','440300199606060006','773890006@qq.com','http://localhost:8080/springbootnu0q1/upload/zhiyuanzhe_touxiang6.jpg'),(1619514614586,'2021-04-27 09:10:14','123','1',NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `zhiyuanzhe` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhiyuanzheshenqingbiao`
--

DROP TABLE IF EXISTS `zhiyuanzheshenqingbiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhiyuanzheshenqingbiao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yonghuzhanghao` varchar(200) NOT NULL COMMENT '用户账号',
  `yonghuxingming` varchar(200) DEFAULT NULL COMMENT '用户姓名',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxifangshi` varchar(200) DEFAULT NULL COMMENT '联系方式',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1619514598896 DEFAULT CHARSET=utf8 COMMENT='志愿者申请表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhiyuanzheshenqingbiao`
--

LOCK TABLES `zhiyuanzheshenqingbiao` WRITE;
/*!40000 ALTER TABLE `zhiyuanzheshenqingbiao` DISABLE KEYS */;
INSERT INTO `zhiyuanzheshenqingbiao` VALUES (71,'2021-04-27 09:03:07','用户账号1','用户姓名1','男','13823888881','440300199101010001','773890001@qq.com','是',''),(72,'2021-04-27 09:03:07','用户账号2','用户姓名2','男','13823888882','440300199202020002','773890002@qq.com','是',''),(73,'2021-04-27 09:03:07','用户账号3','用户姓名3','男','13823888883','440300199303030003','773890003@qq.com','是',''),(74,'2021-04-27 09:03:07','用户账号4','用户姓名4','男','13823888884','440300199404040004','773890004@qq.com','是',''),(75,'2021-04-27 09:03:07','用户账号5','用户姓名5','男','13823888885','440300199505050005','773890005@qq.com','是',''),(76,'2021-04-27 09:03:07','用户账号6','用户姓名6','男','13823888886','440300199606060006','773890006@qq.com','是',''),(1619514598895,'2021-04-27 09:09:58','123',NULL,NULL,NULL,NULL,NULL,'否',NULL);
/*!40000 ALTER TABLE `zhiyuanzheshenqingbiao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-04-30 16:53:23
