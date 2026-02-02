-- DATABASE Store
-- Database designed to save store information.
-- Autor: Alexandra Santa Muñoz
-- Date: 15 jun 2023
-- Version: 1.0
-- -----------------------------------------------------
-- DATABASE STORE
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS bdStore DEFAULT CHARACTER SET utf8 ;
USE bdStore;

-- -----------------------------------------------------
-- TABLE STORE
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS store (
   stoId VARCHAR(45) PRIMARY KEY NOT NULL,
   stoIdSeller INT NULL,
   stoNameSeller VARCHAR(45) NULL,
   stoName VARCHAR(45) NULL,
   stoPhone INT NULL,
   stoAddress VARCHAR(45) NULL
  ) ENGINE = InnoDB;
-- -----------------------------------------------------
-- TABLE SUPPLIER
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS supplier (
   supId INT PRIMARY KEY NOT NULL,
   storeStoId VARCHAR(45) NOT NULL,
   supName VARCHAR(45) NULL,
  INDEX fk_supplierStore1_idx (storeStoId ASC),
  CONSTRAINT fk_supplierStore1
    FOREIGN KEY (storeStoId)
    REFERENCES store (stoId)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    ) ENGINE = InnoDB;
-- -----------------------------------------------------
-- TABLE PRODUCT
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS product (
   proId INT PRIMARY KEY NOT NULL,
   supplierSupId INT NOT NULL,
   proName VARCHAR(45) NULL,
   proPrice INT NULL,
   proQuantity INT NULL,
  INDEX fk_productSupplier1_idx (supplierSupId ASC),
  CONSTRAINT fk_productSupplier1
    FOREIGN KEY (supplierSupId)
    REFERENCES supplier (supId)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    ) ENGINE = InnoDB;

-- -----------------------------------------------------
-- TABLE CUSTOMER
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS customer (
   cusId INT PRIMARY KEY auto_increment NOT NULL,
   cusDocType VARCHAR(10) NOT NULL,
   cusDocNumber INT NOT NULL,
   storeStoId VARCHAR(45) NOT NULL,
   cusName VARCHAR(45) NOT NULL,
 UNIQUE INDEX cusDocType_UNIQUE (cusDocType ASC, cusDocNumber ASC),
  INDEX fk_customerStore1Idx (storeStoId ASC),
  CONSTRAINT fk_customerStore1
    FOREIGN KEY (storeStoId)
    REFERENCES store (stoId)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    ) ENGINE = InnoDB;
-- -----------------------------------------------------
-- TABLE SALES INVOICE
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS salesInvoice (
   salNumInvoice INT PRIMARY KEY NOT NULL,
   customerCusDocType VARCHAR(10) NOT NULL,
   customerCusDocNumber INT NOT NULL,
   productProId INT NOT NULL,
   storeStoId INT(11) NOT NULL,
   salDate DATE NULL,
   salQuantityProduct INT NULL,
  INDEX fk_salesInvoiceCustomer1_idx (customerCusDocType ASC, customerCusDocNumber ASC),
  INDEX fk_salesInvoiceProduct1_idx (productProId ASC),
  CONSTRAINT fk_salesInvoiceCustomer1
    FOREIGN KEY (customerCusDocType , customerCusDocNumber)
    REFERENCES customer (cusDocType , cusDocNumber)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT fk_salesInvoiceProduct1
    FOREIGN KEY (productProId)
    REFERENCES product (proId)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION
    ) ENGINE = InnoDB;
-- -----------------------------------------------------
-- 2. INSERT INFORMATION IN DATABASE
-- ------------------------------------------------------
-- INSERT INFORMATION IN TABLE STORE
-- -----------------------------------------------------
INSERT INTO store(stoId, stoIdSeller, stoNameSeller, stoName, stoPhone, stoAddress)
VALUES ('154860', '4258','Alexander Ramirez','Paraíso Travel','8968435','Av Condor');
-- -----------------------------------------------------
-- INSERT INFORMATION IN TABLE SUPPLIER
-- -----------------------------------------------------
INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2580','154860','Acton');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2581','154860','Maxwell');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2582','154860','Yetta');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2583','154860','Mason');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2584','154860','Kathleen');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2585','154860','Colleen');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2586','154860','Mosley');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2587','154860','Strong');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2588','154860','Fischer');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2589','154860','Maddox');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES  ('2590','154860','Travis');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2591','154860','Nicolas S');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2592','154860','Daniel P');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2593','154860','Javier O');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2594','154860','Nataly O');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2595','154860','Orlando F');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2596','154860','Aristobulo G');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2597','154860','Concha L');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2598','154860','Milu Z');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2599','154860','Mariela B');

