# Spring + JDBC example

* https://www.favtuts.com/spring-jdbc-example/

# How to start

```bash
$ git clone https://github.com/favtuts/java-spring-tutorials.git

$ cd SpringJDBCExample
```

# Prepare Database

[Create user](databse/createuser.ddl)
```
CREATE USER 'favtuts'@'localhost' IDENTIFIED BY 'favtuts';
GRANT ALL PRIVILEGES ON *.* TO 'favtuts'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
```
Test connection
```
mysql -u favtuts -p
```

[Create Database](database/createdatabase.ddl)
```
CREATE DATABASE IF NOT EXISTS favtutsjava;
```

[Create Table](database/database.ddl)
```
CREATE TABLE  `favtutsjava`.`CUSTOMER` (
  `CUST_ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `NAME` varchar(100) NOT NULL,
  `AGE` smallint(5) unsigned NOT NULL,
  PRIMARY KEY (`CUST_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
```