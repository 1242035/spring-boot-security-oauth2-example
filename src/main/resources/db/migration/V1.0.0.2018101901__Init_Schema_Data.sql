CREATE TABLE tbl_user (
  id bigint(20) NOT NULL,
  username varchar(25) NOT NULL,
  password varchar(75) NOT NULL,
  salary bigint(10) NOT NULL,
  age int(2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tbl_user (id, username, password, salary, age) VALUES (1, 'user', '{bcrypt}$2a$10$8vLb.pIMM6tdylZkyv11sujjY0cLudF4V7V.nDvxGjR.9TYxerY96', 3456, 33);


-- user/ password