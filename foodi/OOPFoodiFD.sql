 
CREATE TABLE Employee
 (
 EmpID INT NOT NULL,
 FName VARCHAR(25) NOT NULL,
 MName VARCHAR(25) NOT NULL,
 LName VARCHAR(25) NOT NULL,
 Gender CHAR (1) NOT NULL,
 Email VARCHAR(50) NOT NULL,
 Salary VARCHAR(25) NOT NULL ,
 BranchID INT NOT NULL,
 Passwordfield  VARCHAR(25) NOT NULL,
 userName VARCHAR(25) NOT NULL,
 PRIMARY KEY (EmpID)
);
UPDATE Employee SET Salary INT
 
 CREATE TABLE Customer
 (
 UserName VARCHAR(20) NOT NULL ,
 Password VARCHAR(10) NOT NULL,
 PhoneNumber INT NOT NULL,
 Address VARCHAR(25) NOT NULL,
 PRIMARY KEY (UserName)
 );

 CREATE TABLE Branch 
 (
 BranchID INT NOT NULL ,
 ManagerID INT NOT NULL,
 ContactNum INT NOT NULL,
 Location VARCHAR(25) NOT NULL,
 PRIMARY KEY (BranchID)
 );
 
CREATE TABLE Item 
(
ItemName VARCHAR(50) NOT NULL,
Price DECIMAL(4,2)  NOT NULL ,
PRIMARY KEY (ItemName)
);

CREATE TABLE OrderInfo
(
OrderID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
OrderStatusID INT NOT NULL,
CustomerUserName VARCHAR(20) NOT NULL,
BranchID INT NOT NULL,
CreatedTime TIME NOT NULL,
CreatedDate DATE NOT NULL ,
PRIMARY KEY (OrderID)
);
UPDATE OrderInfo SET OrderID AUTO_INCERMENT;

CREATE TABLE Payment
(
PaymentID INT NOT NULL GENERATED ALWAYS AS IDENTITY,
Amount DECIMAL (6,2) NOT NULL,
Method VARCHAR(45) NOT NULL,
OrderID INT NOT NULL,
PRIMARY KEY(PaymentID)
);

CREATE TABLE BranchHasItems
(
BranchID INT NOT NULL,
ItemName VARCHAR(50) NOT NULL,
PRIMARY KEY (BranchId,ItemName)
);

CREATE TABLE OrderContainItems
(
OrderID INT NOT NULL ,
ItemName VARCHAR(50) NOT NULL,
ItemQuantity INT NOT NULL,
PRIMARY KEY (OrderID,ItemName)
);

CREATE TABLE OrderStatus
(
StatusID INT NOT NULL ,
StatusTitle VARCHAR(20) NOT NULL ,
PRIMARY KEY (StatusID)
);

/*Adding Foreign Keys*/

ALTER TABLE OrderInfo
ADD FOREIGN KEY (CustomerUserName) REFERENCES Customer(UserName),
ADD FOREIGN KEY (BranchID) REFERENCES Branch(BranchID),
ADD FOREIGN KEY (OrderStatusID) REFERENCES  OrderStatus(StatusID);

ALTER TABLE Employee
ADD FOREIGN KEY (BranchID) REFERENCES Branch(BranchID);


ALTER TABLE BranchHasItems
ADD FOREIGN KEY (BranchID) REFERENCES Branch(BranchID),
ADD FOREIGN KEY (ItemName) REFERENCES Item(ItemName); 

ALTER TABLE OrderContainItems
ADD FOREIGN KEY (OrderID) REFERENCES OrderInfo(OrderID),
ADD FOREIGN KEY (ItemName) REFERENCES Item(ItemName); 

ALTER TABLE Payment
ADD FOREIGN KEY (OrderID) REFERENCES OrderInfo(OrderID);

/*Adding CHECK Constraint*/

ALTER TABLE Employee 
ADD CONSTRAINT GenderCheck CHECK(Gender='F' OR Gender='M' OR Gender='f' OR Gender='m' );

/* Insert Into Tables */

INSERT INTO branch (BranchID , ManagerID , ContactNum , Location) 
VALUES ('1', '1' ,'0526739026','Dammam' ),('2' ,'2', '0540372548', 'Khobar'),('3' ,'3' , '0567254901' , 'Qatif' ) ;


