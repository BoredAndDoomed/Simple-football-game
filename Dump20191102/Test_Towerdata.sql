-- MySQL dump 10.13  Distrib 5.7.27, for Linux (x86_64)
--
-- Host: localhost    Database: Test
-- ------------------------------------------------------
-- Server version	5.7.27-0ubuntu0.18.04.1

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
-- Table structure for table `Towerdata`
--

DROP TABLE IF EXISTS `Towerdata`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Towerdata` (
  `towerId` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(255) DEFAULT NULL,
  `AlarmColor` varchar(255) DEFAULT NULL,
  `Id` int(11) DEFAULT NULL,
  `DatasourcesCount` varchar(255) DEFAULT NULL,
  `alertIcon` varchar(255) DEFAULT NULL,
  `ElementCount` varchar(255) DEFAULT NULL,
  `UniqueID` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`towerId`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Towerdata`
--

LOCK TABLES `Towerdata` WRITE;
/*!40000 ALTER TABLE `Towerdata` DISABLE KEYS */;
INSERT INTO `Towerdata` VALUES (1,'Site 1','-1671296',8,'0','Communications','640','87111c51-08df-4b29-85c5-43803a994bdd'),(2,'Site 2','-256',4,'0','Warning','514','20fb99ae-b940-484a-b3f2-2e7d619b952a'),(3,'Site 3','-256',10,'0','Communications','753','e4429e5a-60ef-437e-8759-2d84574a5289'),(4,'Site 4','-256',11,'0','Warning','1938','bb0a0777-4c50-40ec-82ff-659fa33004a6');
/*!40000 ALTER TABLE `Towerdata` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-02 12:28:49
