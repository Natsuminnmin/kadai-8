DROP TABLE IF EXISTS movies;

CREATE TABLE movies (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  director VARCHAR(20) NOT NULL,
  PRIMARY KEY(id)
);

INSERT INTO movies (name, director) VALUES ("千と千尋の神隠し", "宮崎駿");
INSERT INTO movies (name, director) VALUES ("この世界の片隅に", "片渕須直");
