create database record_db;

create user 'airline_user'@'localhost'identified by 'password';

grant all privileges on record_db.* to 'airline_user'@'localhost';

flush privileges;