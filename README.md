# rd-java-dz13
docker run --name postgresContainer -e POSTGRES_USER=marta@gmail.com -e POSTGRES_PASSWORD=q1w2e3r4 -p 4567:5432 -d postgres

CREATE TABLE Person ( 
id SERIAL PRIMARY KEY, FirstName VARCHAR (50), LastName VARCHAR (50), Age INTEGER, Gender VARCHAR (6) );

INSERT INTO Person (firstName, lastName, age, gender) 
VALUES ('Marta', 'Kosenko', 55, 'female'),
('Marta1', 'Kosenko1', 45, 'female'),
('Dmytro', 'Shevchenko', 65, 'male'),
('Dmytro1', 'Shevchenko1', 54, 'male'),
('FirstName', 'LastName', 33, 'female');

 SELECT * from Person