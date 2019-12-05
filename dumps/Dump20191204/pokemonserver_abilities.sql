CREATE DATABASE  IF NOT EXISTS `pokemonserver` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `pokemonserver`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: pokemonserver
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.10-MariaDB

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
-- Table structure for table `abilities`
--

DROP TABLE IF EXISTS `abilities`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `abilities` (
  `id` int(11) DEFAULT NULL,
  `identifier` text DEFAULT NULL,
  `generation_id` int(11) DEFAULT NULL,
  `is_main_series` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abilities`
--

LOCK TABLES `abilities` WRITE;
/*!40000 ALTER TABLE `abilities` DISABLE KEYS */;
INSERT INTO `abilities` VALUES (1,'stench',3,1),(2,'drizzle',3,1),(3,'speed-boost',3,1),(4,'battle-armor',3,1),(5,'sturdy',3,1),(6,'damp',3,1),(7,'limber',3,1),(8,'sand-veil',3,1),(9,'static',3,1),(10,'volt-absorb',3,1),(11,'water-absorb',3,1),(12,'oblivious',3,1),(13,'cloud-nine',3,1),(14,'compound-eyes',3,1),(15,'insomnia',3,1),(16,'color-change',3,1),(17,'immunity',3,1),(18,'flash-fire',3,1),(19,'shield-dust',3,1),(20,'own-tempo',3,1),(21,'suction-cups',3,1),(22,'intimidate',3,1),(23,'shadow-tag',3,1),(24,'rough-skin',3,1),(25,'wonder-guard',3,1),(26,'levitate',3,1),(27,'effect-spore',3,1),(28,'synchronize',3,1),(29,'clear-body',3,1),(30,'natural-cure',3,1),(31,'lightning-rod',3,1),(32,'serene-grace',3,1),(33,'swift-swim',3,1),(34,'chlorophyll',3,1),(35,'illuminate',3,1),(36,'trace',3,1),(37,'huge-power',3,1),(38,'poison-point',3,1),(39,'inner-focus',3,1),(40,'magma-armor',3,1),(41,'water-veil',3,1),(42,'magnet-pull',3,1),(43,'soundproof',3,1),(44,'rain-dish',3,1),(45,'sand-stream',3,1),(46,'pressure',3,1),(47,'thick-fat',3,1),(48,'early-bird',3,1),(49,'flame-body',3,1),(50,'run-away',3,1),(51,'keen-eye',3,1),(52,'hyper-cutter',3,1),(53,'pickup',3,1),(54,'truant',3,1),(55,'hustle',3,1),(56,'cute-charm',3,1),(57,'plus',3,1),(58,'minus',3,1),(59,'forecast',3,1),(60,'sticky-hold',3,1),(61,'shed-skin',3,1),(62,'guts',3,1),(63,'marvel-scale',3,1),(64,'liquid-ooze',3,1),(65,'overgrow',3,1),(66,'blaze',3,1),(67,'torrent',3,1),(68,'swarm',3,1),(69,'rock-head',3,1),(70,'drought',3,1),(71,'arena-trap',3,1),(72,'vital-spirit',3,1),(73,'white-smoke',3,1),(74,'pure-power',3,1),(75,'shell-armor',3,1),(76,'air-lock',3,1),(77,'tangled-feet',4,1),(78,'motor-drive',4,1),(79,'rivalry',4,1),(80,'steadfast',4,1),(81,'snow-cloak',4,1),(82,'gluttony',4,1),(83,'anger-point',4,1),(84,'unburden',4,1),(85,'heatproof',4,1),(86,'simple',4,1),(87,'dry-skin',4,1),(88,'download',4,1),(89,'iron-fist',4,1),(90,'poison-heal',4,1),(91,'adaptability',4,1),(92,'skill-link',4,1),(93,'hydration',4,1),(94,'solar-power',4,1),(95,'quick-feet',4,1),(96,'normalize',4,1),(97,'sniper',4,1),(98,'magic-guard',4,1),(99,'no-guard',4,1),(100,'stall',4,1),(101,'technician',4,1),(102,'leaf-guard',4,1),(103,'klutz',4,1),(104,'mold-breaker',4,1),(105,'super-luck',4,1),(106,'aftermath',4,1),(107,'anticipation',4,1),(108,'forewarn',4,1),(109,'unaware',4,1),(110,'tinted-lens',4,1),(111,'filter',4,1),(112,'slow-start',4,1),(113,'scrappy',4,1),(114,'storm-drain',4,1),(115,'ice-body',4,1),(116,'solid-rock',4,1),(117,'snow-warning',4,1),(118,'honey-gather',4,1),(119,'frisk',4,1),(120,'reckless',4,1),(121,'multitype',4,1),(122,'flower-gift',4,1),(123,'bad-dreams',4,1),(124,'pickpocket',5,1),(125,'sheer-force',5,1),(126,'contrary',5,1),(127,'unnerve',5,1),(128,'defiant',5,1),(129,'defeatist',5,1),(130,'cursed-body',5,1),(131,'healer',5,1),(132,'friend-guard',5,1),(133,'weak-armor',5,1),(134,'heavy-metal',5,1),(135,'light-metal',5,1),(136,'multiscale',5,1),(137,'toxic-boost',5,1),(138,'flare-boost',5,1),(139,'harvest',5,1),(140,'telepathy',5,1),(141,'moody',5,1),(142,'overcoat',5,1),(143,'poison-touch',5,1),(144,'regenerator',5,1),(145,'big-pecks',5,1),(146,'sand-rush',5,1),(147,'wonder-skin',5,1),(148,'analytic',5,1),(149,'illusion',5,1),(150,'imposter',5,1),(151,'infiltrator',5,1),(152,'mummy',5,1),(153,'moxie',5,1),(154,'justified',5,1),(155,'rattled',5,1),(156,'magic-bounce',5,1),(157,'sap-sipper',5,1),(158,'prankster',5,1),(159,'sand-force',5,1),(160,'iron-barbs',5,1),(161,'zen-mode',5,1),(162,'victory-star',5,1),(163,'turboblaze',5,1),(164,'teravolt',5,1),(165,'aroma-veil',6,1),(166,'flower-veil',6,1),(167,'cheek-pouch',6,1),(168,'protean',6,1),(169,'fur-coat',6,1),(170,'magician',6,1),(171,'bulletproof',6,1),(172,'competitive',6,1),(173,'strong-jaw',6,1),(174,'refrigerate',6,1),(175,'sweet-veil',6,1),(176,'stance-change',6,1),(177,'gale-wings',6,1),(178,'mega-launcher',6,1),(179,'grass-pelt',6,1),(180,'symbiosis',6,1),(181,'tough-claws',6,1),(182,'pixilate',6,1),(183,'gooey',6,1),(184,'aerilate',6,1),(185,'parental-bond',6,1),(186,'dark-aura',6,1),(187,'fairy-aura',6,1),(188,'aura-break',6,1),(189,'primordial-sea',6,1),(190,'desolate-land',6,1),(191,'delta-stream',6,1),(192,'stamina',7,1),(193,'wimp-out',7,1),(194,'emergency-exit',7,1),(195,'water-compaction',7,1),(196,'merciless',7,1),(197,'shields-down',7,1),(198,'stakeout',7,1),(199,'water-bubble',7,1),(200,'steelworker',7,1),(201,'berserk',7,1),(202,'slush-rush',7,1),(203,'long-reach',7,1),(204,'liquid-voice',7,1),(205,'triage',7,1),(206,'galvanize',7,1),(207,'surge-surfer',7,1),(208,'schooling',7,1),(209,'disguise',7,1),(210,'battle-bond',7,1),(211,'power-construct',7,1),(212,'corrosion',7,1),(213,'comatose',7,1),(214,'queenly-majesty',7,1),(215,'innards-out',7,1),(216,'dancer',7,1),(217,'battery',7,1),(218,'fluffy',7,1),(219,'dazzling',7,1),(220,'soul-heart',7,1),(221,'tangling-hair',7,1),(222,'receiver',7,1),(223,'power-of-alchemy',7,1),(224,'beast-boost',7,1),(225,'rks-system',7,1),(226,'electric-surge',7,1),(227,'psychic-surge',7,1),(228,'misty-surge',7,1),(229,'grassy-surge',7,1),(230,'full-metal-body',7,1),(231,'shadow-shield',7,1),(232,'prism-armor',7,1),(233,'neuroforce',7,1),(10001,'mountaineer',5,0),(10002,'wave-rider',5,0),(10003,'skater',5,0),(10004,'thrust',5,0),(10005,'perception',5,0),(10006,'parry',5,0),(10007,'instinct',5,0),(10008,'dodge',5,0),(10009,'jagged-edge',5,0),(10010,'frostbite',5,0),(10011,'tenacity',5,0),(10012,'pride',5,0),(10013,'deep-sleep',5,0),(10014,'power-nap',5,0),(10015,'spirit',5,0),(10016,'warm-blanket',5,0),(10017,'gulp',5,0),(10018,'herbivore',5,0),(10019,'sandpit',5,0),(10020,'hot-blooded',5,0),(10021,'medic',5,0),(10022,'life-force',5,0),(10023,'lunchbox',5,0),(10024,'nurse',5,0),(10025,'melee',5,0),(10026,'sponge',5,0),(10027,'bodyguard',5,0),(10028,'hero',5,0),(10029,'last-bastion',5,0),(10030,'stealth',5,0),(10031,'vanguard',5,0),(10032,'nomad',5,0),(10033,'sequence',5,0),(10034,'grass-cloak',5,0),(10035,'celebrate',5,0),(10036,'lullaby',5,0),(10037,'calming',5,0),(10038,'daze',5,0),(10039,'frighten',5,0),(10040,'interference',5,0),(10041,'mood-maker',5,0),(10042,'confidence',5,0),(10043,'fortune',5,0),(10044,'bonanza',5,0),(10045,'explode',5,0),(10046,'omnipotent',5,0),(10047,'share',5,0),(10048,'black-hole',5,0),(10049,'shadow-dash',5,0),(10050,'sprint',5,0),(10051,'disgust',5,0),(10052,'high-rise',5,0),(10053,'climber',5,0),(10054,'flame-boost',5,0),(10055,'aqua-boost',5,0),(10056,'run-up',5,0),(10057,'conqueror',5,0),(10058,'shackle',5,0),(10059,'decoy',5,0),(10060,'shield',5,0);
/*!40000 ALTER TABLE `abilities` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-12-04 18:51:10
