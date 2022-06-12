DROP TABLE IF EXISTS `favtutsjava`.`CUSTOMER`;

CREATE TABLE  `favtutsjava`.`CUSTOMER` (
  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;


INSERT INTO `CUSTOMER` (`CUST_ID`,`NAME`,`AGE`) VALUES 
 (1,'favtuts1',28),
 (2,'favtuts2',28),
 (3,'favtuts3',28);