-- -----------------------------------------------------
-- Schema DbKitSaludable
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `DbKitSaludable` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci ;
USE `DbKitSaludable` ;

-- -----------------------------------------------------
-- Tabla clientes
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `DbKitSaludable`.`Clientes` (
  CL_ID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  CL_Nom varchar(45) NOT NULL,
  CL_Apellido varchar(45) NOT NULL,
  CL_Edad varchar(45) NOT NULL,
  CL_Email varchar(45) NOT NULL,
  CL_Pass varchar(45) NOT NULL,
  CL_Altura varchar(45) NOT NULL,
  CL_Peso varchar(45) NOT NULL,
  CL_Dietas_ID int(11)  NULL,
  
     INDEX fk_clientes_dietas_idx (CL_Dietas_ID) ,
	CONSTRAINT fk_dietas_comidas
    FOREIGN KEY (CL_Dietas_ID)
    REFERENCES Comidas(DT_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
) ENGINE=INNODB;

-- -----------------------------------------------------
-- Tabla dietas
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `DbKitSaludable`.`Dietas` (
  DT_ID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  DT_Nombre varchar(45) NOT NULL,
  DT_Comidas_ID int(11)  NULL,
  
   INDEX fk_dietas_comidas_idx (DT_Comidas_ID) ,
	CONSTRAINT fk_dietas_comidas
    FOREIGN KEY (DT_Comidas_ID)
    REFERENCES Comidas(CM_ID)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
) ENGINE=INNODB;

-- -----------------------------------------------------
-- Tabla comidas
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `DbKitSaludable`.`Comidas` (
  CM_ID int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  CM_Nombre varchar(45) NOT NULL,
  CM_Calorias varchar(45) NOT NULL,
  ) ENGINE=INNODB;
  
-- -----------------------------------------------------
-- SELECTS
-- -----------------------------------------------------
Select * from Clientes;