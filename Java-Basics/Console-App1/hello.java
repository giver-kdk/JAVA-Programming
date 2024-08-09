-CREATE
CREATE TABLE student(
    id int(20) PRIMARY KEY AUTO_INCREMENT,
    name varchar(255),
    address varchar(255),
    phone int(20),
    gender ENUM('MALE','FEMALE'),
    date_of_birth date,
    hobbies varchar(200)
);

-INSERT
INSERT INTO `student`(`id`, `name`, `address`, `phone`, `gender`, `date_of_birth`, `hobbies`) VALUES ('1','RAM','KATHMANDU','9812345678','MALE','2003-01-01','PLAYING')

-UPDATE
UPDATE student SET phone='981235555' , address='lalitpur' WHERE 2

-SELECT
SELECT * FROM `student` WHERE 1

-DELETE
DELETE FROM `student` WHERE 1