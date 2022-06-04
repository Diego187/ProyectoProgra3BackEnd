-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema chat
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema chat
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `chat` DEFAULT CHARACTER SET utf8 ;
USE `chat` ;
-- -----------------------------------------------------
-- Table `chat`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chat`.`user` (
  `idclient` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NOT NULL,
  `secund_name` VARCHAR(45) NULL,
  `first_last_name` VARCHAR(45) NOT NULL,
  `secund_last_name` VARCHAR(45) NULL,
  `telephone` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `user` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idclient`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `chat`.`channel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chat`.`channel` (
  `idchannel` INT NOT NULL AUTO_INCREMENT,
  `Description` VARCHAR(45) NULL,
  `Name` VARCHAR(45) NULL,
  PRIMARY KEY (`idchannel`))
ENGINE = InnoDB;
-- -----------------------------------------------------
-- Table `chat`.`message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `chat`.`message` (
  `idmessage` INT NOT NULL AUTO_INCREMENT,
  `date` VARCHAR(45) NULL,
  `time` VARCHAR(45) NULL,
  `message` VARCHAR(200) NULL,
  `channel_idchannel` INT NOT NULL,
  `user_idclient` INT NOT NULL,
  PRIMARY KEY (`idmessage`),
  INDEX `fk_message_channel_idx` (`channel_idchannel` ASC) VISIBLE,
  INDEX `fk_message_user1_idx` (`user_idclient` ASC) VISIBLE,
  CONSTRAINT `fk_message_channel`
    FOREIGN KEY (`channel_idchannel`)
    REFERENCES `chat`.`channel` (`idchannel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_message_user1`
    FOREIGN KEY (`user_idclient`)
    REFERENCES `chat`.`user` (`idclient`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


ALTER TABLE message
ADD user_user varchar(100);

  insert into channel (Description,Name)
  values('Canal de pruebas','QA');
        
 insert into user (first_name,secund_name,first_last_name,secund_last_name,telephone,password,user) values 
 ('Prueba','Usuario 1','a','b','1234','1','qa1'),
 ('Prueba','Usuario 2','a','b','1234','1','qa2');      
 
INSERT INTO chat.message (idmessage, `date`, `time`, message, channel_idchannel, user_idclient, user_user) VALUES
(1, '4/6/2022', '14:40', 'a', 1, 1, 'qa1'),
(2, '4/6/2022', '14:40', 'a', 1, 2, 'qa2');

 
