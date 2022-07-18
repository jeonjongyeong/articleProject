DROP DATABASE
IF EXISTS project;

CREATE DATABASE project;

CREATE TABLE article (
    id INT(11) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `title` VARCHAR(200) NOT NULL,
    content TEXT NOT NULL,
    reg_date DATETIME NOT NULL,
    update_date DATETIME NOT NULL
);

INSERT INTO article SET
reg_date = NOW(),
`title` = '질문 1',
content = '질문내용 1';

INSERT INTO article SET
reg_date = NOW(),
`title` = '질문 2',
content = '내용 2';

INSERT INTO article SET
reg_date = NOW(),
`title` = '질문 3',
content = '내용 3';