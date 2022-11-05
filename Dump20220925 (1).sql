CREATE DATABASE  IF NOT EXISTS `miliasamil` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `miliasamil`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: miliasamil
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idcliente` int NOT NULL AUTO_INCREMENT,
  `nome` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `MiliasAcumuladas` int DEFAULT NULL,
  `nascimento` date DEFAULT NULL,
  `sexo` enum('M','F') DEFAULT NULL,
  PRIMARY KEY (`idcliente`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Jorge','Jorginho123@gmail.com,',150,'2000-11-03','M'),(2,'Maria','Maria31@hotmail.com,',500,'1983-04-12','F'),(3,'Fulaninho','fulaninhogameplay@gmail.com,',0,'2003-07-07','M');
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `miliasamillcadastro`
--

DROP TABLE IF EXISTS `miliasamillcadastro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `miliasamillcadastro` (
  `idsite` int DEFAULT NULL,
  `Areadecadastro` enum('E','I') DEFAULT NULL,
  UNIQUE KEY `idsite` (`idsite`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `miliasamillcadastro`
--

LOCK TABLES `miliasamillcadastro` WRITE;
/*!40000 ALTER TABLE `miliasamillcadastro` DISABLE KEYS */;
/*!40000 ALTER TABLE `miliasamillcadastro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tabeladeviagens`
--

DROP TABLE IF EXISTS `tabeladeviagens`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tabeladeviagens` (
  `idviagens` int NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `preço` int DEFAULT NULL,
  `embarque` varchar(30) DEFAULT NULL,
  `desembarque` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idviagens`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tabeladeviagens`
--

LOCK TABLES `tabeladeviagens` WRITE;
/*!40000 ALTER TABLE `tabeladeviagens` DISABLE KEYS */;
INSERT INTO `tabeladeviagens` VALUES (1,'Rondonia/Amapá',450,'Aeroporto InternacionalMacapá','Alberto Alcolumbre'),(2,'Bahia/ Mato Grosso',320,'Aeroporto de Barra do Garças','Aeroporto InterdeCampoGrande'),(3,'Rio de janeiro/ Acre',670,'galeão','Aeroporto interdeRio Branco'),(4,'São paulo/Brasilia',521,'Aeroporto de São Paulo','Congonhas');
/*!40000 ALTER TABLE `tabeladeviagens` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-25 22:22:03