INSERT INTO employee (EmpID , FName , MName , LName, Gender,Email ,salary , BranchID,Passwordfield, userName) 
VALUES (1, 'Nasser' ,'Omar','Alotaibi', 'M','Nasser12@gmail.com','1500', 1, '1Nas@foodi','Manager1_Nasser'),
(2, 'ahmed' ,'nawaf','alharbi', 'M','ahmednawaf@hotmail.com','2000', 1,'2Ahm@foodi','Manager2_Ahmed' )  ,
(3, 'rasha' ,'Khalid','Alsindi', 'F','Rasha78@hotmail.com','2500', 1,'3Ras@foodi','Manager3_Rasha' ) ,
(4, 'noura' ,'Omar','Alsaad', 'f','noura335@hotmail.com','1000', 1,'4Nou@foodi','Emp4_Noura' ), 
(5, 'ali' ,'sami','algamdi', 'M','alisami89@gmail.com','1500', 2,'5Ali@foodi','Emp5_Ali' ) ,
(6, 'fateh' ,'amar','shami', 'M','fateh789@hotmail.com','3000', 2,'6Fat@foodi','Emp6_Fateh' ) , 
(7, 'mohammed' ,'sami ','alamry', 'M','mohammed456@hotmail.com','3000', 2,'7Moh@foodi','Emp7_Mohammed' ),
(8, 'muhannad' ,'ali','alshamry', 'M','muhannadali9@hotmail.com','2000', 2,'8Muh@foodi','Emp8_Muhannad' ),
(9, 'ghadah' ,'fahad','alkhaldi', 'F','ghadah67@gmail.com','1500', 3,'9Ghada@foodi','Emp9_Ghada' ),
(10, 'sara' ,'Omar','Alotaibi', 'F','Sara88@hotmail.com','4000', 3,'10Sara@foodi','Emp10_Sara' ),
(11, 'ward' ,'ali','Alenezi', 'F','ward@gmail.com','2000', 3,'ward234@foodi','Emp11_ward' ),
(12,'rana' ,'mohammed','almaher', 'F','ranaamoh@hotmail.com','3000', 3,'rana22moh@foodi','Emp12_rana' )
;

INSERT INTO customer (UserName,Password, PhoneNumber, Address) 
VALUES ('reem','reem1',0544890876,'Khobar'),
('lubna','lubna22',0557689967,'dammam'),
('zaianb','zainab44',0563422578,'Khobar'),
('ward','warddd67',0523411165,'Khobar'),
  ('fatema','fatema122',0589349876,'qatif'),
('nofa','nofa11',0563459865,'Khobar'), 
('masouma','masouma',0555637489,'dammam'),
('wadha','wadha77',0550511194,'khobar')
;

INSERT INTO orderstatus (StatusID , StatusTitle) 
VALUES (1,'Draft'),
(2,'Ordered'),(3,'Preparing'),(4,'Checking'),(5,'Prepared'),(6,'Delivering'),
(7,'TakenOver'),(8,'Delivered'),(9,'Picked up'),(10'Cancelld');

INSERT INTO orderinfo (OrderID , OrderStatusID , CustomerUserName, BranchID ,CreatedTime,CreatedDate) 
VALUES (1,1,'wadha',1,'14:34:45','2022-5-05' ),
(2,2,'reem',2,'16:23:55','2022-5-08');


INSERT INTO item (ItemName , price ) 
VALUES ('Double Beef Burger', 15.00 ),('Beef Burger' ,10.00 ),('Chicken Burger' ,12.00 ) ,('French Fries' ,10.00 ) ,
 ('Chicken Nuggets' ,12.00 ), ('Potato Wedges' ,10.00 ) , ('7 UP' ,8.00 ) ,
('Pepsi' ,7.00 ) ,('Orange Mirinda' ,8.00 ) 
;

INSERT INTO ordercontainitems (OrderID , ItemName , ItemQuantity) 
VALUES (1,'Beef Burger',2),
(2,'Potato Wedges',3),
(3,'Double Beef Burger',2);


INSERT INTO branchhasitems (BranchID , ItemName) 
VALUES 
(1,'Double Beef Burger'),(1,'Beef Burger'),(1,'Chicken Burger'),
(1,'French Fries'),(1,'Chicken Nuggets'),(1,'Potato Wedges'),
(1,'7 UP'),(1,'Pepsi'),(1,'Orange Mirinda'),

(2,'Double Beef Burger'),(2,'Beef Burger'),(2,'Chicken Burger'),
(2,'French Fries'),(2,'Chicken Nuggets'),(2,'Potato Wedges'),
(2,'7 UP'),(2,'Pepsi'),(2,'Orange Mirinda'),

(3,'Double Beef Burger'),(3,'Beef Burger'),(3,'Chicken Burger'),
(3,'French Fries'),(3,'Chicken Nuggets'),(3,'Potato Wedges'),
(3,'7 UP'),(3,'Pepsi'),(3,'Orange Mirinda');


INSERT INTO payment (PaymentID , Amount , Method, OrderID) 
VALUES (1,50.00,'cash',1),
(2,30.00,'Apple pay',2);

/* Add a Foreign key*/

ALTER TABLE Branch
ADD FOREIGN KEY (ManagerID) REFERENCES Employee(EmpID); 
