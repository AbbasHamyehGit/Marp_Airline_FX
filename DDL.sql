-- Active: 1671536770675@@127.0.0.1@3306@jdbc
CREATE Table OldUser(
     
    user VARCHAR(255),
    pass VARCHAR (255)

);

CREATE TABLE newuser(


   
    NewUser VARCHAR(255),
    LN VARCHAR(255),
    email VARCHAR(255),
    pass VARCHAR(255),
    Age VARCHAR(255),
    adress VARCHAR(255),
    credit VARCHAR(255),
    passCredit VARCHAR(255)
    
    );

CREATE TABLE ticket(
    ID INTEGER NOT NULL AUTO_INCREMENT,
    AIRCHRAFT VARCHAR (255),
    COUNTRY VARCHAR (255),
    DATEE VARCHAR (255),
    TicketType VARCHAR (255),
    ways VARCHAR (255),
    PRIMARY KEY (ID)

);
ALTER TABLE ticket
ALTER DATEE SET DEFAULT 'Monday,December 4:00 PM, 2022';

--@block

SELECT user, pass,NewUser,pass
CASE
    WHEN olduser.user = newuser.NewUser THEN 'The quantity is greater than 30'
    WHEN Quantity = 30 THEN 'The quantity is 30'
    ELSE 'The quantity is under 30'
END AS QuantityText
FROM olduser AND newuser;

SELECT SHA1(pass) FROM olduser;

SELECT *
FROM olduser
INNER JOIN newuser ON OldUser.user = newuser.NewUser AND OldUser.pass = newUser.pass



