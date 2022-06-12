CREATE USER 'favtuts'@'localhost' IDENTIFIED BY 'favtuts';
GRANT ALL PRIVILEGES ON *.* TO 'favtuts'@'localhost' WITH GRANT OPTION;
FLUSH PRIVILEGES;
mysql -u favtuts -p