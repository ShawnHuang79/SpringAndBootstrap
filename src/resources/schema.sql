CREATE TABLE User (
  id identity,
  name VARCHAR(30),
  email VARCHAR(50),
  address VARCHAR(255),
  password VARCHAR(20),
  newsletter BOOLEAN,
  framework VARCHAR(500),
  sex VARCHAR(1),
  height INTEGER,
  country VARCHAR(10),
  skill VARCHAR(500)
);

INSERT INTO User (id, name, email, framework) VALUES (0, 'jim', 'jim@gmail.com', 'Spring MVC, JSF');
INSERT INTO User (id, name, email, framework) VALUES (1, 'bill', 'bill@gmail.com', 'Spring MVC, Google Web Toolkit');
INSERT INTO User (id, name, email, framework) VALUES (2, 'coin', 'coin@gmail.com', 'Spring MVC');

