DROP TABLE IF EXISTS planets;
CREATE TABLE planets (
  id_planet INT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
  planet VARCHAR(64) NOT NULL
);

ALTER TABLE countries ADD COLUMN id_planet INT UNSIGNED NOT NULL AFTER id_country;

ALTER TABLE countries ADD FOREIGN KEY (id_planet) REFERENCES planets(id_planet);


INSERT INTO planets (planet) VALUES ('Terra');
INSERT INTO planets (planet) VALUES ('Saturno');
INSERT INTO planets (planet) VALUES ('Mart');

INSERT INTO countries (country, id_planet) VALUES ('Espanya', 1);
INSERT INTO countries (country, id_planet) VALUES ('Xina', 2);
INSERT INTO countries (country, id_planet) VALUES ('Korea', 5);
INSERT INTO countries (country, id_planet) VALUES ('La república dominicana', 4);
INSERT INTO countries (country, id_planet) VALUES ('Andorra', 3);

INSERT INTO cities (city, id_country) VALUES ('La Garriga', 1);
INSERT INTO cities (city, id_country) VALUES ('Les Franqueses', 3);
INSERT INTO cities (city, id_country) VALUES ('Granollers', 2);
INSERT INTO cities (city, id_country) VALUES ('Parets del Vallès', 5);
INSERT INTO cities (city, id_country) VALUES ('Mollet StaR', 4);

INSERT INTO addresses (id_user, street, id_city) VALUES (1, 'Carrer Can Xic Corder', 1);
INSERT INTO addresses (id_user, street, id_city) VALUES (1, 'Carrer calàbria', 3);
INSERT INTO addresses (id_user, street, id_city) VALUES (1, 'Can pixapí', 4);
INSERT INTO addresses (id_user, street, id_city) VALUES (2, 'Can fanga', 4);
INSERT INTO addresses (id_user, street, id_city) VALUES (2, 'Calle Aribau', 5);
INSERT INTO addresses (id_user, street, id_city) VALUES (3, 'Carrer de merda', 2);
INSERT INTO addresses (id_user, street, id_city) VALUES (3, 'Carrer mohamed elklai', 3);
INSERT INTO addresses (id_user, street, id_city) VALUES (3, 'Carrer de tapunyinmec', 2);


CREATE VIEW planet_address_count AS
SELECT planets.planet, COUNT(addresses.id_address) AS address_count
FROM planets