INSERT INTO supplier(supId, storeStoId, supName)
VALUES('2600','154860', 'Nicole T');
-- -----------------------------------------------------
-- INSERT INFORMATION IN TABLE PRODUCT
-- -----------------------------------------------------
INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES('60280','2580','rice','1500','8');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60281','2581','coca cola','1200','14');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60282','2582','diapers','5500','10');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60283','2583','Sun tea','3800','7');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60284','2584','intimate soap','4500','5');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60285','2585','glass cleaner','9500','9');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60286','2586','chocolate','500','7');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60287','2587','Sugar','2500','4');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60288','2588','Nuggets','4200','1');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60289','2589','Pizza','8900','8');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60290','2590','Listerine','1300','3');

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60291','2591', 'cotton', 1.500, 2); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60292','2592', 'Cofee', 8.000, 3); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60293','2593', 'peppers', 2.000, 6); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60294','2594', 'aromatic', 1.000, 3); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60295','2595', 'beans', 5.200, 4); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60296','2596', 'orange', 1.000, 5); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60297','2597', 'garlics', 3.000, 6);

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60298','2598', 'cinnamon', 1.000, 7);

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60299','2599', 'disinfectant', 10.000, 8); 

INSERT INTO product(proId, supplierSupId, proName, proPrice, proQuantity)
VALUES ('60300','2600', 'Butter', 5.000, 9);  

-- -----------------------------------------------------
-- INSERT INFORMATION IN TABLE CUSTOMER
-- -----------------------------------------------------
INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(1,'CC','3201382','154860','Elijah Freeman');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(2,'TI','5799168','154860','Rylee Tran');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(3,'TI','5869445','154860','Amos Navarro');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(4,'CC','1708505','154860','Ainsley Bartlett');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(5,'CE','5180091','154860','Whitney Jefferson');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(6,'TI','8437994','154860','Jamal Phillips');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(7,'CC','25487589','154860','Adriana Romero');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(8,'CC','32548589','154860','Liliana Ortiz');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(9,'CE','624578954','154860','Viviana Tejada');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(10,'CC','102458758','154860','Andrea Ramirez');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(11,'TI','698578458','154860','Brandon Diaz');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(12,'TI','45689487','154860','Natalia Ramirez');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(13,'CC','45678989','154860','Alberto Naranjo');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(14,'CC','32456987','154860','Daniel Muñoz');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(15,'CC','23409864','154860','Carlos Rios');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(16,'CE','123987589','154860','Alexander Castro');

INSERT INTO customer(cusId, cusDocType, cusDocNumber, storeStoId, cusName)
VALUES(17,'TI','105487589','154860','Juan Cuesta');

-- -----------------------------------------------------
-- INSERT INFORMATION IN TABLE SALES INVOICE
-- -----------------------------------------------------
INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES ('895740','CC','3201382','60280','154860','2021-09-09','1');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895741','TI','5799168','60281','154860','2022-10-21','4');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895742','TI','5869445','60282','154860','2021-09-09','5');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895743','CE','5180091', '60283','154860','2022-10-21','2');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895744','CC','1708505','60284','154860','2021-07-22','6');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895745','TI','5799168','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895746','CC','25487589','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895747','TI','698578458','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895748','CC','45678989','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895749','TI','105487589','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895750','CC','105487349','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895751','CE','123987589','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895752','TI','5799168','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895753','TI','5799168','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895754','CE','123987589','60285','154860','2022-10-21','3');

INSERT INTO salesInvoice(salNumInvoice, customerCusDocType, customerCusDocNumber, productProId, storeStoId, salDate, salQuantityProduct)
VALUES('895755','CC','25487589','60285','154860','2022-10-21','3');


-- -----------------------------------------------------
-- 1. SQL query where you can obtain the products sold by typing the document type and document number.
-- -----------------------------------------------------
SELECT si.salNumInvoice, p.proName, si.salQuantityProduct, si.salDate
FROM salesInvoice si
JOIN product p ON si.productProId = p.proId
WHERE si.customerCusDocType = 'TI'
AND si.customerCusDocNumber = '105487589';

-- -----------------------------------------------------
-- 2.	Query products by name, which should show who or who have been your suppliers.
-- -----------------------------------------------------
SELECT proId, proName, supplierSupId, supName
FROM product, supplier
WHERE proName = 'rice'
AND supId= '2580';

-- -----------------------------------------------------
-- 3.	Create a query that allows me to see which product has been the most sold and in what quantities from highest to lowest.
-- -----------------------------------------------------
SELECT p.proName AS Producto, SUM(si.salQuantityProduct) AS TotalVendido
FROM salesInvoice si
JOIN product p ON si.productProId = p.proId
GROUP BY p.proName
ORDER BY TotalVendido DESC;

select * from salesInvoice, product

